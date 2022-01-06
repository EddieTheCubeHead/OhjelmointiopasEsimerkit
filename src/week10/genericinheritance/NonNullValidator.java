package week10.genericinheritance;

public class NonNullValidator<T> implements Validator<T> {

    @Override
    public boolean validate(T object) {
        return object != null;
    }
}
