public class DivisionExceptionExample {

    public static class DivisionException extends Exception {
        public DivisionException(String message, Throwable cause) {
            super(message, cause);
        }
    }

    public static double divideNumbers(int a, int b) throws DivisionException {
        try {
            return a / b;
        } catch (ArithmeticException e) {
            throw new DivisionException("Division by zero not allowed", e);
        }
    }

    public static void main(String[] args) {
        try {
            int a = 10;
            int b = 0;
            double c = divideNumbers(a, b);
            System.out.println("Result: " + c);
        } catch (DivisionException e) {
            System.out.println("Caught DivisionException:");
            e.printStackTrace();
        }
    }
}
