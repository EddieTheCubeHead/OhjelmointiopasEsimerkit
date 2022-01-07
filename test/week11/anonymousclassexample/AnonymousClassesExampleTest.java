package week11.anonymousclassexample;

import org.junit.jupiter.api.Test;

import static com.github.stefanbirkner.systemlambda.SystemLambda.tapSystemOut;
import static org.junit.jupiter.api.Assertions.*;

class AnonymousClassesExampleTest {

    @Test
    void acceptGivenStringThenStringPrintedToStandardOut() {
        String expectedText = "First\r\nSecond\r\nThird\r\nFourth\r\n";
        String text = null;
        try {
            text = tapSystemOut(() -> AnonymousClassesExample.main(new String[0]));
        } catch (Exception e) {
            e.printStackTrace();
            fail();
        }

        assertEquals(expectedText, text);
    }

}