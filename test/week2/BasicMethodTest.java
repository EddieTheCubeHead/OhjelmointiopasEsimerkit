package week2;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static com.github.stefanbirkner.systemlambda.SystemLambda.tapSystemOut;
import static org.junit.jupiter.api.Assertions.*;

class BasicMethodTest {

    @Test
    void mainWhenCalledThenHelloWorldPrinted() {
        String text = null;
        try {
            text = tapSystemOut(() -> BasicMethod.main(new String[0]));
        } catch (Exception e) {
            fail(Arrays.toString(e.getStackTrace()));
        }

        assertEquals("Hello world!\r\n", text);
    }

}