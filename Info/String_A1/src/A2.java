public class A2 {
    public static void main(String[] args) {
        String string = "I";
        String filler = "M";

        System.out.println(mix(string, filler));
    }

    public static String mix(String string, String filler) {
        if ((filler == null) || (filler.isEmpty())) {
            return string;
        } else if (string.length() == 1) {
            return string;
        } else {
            StringBuilder filled = new StringBuilder();
            for (int i = 0; i < string.length(); i++) {
                filled.append(string.charAt(i));
                filled.append(filler.charAt(0));
            }
            return filled.toString();
        }
    }
}
