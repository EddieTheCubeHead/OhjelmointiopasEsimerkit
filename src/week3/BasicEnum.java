package week3;

public class BasicEnum {

    public static void main(String[] args) {
        // Lueteltuun tyyppiin viittaaminen pistenotaatiolla
        CompassPoint compassPoint = CompassPoint.EAST;

        System.out.println("Enum value assigned was: " + compassPoint);
    }
}
