package week6.castingexample;

public class EmailRegistration extends UserRegistration {

    private String userEmail;

    public EmailRegistration(String userName, String userEmail) {
        super(userName);
        this.userEmail = userEmail;
    }

    public void sendEmail() {
        // Täällä sijaitsisi todennäköisesti kutsu johonkin sähköpostikirjastoon, joka lähettäisi
        // sähköpostin käyttäjälle
        System.out.println("Email sent to address '" + userEmail + "'.");
    }
}
