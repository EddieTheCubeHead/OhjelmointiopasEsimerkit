package week6.inheritancewithconstructors;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class ChildOfConstructorParentTest {

    @Test
    void constructorGivenCoordinatesThenInstanceWithCoordinatesCreated() {
        ChildOfConstructorParent dataPoint = new ChildOfConstructorParent(2, 1);
        Assert.assertEquals(4, dataPoint.getX());
        Assert.assertEquals(3, dataPoint.getY());
    }

}