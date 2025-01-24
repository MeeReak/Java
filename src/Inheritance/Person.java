package Inheritance;

public class Person {
    private String name;
    private int age;
    private String speciality;

    public Person(String name, int age, String speciality) {
        this.name = name;
        this.age = age;
        this.speciality = speciality;
    }

    public String getPerson() {
        return "Name: " + name + "\tAge: " + age + "\t\tSpeciality: " + speciality;
    }

}
