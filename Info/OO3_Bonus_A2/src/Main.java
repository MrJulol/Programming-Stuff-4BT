import java.util.Scanner;

public class Main {
    static Person[] persons = new Person[100];
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Prints myPrints = new Prints();
        int personCounter = 0;
        int choice = 0;
        while (true) {
            System.out.println(myPrints.choicePrintAdd());

            choice = input.nextInt();
            if (choice == 1) {
                readPerson();
                personCounter++;
            } else if (choice == 2) {
                int inputPerson
                if(personCounter == 0){
                    System.out.println(myPrints.notPerson());
                    break;
                }
                else {
                    printPerson(persons[0]);
                }
            } else {
                break;
            }
        }


    }

    private static void printPerson(Person person) {
    }

    private static void readPerson() {
        Scanner input = new Scanner(System.in);
        Prints prints = new Prints();
        System.out.println(prints.enterDetails());
        String name1 = input.next();
        String name2 = input.next();
        int day = input.nextInt();
        int month = input.nextInt();
        int year = input.nextInt();


    }

}