import java.util.Scanner;

public class Square {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int length = reader.nextInt();
        char a = 'A';
        char b = 'B';
        char c = '-';
        doSquare(a, b, c, length);
        reader.close();

    }

    static void doSquare(char edge, char diagonal, char filler, int length) {
        char[][] array = new char[length][length];
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                if (j == 0 | i == 0 | j == length - 1 | i == length - 1) {
                    array[i][j] = edge;
                } else if (i == j) {
                    array[i][j] = diagonal;
                    array[i][length - i - 1] = diagonal;
                    array[length - i - 1][i] = diagonal;
                } else {
                    array[i][j] = filler;
                }
            }
        }
        printSquare(array);
    }

    static void printSquare(char[][] arr) {
        for (char[] chars : arr) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(chars[j]);
            }
            System.out.println();
        }
    }
}
