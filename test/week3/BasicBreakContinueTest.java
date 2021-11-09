package week3;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static com.github.stefanbirkner.systemlambda.SystemLambda.tapSystemOut;
import static org.junit.jupiter.api.Assertions.*;

class BasicBreakContinueTest {

    @Test
    void mainWhenCalledThenListsEvenNumbersFromZeroToTwenty() {
        String text = null;
        try {
            text = tapSystemOut(() -> BasicBreakContinue.main(new String[0]));
        } catch (Exception e) {
            e.printStackTrace();
            fail();
        }

        String expectedText = "2\r\n4\r\n6\r\n8\r\n10\r\n12\r\n14\r\n16\r\n18\r\n";

        assertEquals(expectedText, text);
    }

}