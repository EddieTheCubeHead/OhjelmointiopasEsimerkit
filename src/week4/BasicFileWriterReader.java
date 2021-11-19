package week4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BasicFileWriterReader {

    public static void main(String[] args) {

        // Suljetaan lukeminen ja kirjoittaminen erillisiin try-catch -rakenteisiin, jotta virheet
        // on helpointa erottaa toisistaan
        try {
            FileWriter fileWriter = new FileWriter("BasicFileWriterReader.txt");
            fileWriter.write("Test");
            fileWriter.close();
        } catch (IOException exception) {
            System.out.println("An exception occurred while writing the file!");
        }

        try {
            // Suljetaan tiedoston lukeminen BufferedReader-luokan sisään, jotta lukuoperaatio
            // voidaan suorittaa rivi kerrallaan, sen sijaan että se pitäisi suorittaa merkki
            // kerrallaan.
            FileReader fileReader = new FileReader("BasicFileWriterReader.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String fileContent = bufferedReader.readLine();
            System.out.println(fileContent);
        }  catch (IOException exception) {
            System.out.println("An exception occurred while reading the file!");
        }
    }

}
