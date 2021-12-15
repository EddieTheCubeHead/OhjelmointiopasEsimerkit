package week6.inheritancewithconstructors;

public class ParentWithConstructor {

    private int x;
    private int y;

    public ParentWithConstructor(int x, int y)
    {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
