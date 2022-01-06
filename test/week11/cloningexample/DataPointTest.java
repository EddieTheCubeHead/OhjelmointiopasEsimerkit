package week11.cloningexample;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DataPointTest {

    @Test
    void cloneWhenCalledThenResultingObjectHasIdenticalFields() {
        DataPoint original = new DataPoint(3, 8);
        DataPoint clone = original.clone();
        assertEquals(original.x, clone.x);
        assertEquals(original.y, clone.y);
    }

}