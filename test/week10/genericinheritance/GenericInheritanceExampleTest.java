package week10.genericinheritance;

import org.junit.jupiter.api.Test;

import static com.github.stefanbirkner.systemlambda.SystemLambda.tapSystemOut;
import static org.junit.jupiter.api.Assertions.*;

class GenericInheritanceExampleTest {

    @Test
    void mainWhenCalledThenCorrectCallingClassesPrinted() {
        String expectedText = "Valid object\r\nInvalid string\r\n";
        String text = null;
        try {
            text = tapSystemOut(() -> GenericInheritanceExample.main(new String[0]));
        } catch (Exception e) {
            e.printStackTrace();
            fail();
        }

        assertEquals(expectedText, text);
    }
}