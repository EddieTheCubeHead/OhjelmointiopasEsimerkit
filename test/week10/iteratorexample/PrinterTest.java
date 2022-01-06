package week10.iteratorexample;

import org.junit.jupiter.api.Test;

import static com.github.stefanbirkner.systemlambda.SystemLambda.tapSystemOut;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

class PrinterTest {

    @Test
    void acceptGivenStringThenStringPrintedToStandardOut() {
        String expectedText = "Test text\r\n";
        Printer printer = new Printer();
        String text = null;
        try {
            text = tapSystemOut(() -> printer.accept("Test text"));
        } catch (Exception e) {
            e.printStackTrace();
            fail();
        }

        assertEquals(expectedText, text);
    }
}