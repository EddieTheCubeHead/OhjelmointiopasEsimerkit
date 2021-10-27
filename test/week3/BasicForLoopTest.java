package week3;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static com.github.stefanbirkner.systemlambda.SystemLambda.tapSystemOut;
import static org.junit.jupiter.api.Assertions.*;

class BasicForLoopTest {

    @Test
    void mainWhenCalledThenRangeFromOneToTenPrinted() {
        String text = null;
        try {
            text = tapSystemOut(() -> BasicForLoop.main(new String[0]));
        } catch (Exception e) {
            fail(Arrays.toString(e.getStackTrace()));
        }

        String expectedText = "0\r\n1\r\n2\r\n3\r\n4\r\n5\r\n6\r\n7\r\n8\r\n9\r\n";

        assertEquals(expectedText, text);
    }
}