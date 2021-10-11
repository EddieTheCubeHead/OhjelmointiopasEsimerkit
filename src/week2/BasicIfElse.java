package week2;

public class BasicIfElse {

    // Tästä ei tarvitse välittää. Ainut tämän rivin tarkoitus on estää IDE:tä, jolla esimerkkikoodi
    // on kirjoitetta huomauttamasta if-lauseista, joiden sisällä olevan ehdon totuusarvo tiedetään
    // koodia kääntäessä.
    @SuppressWarnings("ConstantConditions")
    public static void main(String[] strings) {
        int number = 3;

        // If-lause voi esiintyä yksin, ilman else-lausetta. On huomioitava, että esimerkin vuoksi
        // tässä esimerkissä ehtolauseiden totuusarvo tiedetään jo ennalta, mutta normaalisti
        // totuusarvo muuttuisi ajon aikana.
        if (number < 0) {
            System.out.println("Number is negative.");
        }

        if (number < 3) {
            System.out.println("Number is smaller than 3.");
        // Else-lauseen yhdistäminen uuteen if-lauseeseen tuottaa niin sanotun "else if"-lauseen.
        // Tätä ei esitellä sen tarkemmin oppaassa, koska se ei ole aito avainsana, toisin kun
        // pythonin "elif", vaan ainoastaan else- ja if-lauseiden toimintatavasta johtuva Javan
        // ominaisuus.
        } else if (number < 5) {
            System.out.println("Number is bigger than 2 but smaller than 5.");
        // Viimeisen else-lauseen ehdollinen koodi ajetaan aina, jos minkään ketjun edellisen
        // lauseen ehdollista koodia ei ajettu.
        } else {
            System.out.println("Number is bigger than 4.");
        }
    }
}
