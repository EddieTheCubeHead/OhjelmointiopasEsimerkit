package week2.gettersetterexample;

public class Main {

    public static void main(String[] args) {
        NumberStorage getterSetter = new NumberStorage();

        // Käytetään asettajafunktiota asettamaan yksityisen positiveNumber-muuttujan arvo
        getterSetter.setPositiveNumber(2021);

        // Noudetaan yksityisen positiveNumber-muuttujan arvo noutajafunktiolla
        System.out.println(getterSetter.getPositiveNumber());
    }
}
