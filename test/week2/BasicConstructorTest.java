package week2;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static com.github.stefanbirkner.systemlambda.SystemLambda.tapSystemOut;
import static org.junit.jupiter.api.Assertions.*;

class BasicConstructorTest {

    @Test
    void mainWhenCalledThenPrintsData() {
        String text = null;
        try {
            text = tapSystemOut(() -> BasicConstructor.main(new String[0]));
        } catch (Exception e) {
            e.printStackTrace();
            fail();
        }

        String expectedString = "1111, String data\r\n";

        assertEquals(expectedString, text);
    }

}