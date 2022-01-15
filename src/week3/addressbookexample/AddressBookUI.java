package week3.addressbookexample;

import java.util.Scanner;

public class AddressBookUI {

    Scanner scanner;
    ContactManager contactManager;
    String userPrompt = "Please choose what you want to do:" + System.lineSeparator() +
            "  0: Exit program" + System.lineSeparator() +
            "  1: Add a new contact" + System.lineSeparator() +
            "  2: Read a contact from the book" + System.lineSeparator() +
            "Please input your choice: ";

    public AddressBookUI(Scanner scanner, ContactManager contactManager) {
        this.scanner = scanner;
        this.contactManager = contactManager;
    }

    public boolean run() {
        System.out.println(userPrompt);
        int operation = Integer.parseInt(scanner.nextLine());
        switch (operation) {
            case 0:
                System.out.println("Terminating the program: Thank you for using it!");
                return false;
            case 1:
                contactManager.addUser();
                return true;
            case 2:
                contactManager.getUser();
                return true;
            default:
                System.out.println("Unknown choice: please give a whole number between 0 and 2");
                return true;
        }
    }
}
