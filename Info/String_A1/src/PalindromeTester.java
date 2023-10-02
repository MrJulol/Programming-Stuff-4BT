public class PalindromeTester {

    public static boolean isPalindrome(String string){
        StringBuilder stringBuilder = new StringBuilder(string);
        return string.contentEquals(stringBuilder.reverse());
    }
    public static boolean isPalindromeIgnoringCase(String string){
        StringBuilder stringBuilder = new StringBuilder(string.toLowerCase());
        return string.contentEquals(stringBuilder.reverse());
    }
    public static boolean isPalindromeIgnoringNonLettersAndDigits(String string){
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < string.length(); i++) {
            if(Character.isLetterOrDigit(string.charAt(i))){
                stringBuilder.append(string.charAt(i));
            }
        }
        string = stringBuilder.toString().toLowerCase();
        StringBuilder compare = new StringBuilder(string);
        System.out.println(string);

        return string.contentEquals(compare.reverse());
    }
}
