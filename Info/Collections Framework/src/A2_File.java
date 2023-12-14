import java.util.HashMap;
import java.util.Map;
import java.io.FileWriter;
import java.io.IOException;

public class A2_File {

    public static void main(String[] args) {
        String inputString = "HLorem ipsum dolor sit amet, consectetuer adipiscing elit. Aenean commodo";
        Map<Character, Integer> stats = makeStats(inputString);

       String filePath = "character_frequency.txt";
        try {
            printGraphToFile(stats, filePath);
            System.out.println("Character frequency graph saved to: " + filePath);
        } catch (IOException e) {
            System.err.println("Error saving to file: " + e.getMessage());
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
    private static void printGraphToFile(Map<Character, Integer> stats, String filePath) throws IOException {
        try (FileWriter writer = new FileWriter(filePath)) {
            for (Map.Entry<Character, Integer> entry : stats.entrySet()) {
                writer.write(entry.getKey() + ": ");
                for (int i = 0; i < entry.getValue(); i++) {
                    writer.write("*");
                }
                writer.write("\n");
            }
        }
    }
}
