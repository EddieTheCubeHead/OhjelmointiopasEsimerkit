package addressbookexample;

import org.junit.After;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import week2.BasicUserInput;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.CharBuffer;
import java.util.Arrays;
import java.util.Scanner;

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

        String expectedText = AddressBook.menuText +
                              "Terminating the program: Thank you for using it!\r\n";

        assertEquals(expectedText, text);
    }

    @Test
    void performOperationWhenGivenInvalidNumberThenErrorPrinted() {
        String text = null;
        try {
            text = tapSystemOut(() ->
            {
                boolean termination = AddressBook.performOperation(-1, contactManager);
                assertFalse(termination);
            });
        } catch (Exception e) {
            fail(Arrays.toString(e.getStackTrace()));
        }

        String expectedText = "Unknown choice: please give a whole number between 0 and 1\r\n";
        assertEquals(expectedText, text);
    }

    @Test
    void performOperationWhenGivenOneThenAddContactFromManagerCalled() {
        boolean termination = AddressBook.performOperation(1, contactManager);
        assertFalse(termination);
        verify(this.contactManager, times(1)).addUser();
    }

    @After
    public void restoreSystemInputOutput() {
        System.setIn(systemIn);
    }

}