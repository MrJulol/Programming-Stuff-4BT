package Bonus;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> myList = new ArrayList<>();
        ArrayList<Integer> myList4 = new ArrayList<>();
        myList.add(2);
        myList.add(3);
        myList.add(5);
        myList.add(4);
        myList.add(2);

        myList4.add(2);
        myList4.add(2);
        myList4.add(7);
        myList4.add(7);
        myList4.add(7);

        ArrayList<Integer> myList2 = new ArrayList<>(myList);
        ArrayList<Integer> myList3 = new ArrayList<>(myList);

        System.out.println(removeSmallInts(myList, 3));
        System.out.println(containsDuplicates(myList2));
        System.out.println(inEither(myList3, myList4));
        System.out.println(inBoth(myList3, myList4));
        System.out.println(mostFrequent(myList4));
    }

    public static List<Integer> removeSmallInts(List<Integer> list, int minVal) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) < minVal) list.remove(i--);
        }
        return list;
    }

    public static boolean containsDuplicates(Collection<Integer> ints) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i : ints) map.put(i, map.getOrDefault(i, 0) + 1);

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) if (entry.getValue() > 1) return true;
        return false;
    }

    public static Collection<Integer> inEither(Collection<Integer> ints1, Collection<Integer> ints2) {
        Map<Integer, Integer> treeMap = new TreeMap<Integer, Integer>();
        ArrayList<Integer> integersToReturn = new ArrayList<>();

        putIntoMap(treeMap, ints1, ints2);

        for (Map.Entry<Integer, Integer> entry : treeMap.entrySet()) {
            integersToReturn.add(entry.getKey());
        }
        return integersToReturn;
    }

    public static Collection<Integer> inBoth(Collection<Integer> ints1, Collection<Integer> ints2) {
        Map<Integer, Integer> treeMap = new TreeMap<Integer, Integer>();
        ArrayList<Integer> integersToReturn = new ArrayList<>();

        putIntoMap(treeMap, ints1, ints2);

        for (Map.Entry<Integer, Integer> entry : treeMap.entrySet()) {
            if (entry.getValue() > 1) integersToReturn.add(entry.getKey());
        }
        return integersToReturn;
    }

    public static int mostFrequent(List<Integer> ints) {
        Map<Integer, Integer> treeMap = new TreeMap<Integer, Integer>();
        int frequency = 0;
        int returnThis = 0;

        putIntoMap(treeMap, ints);

        for (Map.Entry<Integer, Integer> entry : treeMap.entrySet()) {
            if (entry.getValue() > frequency) {
                frequency = entry.getValue();
                returnThis = entry.getKey();
            }
        }
        return returnThis;
    }

    public static void putIntoMap(Map<Integer, Integer> integerMap, Collection<Integer> first, Collection<Integer> second) {
        for (int i : first) {
            integerMap.put(i, integerMap.getOrDefault(i, 0) + 1);
        }
        for (int i : second) {
            integerMap.put(i, integerMap.getOrDefault(i, 0) + 1);
        }
    }
    public static void putIntoMap(Map<Integer, Integer> integerMap, Collection<Integer> first){
        for(int i : first){
            integerMap.put(i, integerMap.getOrDefault(i, 0)+1);
        }
    }
}
