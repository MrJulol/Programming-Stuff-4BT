import java.util.Scanner;
import java.util.Random;

public class main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // !A3
        // System.out.println("Input Number1 :");
        // int num1 = reader.nextInt();
        // System.out.println("Input Number2 :");
        // int num2 = reader.nextInt();

        // int sum = num1 + num2;

        // !A2
        // if (sum >= 50) {
        // System.out.println(String.format("Number is bigger than 50: %d", sum));
        // } else {
        // System.out.println(String.format("Number is smaller than 50: %d", sum));
        // }

        // !A3
        // System.out.println("Input the number of the month:");
        // int month = reader.nextInt();
        // System.out.println(Which_Month(month));

        // !A4

        // for (int i = 0; i < 100; i++) {
        // if (i % 7 == 0) {
        // System.out.println("Bingo!");
        // continue;
        // } else if (i == 73) {
        // System.out.println("Jackpot");
        // break;
        // }

        // }

        int numbers[] = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
        for (int i = 0; i < 10; i++) {
            numbers[i] = getNumber();
        }

        reader.close();
    }

    public static int getNumber() {
        Random rand = new Random();
        int number = rand.nextInt(50);
        return number;
    }

    public static String Which_Month(int month) {
        switch (month) {
            case 1:
                return "January";
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("October");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
                break;
        }
    }
}
