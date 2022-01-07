package week10.genericexample;

import org.junit.jupiter.api.Test;

import static com.github.stefanbirkner.systemlambda.SystemLambda.tapSystemOut;
import static org.junit.jupiter.api.Assertions.*;

class GenericExampleTest {

    @Test
    void mainWhenCalledThenCorrectCallingClassesPrinted() {
        String expectedText = "Called from class Parent\r\nCalled from class Child\r\n";
        String text = null;
        try {
            text = tapSystemOut(() -> GenericExample.main(new String[0]));
        } catch (Exception e) {
            e.printStackTrace();
            fail();
        }

        assertEquals(expectedText, text);
    }

}