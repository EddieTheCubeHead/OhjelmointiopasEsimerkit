package week3;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static com.github.stefanbirkner.systemlambda.SystemLambda.tapSystemOut;
import static org.junit.jupiter.api.Assertions.*;

class BasicDoWhileLoopTest {

    @Test
    void mainWhenCalledThenRangeFromZeroToNinePrinted() {
        String text = null;
        try {
            text = tapSystemOut(() -> BasicDoWhileLoop.main(new String[0]));
        } catch (Exception e) {
            fail(Arrays.toString(e.getStackTrace()));
        }

        String expectedText = "Inside do while loop.\r\n";

        assertEquals(expectedText, text);
    }

}