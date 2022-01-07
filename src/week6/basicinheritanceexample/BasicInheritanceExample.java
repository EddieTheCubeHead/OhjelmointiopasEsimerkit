package week6.basicinheritanceexample;

public class BasicInheritanceExample {

    public static void main(String[] args) {
        // Koska Child periytyy parent-luokasta, Java näkee Child-instanssin myös Parent-instanssina
        Parent dataProvider = new Child();
        System.out.println("Data field: " + dataProvider.getDataField());
    }
}
