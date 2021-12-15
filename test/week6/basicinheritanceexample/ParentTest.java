package week6.basicinheritanceexample;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class ParentTest {

    @Test
    void constructorWhenCalledThenInstanceHasDataField() {
        Parent tested = new Parent();
        Assert.assertEquals(10, tested.getDataField());
    }

}