import Inheritance.Kaneki;
import Inheritance.Narotu;
import polymorphism.Retangle;
import polymorphism.Triangle;

public class Main {
    public static void main(String[] args) {
        Triangle triangle = new Triangle("Triangle", 10, 5);
        System.out.println(triangle.getArea());

        Retangle retangle = new Retangle("Retangle", 10, 5);
        System.out.println(retangle.getArea());
    }
}