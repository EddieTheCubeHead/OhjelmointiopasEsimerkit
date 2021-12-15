package week6.inheritancewithconstructors;

public class ChildOfConstructorless extends ParentWithoutConstructor {

    public ChildOfConstructorless(int x, int y) {
        super();
        this.x = x;
        this.y = y;
    }
}
