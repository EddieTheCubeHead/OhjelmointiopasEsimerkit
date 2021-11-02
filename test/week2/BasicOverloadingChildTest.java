package week2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static com.github.stefanbirkner.systemlambda.SystemLambda.tapSystemOut;
import static org.junit.jupiter.api.Assertions.*;

class BasicOverloadingChildTest {

    BasicOverloadingChild child;

    @BeforeEach
    void setUp() {
        this.child = new BasicOverloadingChild();
    }

    @Test
    void printWhenCalledWithStringPrintsDataTypeAndGivenString() {
        String text = null;
        try {
            text = tapSystemOut(() -> child.print("Test string"));
        } catch (Exception e) {
            fail(Arrays.toString(e.getStackTrace()));
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