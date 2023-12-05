package A4;

import java.util.ArrayList;
import java.util.Random;


public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<Testing> list = new ArrayList<>();

        for(int i = 0; i<1000;i++){
            list.add(new Testing(random.nextDouble(50.0, 200.0)));
        }

        System.out.println("Average: " +WeightStatistic.computeAverageWeight(list));

    }



}
