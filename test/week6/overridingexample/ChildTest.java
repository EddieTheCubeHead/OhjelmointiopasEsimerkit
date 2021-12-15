package week6.overridingexample;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ChildTest {

    @Test
    void addTextWhenCalledWithTextThenParentTextAdded() {
        Child child = new Child();
        Assert.assertEquals("TestChild", child.addText("Test"));
    }
}