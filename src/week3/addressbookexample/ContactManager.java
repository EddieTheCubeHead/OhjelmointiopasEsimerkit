package week3.addressbookexample;

import java.util.HashMap;
import java.util.Scanner;

public class ContactManager {

    private final Scanner scanner;
    private final HashMap<String, String> addressBook = new HashMap<>();

    // On helpompaa luoda koko ohjelmalle yksi Scanner-instanssi, kuin huolehtia monesta
    // instanssista. Sen vuoksi ContactManagerin rakentaja ottaa pääluokasta Scannerin
    public ContactManager(Scanner scanner) {
        this.scanner = scanner;
    }

    public void addUser() {
        System.out.print("Please give the name of the contact to add: ");
        String contactName = scanner.nextLine();
        System.out.print("Please give the number of '" + contactName + "': ");
        String number = scanner.nextLine();
        // Virheenhallinta identtisille avaimille
        if (addressBook.containsKey(contactName)) {
            System.out.println("Error: Contact '" + contactName + "' already exists!");
            return;
        }
        addressBook.put(contactName, number);
        System.out.println("Added user '" + contactName + "' with number '" + number + "'");
    }

    public void getUser() {
        System.out.print("Please input the name of the contact you want to find: ");
        String contactName = scanner.nextLine();
        String contactNumber = addressBook.get(contactName);
        // Virheenhallinta puuttuville avaimille
        if (contactNumber == null) {
            System.out.println("Could not find a contact named '" + contactName + "'.");
            return;
        }
        System.out.println("Contact '" + contactName + "', number: " + contactNumber);
    }
}
