package week2;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static com.github.stefanbirkner.systemlambda.SystemLambda.tapSystemOut;
import static org.junit.jupiter.api.Assertions.*;

class BasicOverloadingTest {

    @Test
    void mainWhenCalledPrintsStringAndInt() {
        String text = null;
        try {
            text = tapSystemOut(() -> BasicOverloading.main(new String[0]));
        } catch (Exception e) {
            fail(Arrays.toString(e.getStackTrace()));
        }

        assertEquals("String: Example string\r\nint: 17\r\n", text);
    }

}