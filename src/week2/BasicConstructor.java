package week2;

public class BasicConstructor {

    public static void main(String[] args) {
        BasicConstructorChild dataPoint =
                new BasicConstructorChild(1111, "String data");

        System.out.println(dataPoint.intData + ", " + dataPoint.stringData);
    }
}
