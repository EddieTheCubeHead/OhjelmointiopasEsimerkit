package week6;

import org.junit.jupiter.api.Test;

import static com.github.stefanbirkner.systemlambda.SystemLambda.tapSystemOut;
import static org.junit.jupiter.api.Assertions.*;

class BasicInheritanceMainTest {

    @Test
    void mainWhenCalledThenIntegerPiPrinted() {
        String text = null;
        try {
            text = tapSystemOut(() -> BasicInheritanceMain.main(new String[0]));
        } catch (Exception e) {
            e.printStackTrace();
            fail();
        }

        assertEquals("Data field: 10\r\n", text);
    }

}