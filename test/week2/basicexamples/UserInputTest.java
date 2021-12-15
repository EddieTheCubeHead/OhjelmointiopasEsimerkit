package week2.basicexamples;

import org.junit.After;
import org.junit.jupiter.api.Test;
import week2.basicexamples.UserInput;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import static com.github.stefanbirkner.systemlambda.SystemLambda.tapSystemOut;
import static org.junit.jupiter.api.Assertions.*;

class UserInputTest {

    private final InputStream systemIn = System.in;

    protected void provideInput(String data) {
        ByteArrayInputStream testIn = new ByteArrayInputStream(data.getBytes());
        System.setIn(testIn);
    }

    @Test
    public void mainWhenGivenTwoLinesPrintsThemWithAcquisitionMethod() {
        String expectedString = "Please write your name: \r\n" +
                                "Hello Test Tester\r\n";
        String text = null;
        try {
            text = tapSystemOut(() ->
                {
                    provideInput("Test Tester");
                    UserInput.main(new String[0]);
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