import java.lang.Math;

public class A6 {
    public static void main(String[] args) {
        calcAll(3, 2);
    }

    static void calcAll(int num, int op) {
        switch (op) {
            case 0:
                System.out.println("Square: " + Math.pow(num, 2));
            case 1:
                System.out.println("Cubic: " + Math.pow(num, 3));
            case 2:
                System.out.println("SQRT: " + Math.sqrt(num));
        }
    }
}
