package week6;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BasicInheritanceChildTest {

    @Test
    void constructorWhenUsedThenReturnsInstanceWithDataField() {
        BasicInheritanceChild tested = new BasicInheritanceChild();
        Assert.assertEquals(10, tested.getDataField());
    }

}