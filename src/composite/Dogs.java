package composite;

import java.util.*;

public class Dogs implements Animal {
    final private String name;
    final private List<Animal> dogs = new ArrayList<>();

    public Dogs(String name) {
        this.name = name;
    }

    public void addDog(Animal dog) {
        dogs.add(dog);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getWeight() {
        return dogs.stream().mapToDouble(Animal::getWeight).sum();
    }
}
