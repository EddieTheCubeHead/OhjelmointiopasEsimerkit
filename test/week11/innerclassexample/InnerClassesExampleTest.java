package week11.innerclassexample;

import org.junit.jupiter.api.Test;

import static com.github.stefanbirkner.systemlambda.SystemLambda.tapSystemOut;
import static org.junit.jupiter.api.Assertions.*;

class InnerClassesExampleTest {

    @Test
    void acceptGivenStringThenStringPrintedToStandardOut() {
        String expectedText = "Inside inner class: Example\r\nInside outer class: Example\r\n";
        String text = null;
        try {
            text = tapSystemOut(() -> InnerClassesExample.main(new String[0]));
        } catch (Exception e) {
            e.printStackTrace();
            fail();
        }

        assertEquals(expectedText, text);
    }

}