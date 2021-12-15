package week6.inheritancewithconstructors;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class ChildOfConstructorlessTest {

    @Test
    void constructorGivenCoordinatesThenInstanceWithCoordinatesCreated() {
        ChildOfConstructorless dataPoint = new ChildOfConstructorless(-1, 4);
        Assert.assertEquals(-1, dataPoint.getX());
        Assert.assertEquals(4, dataPoint.getY());
    }

}