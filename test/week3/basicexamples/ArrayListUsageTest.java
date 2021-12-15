package week3.basicexamples;

import org.junit.jupiter.api.Test;

import static com.github.stefanbirkner.systemlambda.SystemLambda.tapSystemOut;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

class ArrayListUsageTest {

    @Test
    void mainWhenCalledThenPrintsAllEntriesAfterModifications() {
        String text = null;
        try {
            text = tapSystemOut(() -> ArrayListUsage.main(new String[0]));
        } catch (Exception e) {
            e.printStackTrace();
            fail();
        }

        String expectedText =
                "First Second Third\r\n" +
                "Third\r\n";

        assertEquals(expectedText, text);
    }

}