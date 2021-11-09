package week3;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static com.github.stefanbirkner.systemlambda.SystemLambda.tapSystemOut;
import static org.junit.jupiter.api.Assertions.*;

class BasicForEachLoopTest {

    @Test
    void mainWhenCalledPrintsAllWeekdays() {
        String text = null;
        try {
            text = tapSystemOut(() -> BasicForEachLoop.main(new String[0]));
        } catch (Exception e) {
            e.printStackTrace();
            fail();
        }

        String expectedText =
                "Monday\r\n" +
                "Tuesday\r\n" +
                "Wednesday\r\n" +
                "Thursday\r\n" +
                "Friday\r\n" +
                "Saturday\r\n" +
                "Sunday\r\n";

        assertEquals(expectedText, text);
    }

}