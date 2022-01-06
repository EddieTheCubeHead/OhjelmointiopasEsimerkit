package week11.innerclassexample;

import week11.innerclassexample.OuterClass.InnerClass;

public class Main {

    public static void main(String[] args) {
        OuterClass outerClass = new OuterClass("Example");

        // Sisäluokan luonti pistenotaatiolla kutsutulla new-avainsanalla. Mikäli sisäluokan luokkaa
        // ei olisi tuotu nimitilaan import-avainsanalla tiedoston alussa, voitaisiin luokkaan
        // viitata pistenotaatiolla ulkoisesta luokasta ("OuterClass.InnerClass innerClass = ...")
        InnerClass innerClass = outerClass.new InnerClass();
        // Tulostaa "Inside inner class: Example"
        System.out.println(innerClass.getMessage());
        // Tulostaa "Inside outer class: Example"
        System.out.println(outerClass.getMessage());
    }
}
