package week2;

public class AccessModifierExampleMain {

    public static void main(String[] strings) {

        // Luodaan instanssit molemmista aiemmista luokista. Tämä käydään seuraavassa oppaan
        // alaosiossa läpi tarkemmin.

        // Metodin sisällä määritellyt muuttujat näkyvät aina vain metodin sisälle, eivätkä täten
        // tarvitse näkyvyysmäärettä.
        AccessModifierExampleFirstChild firstChild = new AccessModifierExampleFirstChild();
        AccessModifierExampleSecondChild secondChild = new AccessModifierExampleSecondChild();

        // Koska tässä kysytään julkista metodia ja julkista String-instanssia, tämä toimii.
        if (secondChild.publicMethod()) {
            System.out.println(firstChild.publicString);
        }

        // Pois kommentoitu koodinpätkä, jossa sekä if-portti, että printtaus epäonnistuisivat:
        /*
        if (firstChild.privateMethod()) {
            System.out.println(secondChild.privateString)
        }
         */
    }
}
