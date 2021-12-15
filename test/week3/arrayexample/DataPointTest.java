package week3.arrayexample;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

class DataPointTest {

    @Test
    void hasCorrectFields() {
        DataPoint testDataPoint = new DataPoint();
        assertDoesNotThrow(() -> {
            testDataPoint.courseName = "Example course";
            testDataPoint.recommendedYear = 10;
        });
    }

}