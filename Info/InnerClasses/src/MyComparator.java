import java.util.ArrayList;
import java.util.Random;

public class MyComparator {
    private ArrayList<Integer> arrayList = new ArrayList<>();

    public ArrayList<Integer> getArrayList() {
        return arrayList;
    }

    public MyComparator() {
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            arrayList.add(i, random.nextInt(0,100));
        }
    }
}