package week6.abstractexample;

import org.junit.jupiter.api.Test;

import static com.github.stefanbirkner.systemlambda.SystemLambda.tapSystemOut;
import static org.junit.jupiter.api.Assertions.*;

class CommandLineLoggerTest {

    @Test
    void logStringWhenCalledThenStringPrintedWithLoggedPrefix() {
        CommandLineLogger logger = new CommandLineLogger();
        String text = null;
        try {
            text = tapSystemOut(() -> logger.logString("Example string"));
        } catch (Exception e) {
            e.printStackTrace();
            fail();
        }

        assertEquals("LOGGED: Example string\r\n", text);
    }

}