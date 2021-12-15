package week3.basicexamples;

import org.junit.jupiter.api.Test;

import static com.github.stefanbirkner.systemlambda.SystemLambda.tapSystemOut;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

class CastingTest {

    @Test
    void mainWhenCalledThenIntegerPiPrinted() {
        String text = null;
        try {
            text = tapSystemOut(() -> Casting.main(new String[0]));
        } catch (Exception e) {
            e.printStackTrace();
            fail();
        }

        assertEquals("Pi as int: 3\r\n", text);
    }

}