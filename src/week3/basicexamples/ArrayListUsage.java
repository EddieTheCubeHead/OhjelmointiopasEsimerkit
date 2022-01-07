package week3.basicexamples;

// Huomioi tarve tuoda ArrayList tiedoston nimitilaan import-avainsanalla
import java.util.ArrayList;

public class ArrayListUsage {

    public static void main(String[] args) {
        // Java osaa päätellä ArrayListin sisältämän luokan tyypin, mikäli instanssi asetetaan
        // muuttujaan, jonka täysi tyyppi on määritelty (lista + säilötty tyyppi). Tästä syystä
        // "new ArrayList<>()" ei tarvitse String-tyyppiä <>-merkkien väliin.
        ArrayList<String> entries = new ArrayList<>();

        // Lisääminen listan loppuun tapahtuu pelkällä add-metodilla
        entries.add("First");
        entries.add("Third");

        // Lisäämisoperaatioon voi lisätä alkuun indeksin, jolloin alkio lisätään kyseiseen
        // indeksiin listan lopun sijaan
        entries.add(1, "Second");

        // Printtaa "First Second Third", koska alkio "Second" lisättiin indeksiin 1
        System.out.println(entries.get(0) + " " + entries.get(1) + " " + entries.get(2));

        // Poistaminen toimii joko määrittelemällä poistettava alkio tai alkion indeksi
        entries.remove("Second");
        entries.remove(0);

        // Printtaa "Third", koska alkio "Second" ja listan ensimmäinen alkio poistettiin
        System.out.println(entries.get(0));
    }
}
