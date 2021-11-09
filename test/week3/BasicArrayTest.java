package week3;

import org.junit.jupiter.api.Test;
import week3.BasicArray;

import java.util.Arrays;

import static com.github.stefanbirkner.systemlambda.SystemLambda.tapSystemOut;
import static org.junit.jupiter.api.Assertions.*;

class BasicArrayTest {

    @Test
    void mainWhenCalledThenCourseDataPrinted() {
        String text = null;
        try {
            text = tapSystemOut(() -> BasicArray.main(new String[0]));
        } catch (Exception e) {
            e.printStackTrace();
            fail();
        }

        String expectedText =
             "First entry (index 0): 'Ohjelmoinnin perusteet', year: 1\r\n" +
             "Second entry (index 1): 'Olio-ohjelmointi', year: 1\r\n" +
             "Third entry (index 2): 'Käyttöjärjestelmät', year: 2\r\n" +
             "Fourth entry (index 3): 'Web Applications', year: 3\r\n";

        assertEquals(expectedText, text);
    }
}