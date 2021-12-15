package week2.gettersetterexample;

import org.junit.jupiter.api.Test;
import week2.gettersetterexample.Main;

import static com.github.stefanbirkner.systemlambda.SystemLambda.tapSystemOut;
import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void mainWhenCalledThenPrints2021() {
        String text = null;
        try {
            text = tapSystemOut(() -> Main.main(new String[0]));
        } catch (Exception e) {
            e.printStackTrace();
            fail();
        }

        assertEquals("2021\r\n", text);
    }
}