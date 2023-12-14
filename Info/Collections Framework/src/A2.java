import java.util.HashMap;
import java.util.Map;

public class A2 {

    public static void main(String[] args) {
        String inputString = "HLorem ipsum dolor sit amet, consectetuer adipiscing elit. Aenean commodo";
        Map<Character, Integer> stats = makeStats(inputString);
        System.out.println("Stats: ");

//        for (Map.Entry<Character, Integer> entry : stats.entrySet()) {
//            System.out.println(entry.getKey() + ": " + entry.getValue());
//        }
        for (Map.Entry<Character, Integer> entry : stats.entrySet()) {
            System.out.print(entry.getKey() + ": ");
            for (int i = 0; i < entry.getValue(); i++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    private static Map<Character, Integer> makeStats(String text) {
        Map<Character, Integer> stats = new HashMap<>();

        for (char letter : text.toCharArray()) {
            if (Character.isLetter(letter)) {
                char lowerLetter = Character.toLowerCase(letter);
                stats.put(lowerLetter, stats.getOrDefault(lowerLetter, 0) + 1);
            }
        }
        return stats;
    }
}
