package week3.enumexample;

import org.junit.jupiter.api.Test;

import static com.github.stefanbirkner.systemlambda.SystemLambda.tapSystemOut;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

class MainTest {

    @Test
    void mainWhenCalledThenPrintsEast() {
        String text = null;
        try {
            text = tapSystemOut(() -> Main.main(new String[0]));
        } catch (Exception e) {
            e.printStackTrace();
            fail();
        }

        assertEquals("Enum value assigned was: EAST\r\n", text);
    }
}