import java.util.Random;
import java.util.Scanner;



public class Main {

    public enum CandyType {
        CARAMELS,
        CHOCOLATE,
        GUMMIES,
        LICORICE,
        LOLLIPOPS,
        CHEWINGGUMS,
        COTTONCANDY
    }

    public static void checkName(String input){
        for(CandyType candies : CandyType.values()){
            if(candies.name().equals(input)){
                System.out.println("Found");
                return;
            }
        }
        System.out.println("Not Found");
    }

    public static void randomCandie(){
        Random random = new Random();
        int randomNum = random.nextInt(CandyType.values().length);
        System.out.println(CandyType.values()[randomNum]);
    }

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine().toUpperCase();

        checkName(input);
        randomCandie();



    }

}