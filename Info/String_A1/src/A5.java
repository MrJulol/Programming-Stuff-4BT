public class A5 {
    public static void main(String[] args) {
        String police = "HEHE?";

        String answerIfQuestion = "IDK";
        String answerIfIDK = "AYE!";

        if(police.charAt(police.length()-1) == '?'){
            System.out.println(police+ " " + answerIfQuestion);
        } else if(police.equals(answerIfQuestion)){
            System.out.println(answerIfIDK);
        } else{
            System.out.println("...");
        }
    }
}
