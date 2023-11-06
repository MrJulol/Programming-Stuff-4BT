public class z {

    public static void main(String[] args) {
        try {
            int x, y;
            x = Integer.parseInt(args[0]);
            y = Integer.parseInt(args[1]);
            System.out.println(x / y);
        } catch (final NumberFormatException e) {
            System.out.println("Not an Integer Input");
        } catch (final ArithmeticException e) {
            System.out.println("Division by zero");
        } catch (final ArrayIndexOutOfBoundsException e) {
            System.out.println("Not enough / too many Input");
        }

    }
}
