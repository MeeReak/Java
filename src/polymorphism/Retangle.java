package polymorphism;

public class Retangle extends Shape{
    private double width;
    private double height;
    public Retangle(String name, double width, double height) {
        super(name);
        this.width = width;
        this.height = height;
    }

    public double getArea() {
        return width * height;
    }

}
