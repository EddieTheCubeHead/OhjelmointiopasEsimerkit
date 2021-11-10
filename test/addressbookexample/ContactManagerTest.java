package addressbookexample;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.util.Scanner;

import static com.github.stefanbirkner.systemlambda.SystemLambda.tapSystemOut;
import static org.junit.jupiter.api.Assertions.*;

class ContactManagerTest {


    @Test
    void addUserWhenCalledPrintsUserQueriesAndAddsUser() {
        ContactManager contactManager = this.setUpWManagerWithInput("Test\r\n1\r\n");
        String text = null;
        try {
            text = tapSystemOut(contactManager::addUser);
        } catch (Exception e) {
            e.printStackTrace();
            fail();
        }

        String expectedText = "Please give the name of the contact to add: " +
                              "Please give the number of 'Test': " +
                              "Added user 'Test' with number '1'\r\n";
        assertEquals(expectedText, text);
    }

    @Test
    void getUserWhenCalledQueriesUserNameAndReturnsCorrespondingUser() {
        ContactManager contactManager = this.setUpWManagerWithInput("Test\r\n1\r\nTest");
        String text = null;
        contactManager.addUser();
        try {
            text = tapSystemOut(contactManager::getUser);
        } catch (Exception e) {
            e.printStackTrace();
            fail();
        }

        String expectedText = "Please input the name of the contact you want to find: " +
                              "Contact 'Test', number: 1\r\n";
        assertEquals(expectedText, text);
    }

    @Test
    void addUserWhenCalledAddsUserToContactHashMap() {
        ContactManager contactManager = this.setUpWManagerWithInput("Test\r\n1\r\nTest");
        String text = null;
        contactManager.addUser();
        try {
            text = tapSystemOut(contactManager::getUser);
        } catch (Exception e) {
            e.printStackTrace();
            fail();
        }

        String expectedText = "Please input the name of the contact you want to find: " +
                              "Contact 'Test', number: 1\r\n";
        assertEquals(expectedText, text);
    }

    @Test
    void addUserWhenUserExistsPrintsErrorMessage() {
        ContactManager contactManager = this.setUpWManagerWithInput("Test\r\n1\r\nTest\r\n2");
        String text = null;
        contactManager.addUser();
        try {
            text = tapSystemOut(contactManager::addUser);
        } catch (Exception e) {
            e.printStackTrace();
            fail();
        }

        String expectedText = "Please give the name of the contact to add: " +
                              "Please give the number of 'Test': " +
                              "Error: Contact 'Test' already exists!\r\n";
        assertEquals(expectedText, text);
    }

    @Test
    void getUserWhenCalledWithUserThatDoesntExistPrintsErrorMessage() {
        ContactManager contactManager = this.setUpWManagerWithInput("Test");
        String text = null;
        try {
            text = tapSystemOut(contactManager::getUser);
        } catch (Exception e) {
            e.printStackTrace();
            fail();
        }

        String expectedText = "Please input the name of the contact you want to find: " +
                              "Could not find a contact named 'Test'.\r\n";
        assertEquals(expectedText, text);
    }

    private ContactManager setUpWManagerWithInput(String input) {
        Scanner scanner = new Scanner(new ByteArrayInputStream(input.getBytes()));
        return new ContactManager(scanner);
    }

}