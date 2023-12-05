package A2;

public class GenericSphere<T extends Number>  {

    private T xPos, yPos, radius;

    public GenericSphere(T xPos, T yPos, T radius) {
        this.xPos = xPos;
        this.yPos = yPos;
        this.radius = radius;
    }

    public T getxPos() {
        return xPos;
    }

    public void setxPos(T xPos) {
        this.xPos = xPos;
    }

    public T getyPos() {
        return yPos;
    }

    public void setyPos(T yPos) {
        this.yPos = yPos;
    }

    public T getRadius() {
        return radius;
    }

    public void setRadius(T radius) {
        this.radius = radius;
    }

    public static void main(String[] args) {
        GenericSphere<Integer> sphere = new GenericSphere<>(3, 6, 7);
        System.out.println("XPOS: " + sphere.getxPos());
        System.out.println("YPOS: " + sphere.getyPos());
        System.out.println("Radius: " + sphere.getRadius());

        GenericSphere<Double> sphere2 = new GenericSphere<>(3.5, 6.5, 7.5);
        System.out.println("XPOS: " + sphere.getxPos());
        System.out.println("YPOS: " + sphere.getyPos());
        System.out.println("Radius: " + sphere.getRadius());

//        GenericSphere<String> sphere3 = new GenericSphere<>("","","");
//        System.out.println("XPOS: " + sphere.getxPos());
//        System.out.println("YPOS: " + sphere.getyPos());
//        System.out.println("Radius: " + sphere.getRadius());
//    }
    }
}
