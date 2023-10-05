package A3;

public class Cat extends Mammal{
    public Cat(int size, int age) {
        super(age, size);
    }

    public void feed(){
        System.out.println("Feeding Cat");
    }
    @Override
    public void makeSound(){
        System.out.println("Miau Miau Miau");
    }
}
