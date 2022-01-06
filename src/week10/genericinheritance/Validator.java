package week10.genericinheritance;

public interface Validator<T> {
    boolean validate(T object);
}
