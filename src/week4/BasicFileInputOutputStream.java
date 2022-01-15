package week4;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class BasicFileInputOutputStream {

    public static void main(String[] args) {

        // Toteutetaan kirjoittamiselle ja lukemiselle erillinen virheenkäsittely edellisen
        // esimerkin tapaan.
        try {
            FileOutputStream fileOutputStream =
                    new FileOutputStream("BasicFileInputOutputStream.");
            fileOutputStream.write("Test".getBytes());
            fileOutputStream.close();
        } catch (IOException exception) {
            System.out.println("An exception occurred while writing the file!");
        }

        try {
            // Huomioi BufferedReader-luokan käyttämättä jättäminen
            FileInputStream fileInputStream =
                    new FileInputStream("BasicFileInputOutputStream");
            // Tavumuotoisen datan haku tiedostosta tavutaulukkoon
            byte[] fileContent = fileInputStream.readAllBytes();
            // Muutetaan taulukko tekstiksi tulostamista varten. Tämä ei tulosta tekstiä 'Test',
            // vaan kirjainten char-tyyppiset numerorepresnetaatiot. Tulostaa: '[84, 101, 115, 116]'
            System.out.println(Arrays.toString(fileContent));
        }  catch (IOException exception) {
            System.out.println("An exception occurred while reading the file!");
        }
    }
}
