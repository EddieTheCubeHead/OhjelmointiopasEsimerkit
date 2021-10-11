package week2;

public class BasicMethod {

    public static void main(String[] args) {

        // Luodaan uusi child-olio, josta metodia kutsutaan
        BasicMethodChild child = new BasicMethodChild();

        // Metodia kutsuttaessa on pidettävä huolta, että metodille annetaan oikean tyypin
        // argumentit. Kääntäjä ei suostu kääntämään koodia, jos metodia yritetään kutsua
        // väärän tyyppisillä argumenteilla.
        String combinedString = child.combineStrings("Hello ", "world!");

        // Tulostaa "Hello world!" ja rivinvaihdon.
        System.out.println(combinedString);
    }
}
