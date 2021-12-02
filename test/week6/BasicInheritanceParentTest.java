package week6;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class BasicInheritanceParentTest {

    @Test
    void constructorWhenCalledThenInstanceHasDataField() {
        BasicInheritanceParent tested = new BasicInheritanceParent();
        Assert.assertEquals(10, tested.getDataField());
    }

}