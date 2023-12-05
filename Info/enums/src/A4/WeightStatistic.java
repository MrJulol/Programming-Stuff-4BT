package A4;

import java.util.List;

public class WeightStatistic {
    public static <T extends HasWeight> double computeAverageWeight(List<T> list) {
        if (list == null || list.isEmpty()) {
            return 0.0;
        }
        double sum = 0;
        for (T t : list) sum += t.getWeight();
        return sum / list.size();
    }

}
