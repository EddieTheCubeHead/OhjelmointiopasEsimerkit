package week2.accessmodifierexample;

public class AccessModifierExample {

    public static void main(String[] strings) {

        // Luodaan instanssit molemmista aiemmista luokista. Tämä käydään seuraavassa oppaan
        // alaosiossa läpi tarkemmin.

        // Metodin sisällä määritellyt muuttujat näkyvät aina vain metodin sisälle, eivätkä täten
        // tarvitse näkyvyysmäärettä.
        FirstClass firstChild = new FirstClass();
        SecondClass secondChild = new SecondClass();

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
