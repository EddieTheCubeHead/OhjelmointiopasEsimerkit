package week2;

import org.junit.jupiter.api.Test;

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