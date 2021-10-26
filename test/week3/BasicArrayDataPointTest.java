package week3;

import org.junit.jupiter.api.Test;
import week3.BasicArrayDataPoint;

import static org.junit.jupiter.api.Assertions.*;

class BasicArrayDataPointTest {

    @Test
    void hasCorrectFields() {
        BasicArrayDataPoint testDataPoint = new BasicArrayDataPoint();
        assertDoesNotThrow(() -> {
            testDataPoint.courseName = "Example course";
            testDataPoint.recommendedYear = 10;
        });
    }

}