package week10.genericexample;

// Määritellään luokan olevan geneerinen luokan "T" yli. "T" voi olla mikä tahansa luokka, mutta
// ei primitiivinen tietotyyppi
public class GenericContainer<T> {

    // "T"-parametria voi käyttää normaalin luokan tapaan geneerisen luokan rungon sisällä.
    private T object;

    public GenericContainer(T object) {
        this.object = object;
    }

    public T getObject() {
        return object;
    }

    // Metodi ottaa jonkin T:n tai T:n lapsiluokan olion, vaihtaa sen säiliön olioksi ja palauttaa
    // vanhan olion. "S"-parametri kuvastaa tämän T:n tai T:n lapsiluokan olion tyyppiä.
    //
    // On huomioitavaa, että <S extends T> on tässä tapauksessa turha ja koko tyyppiparametrin
    // käyttö voitaisiin korvata muuttamalla parametrin newObject tyyppi S-tyypistä T-tyypiksi,
    // koska Javan kääntäjä tulkitsee lapsiluokan instanssit myös kantaluokan instanssiksi.
    // Koodi on kirjoitettu tässä muodossa, jotta extends-avainsanan tyyppiparametria rajaava
    // käyttötapa saataisiin esiteltyä.
    public <S extends T> T swap(S newObject) {
        T oldObject = this.object;
        this.object = newObject;
        return oldObject;
    }
}
