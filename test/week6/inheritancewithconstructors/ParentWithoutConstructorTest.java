package week6.inheritancewithconstructors;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class ParentWithoutConstructorTest {

    @Test
    void constructorGivenNewInstanceCreatedThenCoordinatesSetToDefault() {
        ParentWithoutConstructor dataPoint = new ParentWithoutConstructor();
        Assert.assertEquals(1, dataPoint.getX());
        Assert.assertEquals(1, dataPoint.getY());
    }
}