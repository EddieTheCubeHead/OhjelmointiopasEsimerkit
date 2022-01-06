package week11.cloningexample;

public class ComplexDataPoint implements Cloneable {

    // Koska luokka on monimutkaisempi kuin DataPoint, on tehty päätös toteuttaa luokalle
    // noutaja-asettaja -suunnittelumalli oikeaoppisesti.
    private DataPoint coordinates;
    private double xVelocity;
    private double yVelocity;

    public ComplexDataPoint(double xVelocity, double yVelocity, DataPoint coordinates) {
        this.coordinates = coordinates;
        this.xVelocity = xVelocity;
        this.yVelocity = yVelocity;
    }

    public DataPoint getCoordinates() {
        return coordinates;
    }

    public double getXVelocity() {
        return xVelocity;
    }

    public double getYVelocity() {
        return yVelocity;
    }

    @Override
    public ComplexDataPoint clone() {
        // Clone-metodin sisällä voidaan määritellä mukautettua toiminnallisuutta, joka sekoittaa
        // puhtaan matalan kopion ja syvän kopion väliltä.
        try {
            ComplexDataPoint clone = (ComplexDataPoint) super.clone();
            clone.coordinates = this.coordinates.clone();
            return clone;
        } catch(CloneNotSupportedException ignored) {
            System.out.println("Cloning failed because it was not supported.");
            return null;
        }
    }
}
