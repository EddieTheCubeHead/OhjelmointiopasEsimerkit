package week2.basicexamples;

import org.junit.jupiter.api.Test;

import static com.github.stefanbirkner.systemlambda.SystemLambda.tapSystemOut;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

class StringUsageTest {

    @Test
    void mainWhenCalledPrintsExampleString() {
        String text = null;
        try {
            text = tapSystemOut(() -> StringUsage.main(new String[0]));
        } catch (Exception e) {
            e.printStackTrace();
            fail();
        }

        assertEquals("Example string\r\n", text);
    }
}