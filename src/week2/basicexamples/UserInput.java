package week2.basicexamples;

// Huomioi tarvittavien luokkien tuominen nimitilaan import-lauseella. Tämä on pakollista yleensä
// käytettäessä javan standardikirjaston tarjoamia luokkia: String on huomattava poikkeus tähän.
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class UserInput {

    public static void main(String[] args) {
        // Luodaan InputStreamReader-olio System.in -streamin ympärille muuttamaan System.in
        // tavuvirrasta merkkijonovirraksi
        InputStreamReader defaultInputReader = new InputStreamReader(System.in);

        // Luodaan BufferedReader-olio äsken luodun merkkijonovirran ympärille puskuroimaan
        // lukuoperaatio
        BufferedReader bufferedReader = new BufferedReader(defaultInputReader);

        // Luodaan Scanner-olio, joka lukee edellä luotua puskuroitua merkkijonovirtaa. Näin luodun
        // Scanner-olion nextLine-metodia voidaan nyt käyttää käyttäjäsyötteen noutamiseen.
        Scanner bufferedScanner = new Scanner(bufferedReader);

        // Käytetään uutta Scanner-oliota käyttäjän nimen kysymiseen.
        System.out.println("Please write your name: ");
        String bufferedUserInput = bufferedScanner.nextLine();
        System.out.println("Hello " + bufferedUserInput);
    }
}
