package week2.accessmodifierexample;

import org.junit.jupiter.api.Test;

import static com.github.stefanbirkner.systemlambda.SystemLambda.tapSystemOut;
import static org.junit.jupiter.api.Assertions.*;

class AccessModifierExampleTest {

    @Test
    void mainWhenCalledThenFirstClassStringPrinted() {
        String text = null;
        try {
            text = tapSystemOut(() -> AccessModifierExample.main(new String[0]));
        } catch (Exception e) {
            e.printStackTrace();
            fail();
        }

        String expectedString = new FirstClass().publicString;

        assertEquals(expectedString + "\r\n", text);
    }
}