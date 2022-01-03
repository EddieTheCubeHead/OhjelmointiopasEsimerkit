package week6.interfaceexample;

public class FunctionalClass implements TextProvider {

    private String text;

    public FunctionalClass(String text) {
        this.text = text;
    }

    @Override
    public String getText() {
        return text;
    }
}
