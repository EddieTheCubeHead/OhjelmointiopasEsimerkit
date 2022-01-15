package week3.addressbookexample;

import org.junit.After;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Arrays;

import static com.github.stefanbirkner.systemlambda.SystemLambda.tapSystemOut;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class AddressBookTest {

    private final InputStream systemIn = System.in;
    private ContactManager contactManager;

    protected void provideInput(String data) {
        ByteArrayInputStream testIn = new ByteArrayInputStream(data.getBytes());
        System.setIn(testIn);
    }

    @BeforeEach
    void SetUp() {
        contactManager = mock(ContactManager.class);
    }

    @Test
    void mainWhenCalledThenPerformOperationCalled() {
        String text = null;
        try {
            text = tapSystemOut(() ->
            {
                provideInput("0");
                AddressBook.main(new String[0]);
            });
        } catch (Exception e) {
            fail(Arrays.toString(e.getStackTrace()));
        }

        String expectedText = "Please choose what you want to do:\r\n" +
                              "  0: Exit program\r\n" +
                              "  1: Add a new contact\r\n" +
                              "  2: Read a contact from the book\r\n" +
                              "Please input your choice: " +
                              "Terminating the program: Thank you for using it!\r\n";

        assertEquals(expectedText, text);
    }

    @After
    public void restoreSystemInputOutput() {
        System.setIn(systemIn);
    }

}