package week2;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static com.github.stefanbirkner.systemlambda.SystemLambda.tapSystemOut;
import static org.junit.jupiter.api.Assertions.*;

class CommentingExampleTest {

    @Test
    void main() {
        String text = null;
        try {
            text = tapSystemOut(CommentingExample::main);
        } catch (Exception e) {
            fail(Arrays.toString(e.getStackTrace()));
        }

        assertEquals("Toimii\r\n", text);
    }
}