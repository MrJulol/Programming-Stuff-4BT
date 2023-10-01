public class A4 {
    public static void main(String[] args) {
        String string = "yootaxz";
        printSwappedYZ1(string);
        System.out.println();
        printSwappedYZ2(string);
    }

    private static void printSwappedYZ2(String string) {
        StringBuilder stringBuilder = new StringBuilder(string);
        for (int i = 0; i < string.length(); i++) {
            if(string.charAt(i) == 'y'){
                stringBuilder.setCharAt(i,'x');
            } else if (string.charAt(i)=='Y') {
                stringBuilder.setCharAt(i,'X');
            } else if (string.charAt(i)=='x') {
                stringBuilder.setCharAt(i,'y');
            } else if (string.charAt(i)=='X') {
                stringBuilder.setCharAt(i,'Y');
            }
        }
        System.out.println(stringBuilder);
    }

    private static void printSwappedYZ1(String string) {
        for (int i = 0; i < string.length(); i++) {
            if(string.charAt(i) == 'y'){
                System.out.print('x');
            } else if (string.charAt(i)=='Y') {
                System.out.print('X');
            }else if (string.charAt(i)=='x') {
                System.out.print('y');
            }
            else if (string.charAt(i)=='X') {
                System.out.print('Y');
            }else {
                System.out.print(string.charAt(i));
            }
        }
    }
}
