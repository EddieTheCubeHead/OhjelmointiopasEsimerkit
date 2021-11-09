package week2;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static com.github.stefanbirkner.systemlambda.SystemLambda.tapSystemOut;
import static org.junit.jupiter.api.Assertions.*;

class AccessModifierExampleMainTest {

    @Test
    void mainWhenCalledThenFirstClassStringPrinted() {
        String text = null;
        try {
            text = tapSystemOut(() -> AccessModifierExampleMain.main(new String[0]));
        } catch (Exception e) {
            e.printStackTrace();
            fail();
        }

        String expectedString = new AccessModifierExampleFirstChild().publicString;

        assertEquals(expectedString + "\r\n", text);
    }
}