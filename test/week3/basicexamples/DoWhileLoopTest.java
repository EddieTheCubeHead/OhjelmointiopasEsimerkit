package week3.basicexamples;

import org.junit.jupiter.api.Test;

import static com.github.stefanbirkner.systemlambda.SystemLambda.tapSystemOut;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

class DoWhileLoopTest {

    @Test
    void mainWhenCalledThenRangeFromZeroToNinePrinted() {
        String text = null;
        try {
            text = tapSystemOut(() -> DoWhileLoop.main(new String[0]));
        } catch (Exception e) {
            e.printStackTrace();
            fail();
        }

        String expectedText = "Inside do while loop.\r\n";

        assertEquals(expectedText, text);
    }

}