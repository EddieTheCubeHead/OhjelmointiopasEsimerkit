package week3.addressbookexample;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class AddressBook {

    public static void main(String[] args) {
        InputStreamReader defaultInputReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(defaultInputReader);
        Scanner bufferedScanner =  new Scanner(bufferedReader);
        ContactManager contactManager = new ContactManager(bufferedScanner);
        AddressBookUI ui = new AddressBookUI(bufferedScanner, contactManager);

        while(ui.run());
    }
}
