package week4;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static com.github.stefanbirkner.systemlambda.SystemLambda.tapSystemOut;
import static org.junit.jupiter.api.Assertions.*;

class BasicFileInputOutputStreamTest {

    @Test
    public void mainWhenCalledThenStringSavedToFileAndPrinted() {
        String text = null;
        try {
            text = tapSystemOut(() -> BasicFileInputOutputStream.main(new String[0]));
        } catch (Exception e) {
            e.printStackTrace();
            fail();
        }

        assertEquals(Arrays.toString("Test".getBytes()) + "\r\n", text);
    }
}