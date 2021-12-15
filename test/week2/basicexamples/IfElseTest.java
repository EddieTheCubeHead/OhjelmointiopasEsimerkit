package week2.basicexamples;

import org.junit.jupiter.api.Test;

import static com.github.stefanbirkner.systemlambda.SystemLambda.tapSystemOut;
import static org.junit.jupiter.api.Assertions.*;

class IfElseTest {
    @Test
    void mainWhenCalledPrintsExampleString() {
        String text = null;
        try {
            text = tapSystemOut(() -> IfElse.main(new String[0]));
        } catch (Exception e) {
            e.printStackTrace();
            fail();
        }

        assertEquals("Number is bigger than 2 but smaller than 5.\r\n", text);
    }
}