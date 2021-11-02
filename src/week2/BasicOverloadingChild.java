package week2;

public class BasicOverloadingChild {

    // Ylikuormittaminen tapahtuu määrittelemällä ensimmäisenä ylikuormitettava metodi normaalisti
    public void print(String printed) {
        System.out.println("String: " + printed);
    }

    // Ylikuormituksella jo olemassa olevaa metodinimeä voidaan käyttää uudestaan, kunhan signatuuri
    // eroaa olemassa olevista signatuureista. Metodin voi ylikuormittaa kuinka monta kertaa
    // tahansa, niin kauan kun jokaisen ylikuormittavan metodin signatuuri on uniikki.
    // (signatuuri = metodin nimi + kaikkien argumenttien tietotyypit)
    public void print(int printed) {
        System.out.println("int: " + printed);
    }
}
