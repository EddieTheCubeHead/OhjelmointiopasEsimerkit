package week4;

import org.junit.After;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import static com.github.stefanbirkner.systemlambda.SystemLambda.tapSystemOut;
import static org.junit.jupiter.api.Assertions.*;

class BasicTryCatchFinallyTest {

    private final InputStream systemIn = System.in;

    protected void provideInput(String data) {
        ByteArrayInputStream testIn = new ByteArrayInputStream(data.getBytes());
        System.setIn(testIn);
    }

    @Test
    public void mainWhenGivenValidInputThenParsedNumberPrinted() {
        String expectedString = "Please give a number: " +
                                "Received number 1337\r\n" +
                                "Cleaning up...\r\n" +
                                "Thank you for using the program!\r\n";
        String text = null;
        try {
            text = tapSystemOut(() ->
            {
                provideInput("1337");
                BasicTryCatchFinally.main(new String[0]);
            });
        } catch (Exception e) {
            e.printStackTrace();
            fail();
        }
        assertEquals(expectedString, text);
    }

    @Test
    public void mainWhenGivenInvalidInputThenExceptionCaughtAndFeedbackPrinted() {
        String expectedString = "Please give a number: " +
                                "Could not convert 'invalid input' into a number!\r\n" +
                                "Cleaning up...\r\n" +
                                "Thank you for using the program!\r\n";
        String text = null;
        try {
            text = tapSystemOut(() ->
            {
                provideInput("invalid input");
                BasicTryCatchFinally.main(new String[0]);
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