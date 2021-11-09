package week2;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static com.github.stefanbirkner.systemlambda.SystemLambda.tapSystemOut;
import static org.junit.jupiter.api.Assertions.*;

class BasicStringTest {

    @Test
    void mainWhenCalledPrintsExampleString() {
        String text = null;
        try {
            text = tapSystemOut(() -> BasicString.main(new String[0]));
        } catch (Exception e) {
            e.printStackTrace();
            fail();
        }

        assertEquals("Example string\r\n", text);
    }
}