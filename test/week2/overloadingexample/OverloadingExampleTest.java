package week2.overloadingexample;

import org.junit.jupiter.api.Test;

import static com.github.stefanbirkner.systemlambda.SystemLambda.tapSystemOut;
import static org.junit.jupiter.api.Assertions.*;

class OverloadingExampleTest {

    @Test
    void mainWhenCalledPrintsStringAndInt() {
        String text = null;
        try {
            text = tapSystemOut(() -> OverloadingExample.main(new String[0]));
        } catch (Exception e) {
            e.printStackTrace();
            fail();
        }

        assertEquals("String: Example string\r\nint: 17\r\n", text);
    }

}