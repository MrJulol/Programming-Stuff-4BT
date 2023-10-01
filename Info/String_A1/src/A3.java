public class A3 {
    public static void main(String[] args) {
        String string = "hheelo";
        System.out.println(isEveryCharcterTwice(string));
    }

    private static int isEveryCharcterTwice(String string) {
        if(string.length() %2 != 0){
            return 1;
        }
        for(int i = 1; i<string.length();i+=2){
            if(string.charAt(i) != string.charAt(i-1)){
                return -i;
            }
        }
        return 0;
    }
}
