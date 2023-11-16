public class Main {
    public static void main(String[] args) {
        String[] strings = {"1", "123", "333"};
        int[] ints1 = parseInts(strings);
        for (int i : ints1) {
            System.out.println(i);
        }
        System.out.println();
        int[] ints2 = parseInts("1", "123", "333");
        for (int i : ints2) {
            System.out.println(i);
        }
        System.out.println();
        int[] ints3 = parseInts("1", "ll23", "3", null, "99");
        for (int i : ints3) {
            System.out.println(i);
        }
        System.out.println();
        int[] ints4 = parseInts("Person", "Woman", "Men", "Camera", "TV");
        for (int i : ints4) {
            System.out.println(i);
        }
    }

    private static int[] parseInts(String... strings) {
        int[] nums = new int[strings.length];
        for (int i = 0; i < strings.length; i++) {
            try {
                nums[i] = Integer.parseInt(strings[i]);
            } catch (NumberFormatException e) {
                System.out.println("Can`t Parse String : " + i);
            }
        }
        return nums;
    }
}