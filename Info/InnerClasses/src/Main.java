import java.util.Collections;
import java.util.Comparator;

public class Main {
    static class NumberComparator2 implements Comparator<Integer> {
        @Override
        public int compare(Integer o1, Integer o2) {
            return o1 - o2;
        }
    }

    public static void main(String[] args) {
        class NumberComparator implements Comparator<Integer> {

            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        }

        MyComparator myComparator = new MyComparator();

        Collections.sort(myComparator.getArrayList(), new NumberComparator());
        Collections.sort(myComparator.getArrayList(), new NumberComparator2());
        Collections.sort(myComparator.getArrayList(), new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        });
        Collections.sort(myComparator.getArrayList(), (o1, o2) -> o1 -o2);
        for (int i : myComparator.getArrayList()) {
            System.out.println(i);
        }

    }
}