import java.util.Scanner;
import java.util.Random;

public class Erste_Übungen {
    static int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

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

        // !A5
        // research return of int arr[]
        // int numbers[] = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
        // numbers = getNumber(numbers);
        // for (int i = 0; i < numbers.length; i++) {
        // System.out.print(numbers[i]);
        // }
        // System.out.print("\n");

        // !A5 global
        printNumbersGlobal();
        reader.close();
    }

    public static int[] getNumber(int number[]) {
        Random rand = new Random();
        for (int i = 0; i < 10; i++) {
            number[i] = rand.nextInt(10);
        }
        return number;

    }

    public static void printNumbersGlobal() {
        Random rand = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(10);
            System.out.print(arr[i]);
        }
        System.out.print("\n");
    }

    public static String Which_Month(int month) {
        switch (month) {
            case 1:
                return "January";
            case 2:
                return "February";
            case 3:
                return "March";
            case 4:
                return "April";
            case 5:
                return "May";
            case 6:
                return "June";
            case 7:
                return "July";
            case 8:
                return "August";
            case 9:
                return "September";
            case 10:
                return "October";
            case 11:
                return "November";
            case 12:
                return "December";
        }
        return "Not a month";
    }
}
