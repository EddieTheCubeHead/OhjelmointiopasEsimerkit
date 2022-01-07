package week3.enumexample;

public class EnumExample {

    public static void main(String[] args) {
        // Lueteltuun tyyppiin viittaaminen pistenotaatiolla
        CompassPoint compassPoint = CompassPoint.EAST;

        System.out.println("Enum value assigned was: " + compassPoint);
    }
}
