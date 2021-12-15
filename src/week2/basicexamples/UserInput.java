package week2.basicexamples;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class UserInput {

    public static void main(String[] args) {
        // Luodaan InputStreamReader System.in -streamin ympärille muuttamaan System.in tavuvirrasta
        // merkkijonovirraksi
        InputStreamReader defaultInputReader = new InputStreamReader(System.in);

        // Luodaan BufferedReader äsken luodun merkkijonovirran ympärille puskuroimaan lukuoperaatio
        BufferedReader bufferedReader = new BufferedReader(defaultInputReader);

        // Luodaan Scanner, joka lukee edellä luotua puskuroitua merkkijonovirtaa. Näin luodun
        // Scanner-olion nextLine-metodia voidaan nyt käyttää käyttäjäsyötteen noutamiseen.
        Scanner bufferedScanner = new Scanner(bufferedReader);

        // Käytetään uutta Scanner-oliota käyttäjän nimen kysymiseen.
        System.out.println("Please write your name: ");
        String bufferedUserInput = bufferedScanner.nextLine();
        System.out.println("Hello " + bufferedUserInput);
    }
}
