package week6.overridingexample;

public class OverridingExample {
    public static void main(String[] args) {
        Parent parentObject = new Parent();
        Parent childObject = new Child();
        System.out.println(parentObject.addText("Called from "));
        System.out.println(childObject.addText("Called from "));
    }
}
