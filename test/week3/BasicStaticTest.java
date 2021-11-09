package week3;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static com.github.stefanbirkner.systemlambda.SystemLambda.tapSystemOut;
import static org.junit.jupiter.api.Assertions.*;

class BasicStaticTest {

    @Test
    void mainWhenCalledThenTestStringPrettyPrinted() {
        String text = null;
        try {
            text = tapSystemOut(() -> BasicStatic.main(new String[0]));
        } catch (Exception e) {
            e.printStackTrace();
            fail();
        }

        assertEquals("### Example string ###\r\n", text);
    }
}