package week3;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static com.github.stefanbirkner.systemlambda.SystemLambda.tapSystemOut;
import static org.junit.jupiter.api.Assertions.*;

class BasicCastingTest {

    @Test
    void mainWhenCalledThenIntegerPiPrinted() {
        String text = null;
        try {
            text = tapSystemOut(() -> BasicCasting.main(new String[0]));
        } catch (Exception e) {
            e.printStackTrace();
            fail();
        }

        assertEquals("Pi as int: 3\r\n", text);
    }

}