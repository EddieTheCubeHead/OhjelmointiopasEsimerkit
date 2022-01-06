package week11.anonymousclassexample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.ListIterator;
import java.util.function.Consumer;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> strings =
                new ArrayList<>(Arrays.asList("First", "Second", "Third", "Fourth"));
        ListIterator<String> stringsIterator = strings.listIterator();

        // Luodaan tulostajakuluttaja anonyymina sisäluokkana
        Consumer<String> printer = new Consumer<>() {
            @Override
            public void accept(String string) {
                System.out.println(string);
            }
        };

        // Tulostaa:
        // "First
        // Second
        // Third
        // Fourth"
        stringsIterator.forEachRemaining(printer);
    }
}
