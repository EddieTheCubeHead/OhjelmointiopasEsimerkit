package week8.staticexample;

import org.junit.jupiter.api.Test;

import static com.github.stefanbirkner.systemlambda.SystemLambda.tapSystemOut;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

class StaticPrinterTest {

    @Test
    void prettyPrintWhenCalledThenPrintedWithEnhancements() {
        String text = null;
        String testString = "Example string";
        try {
            text = tapSystemOut(() -> StaticPrinter.prettyPrint(testString));
        } catch (Exception e) {
            e.printStackTrace();
            fail();
        }

        assertEquals("### " + testString + " ###\r\n", text);
    }

}