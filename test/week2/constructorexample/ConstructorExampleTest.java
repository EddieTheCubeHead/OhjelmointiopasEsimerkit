package week2.constructorexample;

import org.junit.jupiter.api.Test;

import static com.github.stefanbirkner.systemlambda.SystemLambda.tapSystemOut;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

class ConstructorExampleTest {

    @Test
    void mainWhenCalledThenPrintsData() {
        String text = null;
        try {
            text = tapSystemOut(() -> ConstructorExample.main(new String[0]));
        } catch (Exception e) {
            e.printStackTrace();
            fail();
        }

        String expectedString = "1111, String data\r\n";

        assertEquals(expectedString, text);
    }

}