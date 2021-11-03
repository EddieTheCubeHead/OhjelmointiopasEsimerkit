package week3;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static com.github.stefanbirkner.systemlambda.SystemLambda.tapSystemOut;
import static org.junit.jupiter.api.Assertions.*;

class BasicFinalTest {

    @Test
    void mainWhenCalledThenPrintsTextInFinalField() {
        String text = null;
        try {
            text = tapSystemOut(() -> BasicFinal.main(new String[0]));
        } catch (Exception e) {
            fail(Arrays.toString(e.getStackTrace()));
        }

        assertEquals("Constant string data\r\n", text);
    }
}