package week6.castingexample;

public class UserRegistration {

    private String userName;

    public UserRegistration(String userName) {
        this.userName = userName;
    }

    public void performRegistration() {
        // Täällä sijaitsisi logiikka rekisteröintitapahtumaan
        System.out.println("Registered user '" + userName + "'.");
    }
}
