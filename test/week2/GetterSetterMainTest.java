package week2;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static com.github.stefanbirkner.systemlambda.SystemLambda.tapSystemOut;
import static org.junit.jupiter.api.Assertions.*;

class GetterSetterMainTest {

    @Test
    void mainWhenCalledThenPrints2021() {
        String text = null;
        try {
            text = tapSystemOut(() -> GetterSetterMain.main(new String[0]));
        } catch (Exception e) {
            e.printStackTrace();
            fail();
        }

        assertEquals("2021\r\n", text);
    }
}