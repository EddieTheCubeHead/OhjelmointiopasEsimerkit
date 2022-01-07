package week6.serializationexample;

import org.junit.jupiter.api.Test;

import static com.github.stefanbirkner.systemlambda.SystemLambda.tapSystemOut;
import static org.junit.jupiter.api.Assertions.*;

class SerializationExampleTest {


    @Test
    void mainWhenCalledThenDataPrinted() {
        String text = null;
        try {
            text = tapSystemOut(() -> SerializationExample.main(new String[0]));
        } catch (Exception e) {
            e.printStackTrace();
            fail();
        }

        assertEquals("Data example, 10\r\n", text);
    }

}