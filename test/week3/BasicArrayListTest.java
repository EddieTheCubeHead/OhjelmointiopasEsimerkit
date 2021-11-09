package week3;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static com.github.stefanbirkner.systemlambda.SystemLambda.tapSystemOut;
import static org.junit.jupiter.api.Assertions.*;

class BasicArrayListTest {

    @Test
    void mainWhenCalledThenPrintsAllEntriesAfterModifications() {
        String text = null;
        try {
            text = tapSystemOut(() -> BasicArrayList.main(new String[0]));
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