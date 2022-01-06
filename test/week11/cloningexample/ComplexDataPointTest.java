package week11.cloningexample;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ComplexDataPointTest {

    @Test
    void cloneWhenCalledThenReturnsCloneWithNewDataPointInstance() {
        DataPoint location = new DataPoint(3, 4);
        ComplexDataPoint dataPoint = new ComplexDataPoint(1.3, 2.4, location);
        ComplexDataPoint clone = dataPoint.clone();
        assertNotEquals(location, clone.getCoordinates());
        assertEquals(dataPoint.getXVelocity(), clone.getXVelocity());
        assertEquals(dataPoint.getYVelocity(), clone.getYVelocity());
    }
}