package week2;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static com.github.stefanbirkner.systemlambda.SystemLambda.tapSystemOut;
import static org.junit.jupiter.api.Assertions.*;

class BasicIfElseTest {
    @Test
    void mainWhenCalledPrintsExampleString() {
        String text = null;
        try {
            text = tapSystemOut(() -> BasicIfElse.main(new String[0]));
        } catch (Exception e) {
            fail(Arrays.toString(e.getStackTrace()));
        }

        assertEquals("Number is bigger than 2 but smaller than 5.\r\n", text);
    }
}