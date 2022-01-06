package week10.iteratorexample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.ListIterator;

public class Main {

    public static void main(String[] args) {
        // Valmiiksi täytetyn ArrayList-instanssin luonti onnistuu helposti Arrays.asList-metodilla
        ArrayList<String> strings =
                new ArrayList<>(Arrays.asList("First", "Second", "Third", "Fourth"));
        ListIterator<String> stringsIterator = strings.listIterator();

        // Varmistetaan, että iteraattorissa on jäljellä alkioita hasNext-metodilla ja sen jälkeen
        // kulutetaan ensimmäinen alkio, mikäli alkio on olemassa
        if (stringsIterator.hasNext()) {
            stringsIterator.next();
        }

        // Luodaan kuluttajatulostaja ja tulostetaan listan loput alkiot kuluttajan avulla
        Printer printer = new Printer();
        stringsIterator.forEachRemaining(printer);
    }
}
