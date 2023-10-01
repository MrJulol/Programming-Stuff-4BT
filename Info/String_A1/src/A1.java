public class A1 {
    public static void main(String[] args) {
        String string = "I want this in HTML";
        String arg = "i";
        System.out.println(htmlElement(arg, string));
    }

    public static String htmlElement(String arg, String string){
        if(string.isEmpty()) {
            return "Invalid input: NULL";
        }
        return switch (arg) {
            case "b" -> boldHtml(string);
            case "i" -> italicHtml(string);
            default -> "Invalid input: " + arg;
        };
    }
    public static String boldHtml(String string){
        return "<b>"+string+"</b>";
    }
    public static String italicHtml(String string){
        return "<i>"+string+"</i>";
    }
}
