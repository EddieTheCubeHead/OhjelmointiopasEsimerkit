package week10.genericexample;

import org.junit.jupiter.api.Test;
import week6.basicinheritanceexample.Child;
import week6.basicinheritanceexample.Parent;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GenericContainerTest {

    @Test
    void swapObjectGivenObjectOfChildClassThenObjectSwappedAndOriginalReturned() {
        Parent parent = new Parent();
        Child child = new Child();
        GenericContainer<Parent> container = new GenericContainer<>(parent);
        assertEquals(parent, container.swap(child));
        assertEquals(child, container.getObject());
    }

}