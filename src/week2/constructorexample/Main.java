package week2.constructorexample;

public class Main {

    public static void main(String[] args) {
        ClassWithConstructor dataPoint =
                new ClassWithConstructor(1111, "String data");

        System.out.println(dataPoint.intData + ", " + dataPoint.stringData);
    }
}
