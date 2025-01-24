import Inheritance.Kaneki;
import Inheritance.Narotu;

public class Main {
    public static void main(String[] args) {
        Kaneki kaneki = new Kaneki("Kaneki Ken", 20, "Half Ghoul");
        Narotu narotu = new Narotu("Narotu Uzumaki", 20, "The Seventh Hokage");

        System.out.println(kaneki.getPerson());
        System.out.println();
        System.out.println(narotu.getPerson());
    }
}