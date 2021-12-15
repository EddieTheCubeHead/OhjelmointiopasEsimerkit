package week2.overloadingexample;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static com.github.stefanbirkner.systemlambda.SystemLambda.tapSystemOut;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

class OverloadedPrinterTest {

    OverloadedPrinter child;

    @BeforeEach
    void setUp() {
        this.child = new OverloadedPrinter();
    }

    @Test
    void printWhenCalledWithStringPrintsDataTypeAndGivenString() {
        String text = null;
        try {
            text = tapSystemOut(() -> child.print("Test string"));
        } catch (Exception e) {
            e.printStackTrace();
            fail();
        }

        assertEquals("String: Test string\r\n", text);
    }

    @Test
    void printWhenCalledWithIntPrintsDataTypeAndGivenString() {
        String text = null;
        try {
            text = tapSystemOut(() -> child.print(1337));
        } catch (Exception e) {
            fail(Arrays.toString(e.getStackTrace()));
        }

        assertEquals("int: 1337\r\n", text);
    }

}