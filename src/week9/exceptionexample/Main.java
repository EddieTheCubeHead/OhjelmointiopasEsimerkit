package week9.exceptionexample;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        InputStreamReader defaultInputReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(defaultInputReader);
        Scanner bufferedScanner = new Scanner(bufferedReader);
        DatabaseConnection connection = new DatabaseConnection();

        System.out.println("Please input the entry you want to search: ");
        String key = bufferedScanner.nextLine();
        try {
            String entryData = connection.getEntry(key);
            System.out.println("Entry data: " + entryData);
        } catch(NoDatabaseEntryException exception) {
            System.out.println("Sorry, could not find the entry '" + key + "'");
        }
    }
}
