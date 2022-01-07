package week2.gettersetterexample;

import org.junit.jupiter.api.Test;

import static com.github.stefanbirkner.systemlambda.SystemLambda.tapSystemOut;
import static org.junit.jupiter.api.Assertions.*;

class GetterSetterExampleTest {

    @Test
    void mainWhenCalledThenPrints2021() {
        String text = null;
        try {
            text = tapSystemOut(() -> GetterSetterExample.main(new String[0]));
        } catch (Exception e) {
            e.printStackTrace();
            fail();
        }

        assertEquals("2021\r\n", text);
    }
}