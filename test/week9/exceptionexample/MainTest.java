package week9.exceptionexample;

import org.junit.After;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import static com.github.stefanbirkner.systemlambda.SystemLambda.tapSystemOut;
import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    private final InputStream systemIn = System.in;

    protected void provideInput(String data) {
        ByteArrayInputStream testIn = new ByteArrayInputStream(data.getBytes());
        System.setIn(testIn);
    }

    @Test
    public void mainWhenGivenValidEntryThenEntryDataPrinted() {
        String expectedString = "Please input the entry you want to search: \r\n" +
                "Entry data: Lappeenranta Lahti University of Technology\r\n";
        String text = null;
        try {
            text = tapSystemOut(() ->
            {
                provideInput("LUT");
                Main.main(new String[0]);
            });
        } catch (Exception e) {
            e.printStackTrace();
            fail();
        }
        assertEquals(expectedString, text);
    }

    @Test
    public void mainWhenGivenInvalidEntryThenWarningPrinted() {
        String expectedString = "Please input the entry you want to search: \r\n" +
                "Sorry, could not find the entry 'Invalid key'\r\n";
        String text = null;
        try {
            text = tapSystemOut(() ->
            {
                provideInput("Invalid key");
                Main.main(new String[0]);
            });
        } catch (Exception e) {
            e.printStackTrace();
            fail();
        }
        assertEquals(expectedString, text);
    }

    @After
    public void restoreSystemInputOutput() {
        System.setIn(systemIn);
    }

}