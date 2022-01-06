package week10.genericinheritance;

public class StringValidator implements Validator<String> {

    @Override
    public boolean validate(String object) {
        return object.equals("Valid");
    }
}
