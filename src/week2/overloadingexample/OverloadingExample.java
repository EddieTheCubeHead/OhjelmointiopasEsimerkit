package week2.overloadingexample;

public class OverloadingExample {

    public static void main(String[] args) {
        OverloadedPrinter printer = new OverloadedPrinter();

        // Kutsuvasta päästä nähden ei ole mahdollista nähdä ylikuormitettua metodia. Metodi
        // kutsutaan kahdesti samalla nimellä, vain annettujen argumenttien tietotyyppi eroaa.
        printer.print("Example string");
        printer.print(17);
    }
}
