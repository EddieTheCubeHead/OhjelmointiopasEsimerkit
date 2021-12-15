package week6.basicinheritanceexample;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class ChildTest {

    @Test
    void constructorWhenUsedThenReturnsInstanceWithDataField() {
        Child tested = new Child();
        Assert.assertEquals(10, tested.getDataField());
    }

}