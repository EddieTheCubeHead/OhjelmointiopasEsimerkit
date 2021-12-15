package week3.basicexamples;

import org.junit.jupiter.api.Test;

import static com.github.stefanbirkner.systemlambda.SystemLambda.tapSystemOut;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

class ForLoopTest {

    @Test
    void mainWhenCalledThenRangeFromZeroToNinePrinted() {
        String text = null;
        try {
            text = tapSystemOut(() -> ForLoop.main(new String[0]));
        } catch (Exception e) {
            e.printStackTrace();
            fail();
        }

        String expectedText = "0\r\n1\r\n2\r\n3\r\n4\r\n5\r\n6\r\n7\r\n8\r\n9\r\n";

        assertEquals(expectedText, text);
    }
}