package week3;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static com.github.stefanbirkner.systemlambda.SystemLambda.tapSystemOut;
import static org.junit.jupiter.api.Assertions.*;

class BasicStaticChildTest {

    @Test
    void prettyPrintWhenCalledThenPrintedWithEnhancements() {
        String text = null;
        String testString = "Example string";
        try {
            text = tapSystemOut(() -> BasicStaticChild.prettyPrint(testString));
        } catch (Exception e) {
            fail(Arrays.toString(e.getStackTrace()));
        }

        assertEquals("### " + testString + " ###\r\n", text);
    }

}