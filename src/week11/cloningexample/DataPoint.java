package week11.cloningexample;

public class DataPoint implements Cloneable {

    // Tiukka Java-filosofian noudattaminen vaatisi x ja y -kenttien eristämistä
    // private-avainsanalla ja noutajien ja/tai asettajien luomista. Opas ei ota kantaa, onko tämä
    // parempi vai huonompi tapa, mutta puhtaan dataluokan tapauksessa suora julkisen muuttujan
    // luonti vähentää kirjoitettavan koodin määrää jo voi helpottaa luokan käyttöä. Tämä altistaa
    // kuitenkin herkemmälle virheiden kasautumiselle tulevaisuudessa.
    public int x;
    public int y;

    public DataPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public DataPoint clone() {
        // Matalan kopion luonti onnistuu yksinkertaisesti kutsumalla clone-metodia object-luokasta
        // Object-luokan clone-metodi voi aiheuttaa CloneNotSupportedException-vikatilan, joka
        // pitää joko nostaa eteenpäin tai käsitellä.
        try {
            return (DataPoint) super.clone();
        } catch(CloneNotSupportedException ignored) {
            System.out.println("Cloning failed because it was not supported.");
            return null;
        }
    }
}
