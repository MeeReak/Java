import composite.Dog;
import composite.Dogs;

public class Main {
    public static void main(String[] args) {
        Dog leo = new Dog("Leo", 10);
        Dog john = new Dog("John", 20);

        Dogs dogs = new Dogs("Husky");
        dogs.addDog(john);
        dogs.addDog(leo);
        System.out.println(dogs.getWeight());
    }
}