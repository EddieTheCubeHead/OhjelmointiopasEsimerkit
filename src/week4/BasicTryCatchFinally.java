package week4;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class BasicTryCatchFinally {

    public static void main(String[] args) {
        // Käytetään taas apuohjelmaa scannerin luomiseen
        Scanner bufferedScanner = constructScanner();
        System.out.print("Please give a number: ");

        // Haetaan parsittava numero merkkijonona: tämä ei voi vielä aiheuttaa virhetilaa
        String receivedString = bufferedScanner.nextLine();

        // Try-osion koodi kannattaa pyrkiä pitämään mahdollisimman lyhyenä, jotta vain toivotut
        // virhetilat jäävät kiinni catch-lauseessa
        try {
            int receivedNumber = Integer.parseInt(receivedString);
            System.out.println("Received number " + receivedNumber);

        // Catch-osiossa kannattaa määritellä kiinni otettavan virheen tyyppi mahdollisimman
        // tarkasti, jotta lause ei nappaisi ylimääräisiä virhetiloja
        } catch (NumberFormatException exception) {
            System.out.println("Could not convert '" + receivedString + "' into a number!");
        } finally {
            // Jaettu siivouskoodi menisi tänne
            System.out.println("Cleaning up...");
        }
        System.out.println("Thank you for using the program!");
    }

    private static Scanner constructScanner() {
        InputStreamReader defaultInputReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(defaultInputReader);
        return new Scanner(bufferedReader);
    }
}
