package week3.basicexamples;

import org.junit.jupiter.api.Test;

import static com.github.stefanbirkner.systemlambda.SystemLambda.tapSystemOut;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

class HashMapUsageTest {

    @Test
    void mainWhenCalledThenPrintsAllPairsCorrectly() {
        String text = null;
        try {
            text = tapSystemOut(() -> HashMapUsage.main(new String[0]));
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