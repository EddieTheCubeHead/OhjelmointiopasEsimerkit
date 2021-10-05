package week2;

public class AccessModifierExampleSecondChild {

    // Tämä merkkijono ei näy, vaikka luokkaa käytettäisiin muualla koodissa.
    private String privateString = "Private string";

    // Tämä metodi näkyy kaikkialla koodissa.
    public boolean publicMethod() {
        return true;
    }
}
