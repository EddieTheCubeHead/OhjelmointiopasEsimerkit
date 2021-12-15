package week2.overloadingexample;

import org.junit.jupiter.api.Test;

import static com.github.stefanbirkner.systemlambda.SystemLambda.tapSystemOut;
import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void mainWhenCalledPrintsStringAndInt() {
        String text = null;
        try {
            text = tapSystemOut(() -> Main.main(new String[0]));
        } catch (Exception e) {
            e.printStackTrace();
            fail();
        }

        assertEquals("String: Example string\r\nint: 17\r\n", text);
    }

}