package week3.basicexamples;

// Huomioi HashMap-luokan tuominen nimitilaan import-lauseella. Tämä on pakollista aina
// luokkaa käytettäessä
import java.util.HashMap;

public class HashMapUsage {

    public static void main(String[] args) {

        // ArrayList:in tapaan HashMap:in luonti samalla rivillä muuttujan määrittelyn kanssa ei
        // vaadi geneerisen tyyppimääritelmän toistamista (tässä String, String)
        HashMap<String, String> postalCodes = new HashMap<>();

        // Avain-arvo -pareja lisätään put-metodilla. Huomioi identtisten arvojen mahdollisuus.
        postalCodes.put("02100", "Espoo");
        postalCodes.put("02110", "Espoo");
        postalCodes.put("35850", "Lappeenranta");

        // Hakeminen onnistuu get-metodilla avainpohjaisesti
        // Tämä printtaa "02100: Espoo, 02110: Espoo, 35850: Lappeenranta"
        System.out.println("02100: " + postalCodes.get("02100") +
                ", 02110: " + postalCodes.get("02110") +
                ", 35850: " + postalCodes.get("35850"));

        // Poistaminen tapahtuu remove-metodilla niin ikäin avaimen avulla
        postalCodes.remove("02100");

        // Printtaa "02110: Espoo, 35850: Lappeenranta"
        System.out.println("02110: " + postalCodes.get("02110") +
                ", 35850: " + postalCodes.get("35850"));
    }
}
