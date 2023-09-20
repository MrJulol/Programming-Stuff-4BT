public class A8 {
    public static void main(String[] args) {
        printArrow('_', 0, 9, 3);
    }

    static void printArrow(char symbol, int min, int max, int step) {
        printFirstLine(symbol, min, max, step);
        if (max % step != 0) {
            max -= 1;
        }
        for (int i = min; i <= max; i += step) {
            PrintTheLine(symbol, i);
        }
        for (int i = max - step; i >= min; i -= step) {
            PrintTheLine(symbol, i);
        }
    }

    static void printFirstLine(char symbol, int min, int max, int step) {
        System.out.println("printArrow(’" + symbol + "’, " + min + ", " + max + ", " + step + "):");
    }

    static void PrintTheLine(char symbol, int i) {
        for (int j = 0; j < i; j++) {
            System.out.print(symbol);
        }
        System.out.println();
    }
}
