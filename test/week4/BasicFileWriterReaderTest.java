package week4;

import org.junit.jupiter.api.Test;

import static com.github.stefanbirkner.systemlambda.SystemLambda.tapSystemOut;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

class BasicFileWriterReaderTest {

    @Test
    public void mainWhenCalledThenStringSavedToFileAndPrinted() {
        String text = null;
        try {
            text = tapSystemOut(() -> BasicFileWriterReader.main(new String[0]));
        } catch (Exception e) {
            e.printStackTrace();
            fail();
        }

        assertEquals("Test\r\n", text);
    }
}