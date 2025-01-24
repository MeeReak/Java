package composite;

public class Dog implements Animal {
    final private String name;
    final private double weight;

    public Dog(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }

    @Override
    public String getName() {
        return name;
    }


    @Override
    public double getWeight() {
        return weight;
    }
}
