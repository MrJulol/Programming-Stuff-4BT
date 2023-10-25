package A3;

public class Dog extends Mammal{
    String breed;

    public Dog(int size, int age, String breed) {
        super(size, age);
        this.breed = breed;
    }
    public void pet(){
        System.out.println("Petting " + breed);
    }
    @Override
    public void makeSound(){
        System.out.println("Bark Bark Bark");
    }
}
