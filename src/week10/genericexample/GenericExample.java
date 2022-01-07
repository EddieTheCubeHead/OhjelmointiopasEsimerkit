package week10.genericexample;

import week6.overridingexample.Child;
import week6.overridingexample.Parent;

public class GenericExample {

    public static void main(String[] args) {
        Parent parent = new Parent();
        Child child = new Child();
        // Huomioi tyyppiparametrin puuttuminen new-kutsusta.
        GenericContainer<Parent> container = new GenericContainer<>(parent);
        // swap-metodi ei tarvitse tyyppiparametria, sillä kääntäjä tulkitsee sen tyypin child-
        // muuttujan tyypistä.
        Parent stored = container.swap(child);
        System.out.println(stored.addText("Called from class "));
        System.out.println(container.getObject().addText("Called from class "));
    }
}
