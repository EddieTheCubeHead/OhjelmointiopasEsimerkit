package week6.inheritancewithconstructors;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ParentWithConstructorTest {

    @Test
    void constructorGivenParametersThenParametersSaved() {
        ParentWithConstructor dataPoint = new ParentWithConstructor(2, 3);
        Assert.assertEquals(2, dataPoint.getX());
        Assert.assertEquals(3, dataPoint.getY());
    }

}