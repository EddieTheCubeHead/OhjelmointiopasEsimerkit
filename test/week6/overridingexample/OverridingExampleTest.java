package week6.overridingexample;

import org.junit.jupiter.api.Test;

import static com.github.stefanbirkner.systemlambda.SystemLambda.tapSystemOut;
import static org.junit.jupiter.api.Assertions.*;

class OverridingExampleTest {

    @Test
    void mainWhenCalledThenPrintsEast() {
        String text = null;
        try {
            text = tapSystemOut(() -> OverridingExample.main(new String[0]));
        } catch (Exception e) {
            e.printStackTrace();
            fail();
        }

        assertEquals("Called from Parent\r\nCalled from Child\r\n", text);
    }
}