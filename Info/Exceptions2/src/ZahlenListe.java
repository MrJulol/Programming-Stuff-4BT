import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ZahlenListe {
    private ArrayList<Integer> zahlen;

    public ZahlenListe() {
        this.zahlen = new ArrayList<>();
    }

    public void zahlHinzufügen(int number) {
        assert number >= 0 : "Not a valid number";
        this.zahlen.add(number);
        Collections.sort(this.zahlen, (o1, o2) -> o1 - o2);
        assert checkSorted(this.zahlen) : "Not Sorted";

    }
    public void zahlEntfernen(int index) {
        assert index <= this.zahlen.size() && index >= 0 : "not valid index";
        int number = this.zahlen.get(index);
        assert number >= 0 : "Not a valid number";
        this.zahlen.remove(index);
        Collections.sort(this.zahlen, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        });
        assert checkSorted(this.zahlen) : "Not Sorted";
    }
    public void printList() {
        for (int i : this.zahlen) {
            System.out.print(i + "\t");
        }
        System.out.println();
    }
    private boolean checkSorted(ArrayList<Integer> arr) {
        boolean ascending = true;
        for (int i = 1; i < arr.size() && ascending; i++) {
            ascending = ascending && arr.get(i) >= arr.get(i - 1);
        }
        return ascending;
    }


    public static void main(String[] args) {
        ZahlenListe zahlenListe = new ZahlenListe();
        zahlenListe.zahlHinzufügen(3);
        zahlenListe.printList();
        zahlenListe.zahlHinzufügen(2);
        zahlenListe.printList();
        zahlenListe.zahlHinzufügen(1);
        zahlenListe.printList();
        zahlenListe.zahlEntfernen(1);
        zahlenListe.printList();
        zahlenListe.zahlEntfernen(1);
        zahlenListe.printList();
    }

}
