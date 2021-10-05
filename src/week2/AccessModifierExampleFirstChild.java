package week2;

public class AccessModifierExampleFirstChild {

    // Tämä merkkijono näkyy, kun luokkaa käytetään muualla koodissa.
    public String publicString = "Public string";

    // Tämä metodi ei näy muualla koodissa.
    private boolean privateMethod() {
        return true;
    }
}
