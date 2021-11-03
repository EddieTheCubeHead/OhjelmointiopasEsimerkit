package week3;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static com.github.stefanbirkner.systemlambda.SystemLambda.tapSystemOut;
import static org.junit.jupiter.api.Assertions.*;

class BasicEnumTest {

    @Test
    void mainWhenCalledThenPrintsEast() {
        String text = null;
        try {
            text = tapSystemOut(() -> BasicEnum.main(new String[0]));
        } catch (Exception e) {
            fail(Arrays.toString(e.getStackTrace()));
        }

        assertEquals("Enum value assigned was: EAST\r\n", text);
    }
}