package week2.basicexamples;

import org.junit.jupiter.api.Test;
import week2.basicexamples.HelloWorld;

import static com.github.stefanbirkner.systemlambda.SystemLambda.tapSystemOut;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

class HelloWorldTest {

    @Test
    void mainWhenCalledPrintsHelloWorld() {
        String text = null;
        try {
            text = tapSystemOut(() -> HelloWorld.main(new String[0]));
        } catch (Exception e) {
            e.printStackTrace();
            fail();
        }

        assertEquals("Hello world!\r\n", text);
    }
}