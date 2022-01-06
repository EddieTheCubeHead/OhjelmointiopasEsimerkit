package week10.genericinheritance;

public class Main {

    public static void main(String[] args) {
        NonNullValidator<Boolean> booleanValidator = new NonNullValidator<>();
        StringValidator stringValidator = new StringValidator();
        Boolean validBoolean = false;
        String invalidString = "Invalid";
        if (booleanValidator.validate(validBoolean)) {
            System.out.println("Valid object");
        } else {
            System.out.println("Invalid object");
        }

        if (stringValidator.validate(invalidString)) {
            System.out.println("Valid string");
        } else {
            System.out.println("Invalid string");
        }
    }
}
