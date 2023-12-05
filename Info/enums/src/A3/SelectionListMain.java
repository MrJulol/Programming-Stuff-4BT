package A3;


public class SelectionListMain {


    public static void main(String[] args) {
        SelectionList<Integer> list = new SelectionList<>();
        list.addLeft(3);
        list.addRight(4);


        System.out.println("Num of Elements: " + list.getTotalCount());
        System.out.println(list);

        list.addRight(5);

        System.out.println("Num of Elements: " + list.getTotalCount());
        System.out.println(list);


        try {
            list.moveLeft(5);
        } catch (selectionListException e) {
            System.out.println("Error: Element not found!");
            System.exit(1);
//            throw new RuntimeException(e);
        }

        System.out.println("Num of Elements: " + list.getTotalCount());

        System.out.println(list);

    }
}
