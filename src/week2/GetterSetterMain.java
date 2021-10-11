package week2;

public class GetterSetterMain {

    public static void main(String[] args) {
        GetterSetterChild getterSetter = new GetterSetterChild();

        // Käytetään asettajafunktiota asettamaan yksityisen positiveNumber-muuttujan arvo
        getterSetter.setPositiveNumber(2021);

        // Noudetaan yksityisen positiveNumber-muuttujan arvo noutajafunktiolla
        System.out.println(getterSetter.getPositiveNumber());
    }
}
