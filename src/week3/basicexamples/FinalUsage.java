package week3.basicexamples;

public class FinalUsage {

    // Vakioarvon määrittäminen tapahtuu yleensä määreillä "public static final" Tällöin vakio on
    // nähtävissä kaikkialla koodissa. Luokan sisäisissä vakioissa public-määre korvataan
    // private-määreellä.
    public static final String constantString = "Constant string data";

    public static void main(String[] args) {
        // Seuraava rivi ei kompiloi, koska final-kenttää yritetään muokata
        /* constantString = "Changed string data"; */

        System.out.println(constantString);
    }
}