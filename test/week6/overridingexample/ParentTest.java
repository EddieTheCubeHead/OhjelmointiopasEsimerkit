package week6.overridingexample;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ParentTest {

    @Test
    void addTextWhenCalledWithTextThenParentTextAdded() {
        Parent parent = new Parent();
        Assert.assertEquals("TestParent", parent.addText("Test"));
    }
}