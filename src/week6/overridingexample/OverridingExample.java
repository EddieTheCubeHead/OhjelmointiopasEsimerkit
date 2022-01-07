package week6.overridingexample;

public class OverridingExample {
    public static void main(String[] strings) {
        Parent parentClass = new Parent();
        Parent childClass = new Child();
        System.out.println(parentClass.addText("Called from "));
        System.out.println(childClass.addText("Called from "));
    }
}
