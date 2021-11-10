package addressbookexample;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class AddressBook {

    public static void main(String[] args) {
        // Scannerin rakentamisen eristäminen metodiin antaa muokata scanner-implementaatiota
        // tulevaisuudessa ja tekee pääohjelmasta luettavamman
        Scanner bufferedScanner = constructScanner();
        ContactManager contactManager = new ContactManager(bufferedScanner);

        // Eristämällä operaatiovalinta boolean-paluuarvon omaavaan metodiin, voidaan ohjelman
        // päälooppi yksinkertaistaa pelkkään ohjeiden printtaamiseen do - while -loopilla ja
        // aliohjelman ajamiseen toistoehdossa
        do {
            System.out.print("Please choose what you want to do:\r\n" +
                             "  0: Exit program\r\n" +
                             "  1: Add a new contact\r\n" +
                             "  2: Read a contact from the book\r\n" +
                             "Please input your choice: ");
        } while (!performOperation(Integer.parseInt(bufferedScanner.nextLine()), contactManager));
    }

    // Tämä metodi on vastuussa ohjelman logiikasta. Se saa päämetodista numeron ja ContactManager-
    // instanssin ja kutsuu numeron perusteella instanssin metodeja
    static boolean performOperation(int operation, ContactManager contactManager) {
        switch (operation) {
            case 0:
                System.out.println("Terminating the program: Thank you for using it!");
                return true;
            case 1:
                contactManager.addUser();
                return false;
            case 2:
                contactManager.getUser();
                return false;
            default:
                System.out.println("Unknown choice: please give a whole number between 0 and 2");
                return false;
        }
    }

    // Apuohjelma Scannerin luomiseen
    private static Scanner constructScanner() {
        InputStreamReader defaultInputReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(defaultInputReader);
        return new Scanner(bufferedReader);
    }
}
