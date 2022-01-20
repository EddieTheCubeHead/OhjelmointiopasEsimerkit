package week6.castingexample;

public class ClassCasting {

    public static void main(String[] args) {
        UserRegistration registrationEvent =
                new EmailRegistration("Tester", "test@mail.example");

        registrationEvent.performRegistration();

        // Tarkistetaan registrationEvent-muuttujan tyyppi ja lähetetään sähköposti tarvittaessa
        if (registrationEvent instanceof EmailRegistration) {
            // Kompakti tapa kutsua lapsiluokan metodia pakotetulla tyyppimuunnoksella
            ((EmailRegistration)registrationEvent).sendEmail();
            // Toinen vaihtoehto olisi seuraava koodinpätkä:
            /*
            EmailRegistration emailRegistration = (EmailRegistration) registrationEvent
            emailRegistration.sendEmail();
            */
        }
    }
}
