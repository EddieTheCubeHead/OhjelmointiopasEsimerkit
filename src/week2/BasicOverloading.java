package week2;

public class BasicOverloading {

    public static void main(String[] args) {
        BasicOverloadingChild printer = new BasicOverloadingChild();

        // Kutsuvasta päästä nähden ei ole mahdollista nähdä ylikuormitettua metodia. Metodi
        // kutsutaan kahdesti samalla nimellä, vain annettujen argumenttien tietotyyppi eroaa.
        printer.print("Example string");
        printer.print(17);
    }
}
