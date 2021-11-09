package week3;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static com.github.stefanbirkner.systemlambda.SystemLambda.tapSystemOut;
import static org.junit.jupiter.api.Assertions.*;

class BasicHashMapTest {

    @Test
    void mainWhenCalledThenPrintsAllPairsCorrectly() {
        String text = null;
        try {
            text = tapSystemOut(() -> BasicHashMap.main(new String[0]));
        } catch (Exception e) {
            e.printStackTrace();
            fail();
        }

        String expectedText =
                "02100: Espoo, 02110: Espoo, 35850: Lappeenranta\r\n" +
                "02110: Espoo, 35850: Lappeenranta\r\n";

        assertEquals(expectedText, text);
    }

}