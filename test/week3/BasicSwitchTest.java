package week3;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static com.github.stefanbirkner.systemlambda.SystemLambda.tapSystemOut;
import static org.junit.jupiter.api.Assertions.*;

class BasicSwitchTest {

    @Test
    void mainWhenCalledThenLaudablePrinted() {
        String text = null;
        try {
            text = tapSystemOut(() -> BasicSwitch.main(new String[0]));
        } catch (Exception e) {
            e.printStackTrace();
            fail();
        }

        assertEquals("Laudable\r\n", text);
    }

}