package week6.overridingexample;

public class Child extends Parent {
    // Metodia korvattaessa on tärkeää huolehtia, että korvaavan metodin signatuuri on identtinen
    // suhteessa korvattavaan metodiin. Koska signatuuri huomioi vain argumenttien tietotyypit,
    // voi argumenttien nimeä vaihtaa vapaasti.
    //
    // @Override-ei ole pakollinen ylikirjoitettaessa kantaluokan metodia, mutta sen käyttäminen
    // helpottaa luettavuutta ja varmistaa että ohjelmisto ei kirjoitusvirheen vuoksi määrittele
    // uutta metodia, vaan antaa kääntäjävirheen virheellisesti ylikirjoitetusta metodista. Oppaan
    // koodiesimerkit käyttävät aina @Override-attribuuttia metodia ylikirjoitettaessa.
    @Override
    public String addText(String childText) {
        return childText + "Child";
    }
}
