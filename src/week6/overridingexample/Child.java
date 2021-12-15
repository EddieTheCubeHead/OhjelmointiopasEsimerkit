package week6.overridingexample;

public class Child extends Parent {
    // Metodia korvattaessa on tärkeää huolehtia, että korvaavan metodin signatuuri on identtinen
    // suhteessa korvattavaan metodiin. Koska signatuuri huomioi vain argumenttien tietotyypit,
    // voi argumenttien nimeä vaihtaa vapaasti.
    public String addText(String childText) {
        return childText + "Child";
    }
}
