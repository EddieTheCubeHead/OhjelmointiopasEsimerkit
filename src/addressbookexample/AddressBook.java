package addressbookexample;

import week3.CompassPoint;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class AddressBook {

    public static String menuText = "Please choose what you want to do:\r\n" +
                                    "  0: Exit program\r\n" +
                                    "Please input your choice: ";

    public static void main(String[] args) {
        Scanner bufferedScanner = constructScanner();
        ContactManager contactManager = new ContactManager(bufferedScanner);

        do {
            System.out.print(menuText);
        } while (!performOperation(bufferedScanner.nextInt(), contactManager));
    }

    static boolean performOperation(int operation, ContactManager contactManager) {
        switch (operation) {
            case 0:
                System.out.println("Terminating the program: Thank you for using it!");
                return true;
            case 1:
                contactManager.addUser();
                return false;
            default:
                System.out.println("Unknown choice: please give a whole number between 0 and 1");
                return false;
        }
    }

    private static Scanner constructScanner() {
        InputStreamReader defaultInputReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(defaultInputReader);
        return new Scanner(bufferedReader);
    }
}
