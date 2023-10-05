package A1;

public class Main {
    public static void main(String[] args) {
        ExtendedPath path = new ExtendedPath();
        Point p1 = new Point(0,0);
        Point p2 = new Point(4,4);
        path.addPoint(p1);
        path.addPoint(p2);
        System.out.println(path.lenght());
    }
}