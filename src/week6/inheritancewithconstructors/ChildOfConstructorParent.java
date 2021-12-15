package week6.inheritancewithconstructors;

public class ChildOfConstructorParent extends ParentWithConstructor {

    public ChildOfConstructorParent(int x, int y) {
        super(x + 2, y + 2);
    }
}
