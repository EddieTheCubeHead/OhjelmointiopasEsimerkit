package week2.basicexamples;

import org.junit.jupiter.api.Test;

import static com.github.stefanbirkner.systemlambda.SystemLambda.tapSystemOut;
import static org.junit.jupiter.api.Assertions.*;

class CommentingTest {

    @Test
    void mainWhenCalledPrintsThisWorks() {
        String text = null;
        try {
            text = tapSystemOut(() -> Commenting.main(new String[0]));
        } catch (Exception e) {
            e.printStackTrace();
            fail();
        }

        assertEquals("This works\r\n", text);
    }
}