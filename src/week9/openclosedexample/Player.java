package week9.openclosedexample;

// Mikäli pelaaja olisi vain yksinkertainen dataluokka, voitaisiin x ja y paljastaa julkisiksi
// muuttujiksi. Koska oletettavasti kuitenkin pelaajan toiminnallisuuksia halutaan laajentaa
// tulevaisuudessa, on esimerkissä kyseiset muuttujat eristetty oikeaoppisen hakija-noutaja-mallin
// taakse. Tämä mahdollistaa esimerkiksi helpomman pelaajan liikkumisen rajaamisen tulevaisuudessa.
public class Player {

    private int x;
    private int y;

    public Player(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getX() {
        return x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getY() {
        return y;
    }
}
