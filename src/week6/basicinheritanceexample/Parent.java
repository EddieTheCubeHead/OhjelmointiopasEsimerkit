package week6.basicinheritanceexample;

// Raa'an kantaluokan ei tarvitse tietää, että siitä periytyy luokkia. Täten kantaluokan määritelmä
// voi yksinkertaisimillaan näyttää täysin normaalilta luokalta. Tämä tarkoittaa myös, että
// periyttäminen voidaan tehdä luokasta, jota ei ole kirjoitettu alun perin kantaluokaksi
public class Parent {
    private int dataField = 10;

    public int getDataField() {
        return dataField;
    }
}
