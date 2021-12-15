package week3.basicexamples;

public class BreakContinue {

    // On huomioitavaa, että tämä luokka ei sisällä hyvää koodia. Parillisten lukujen luettelointi
    // onnistuisi helpoiten yksinkertaisella for loopilla. Luokka on kirjoitettu puhtaasti
    // esimerkiksi demonstroimaan break- ja continue-avainsanojen käyttöä
    public static void main(String[] args) {
        int maxNumber = 20;
        int currentNumber = 0;

        // while(true) luo ikuisen loopin. Ainut tapa päästä loopista pois on break-avainsana
        while(true) {
            currentNumber++;
            // Poistumisehto break-avainsanalla
            if (currentNumber >= maxNumber) {
                break;
            }

            // Käytetään modulomuuttujaa parillisuuden selvittämiseen ja skipataan loput loopista,
            // mikäli luku ei ole parillinen
            if (currentNumber % 2 == 1) {
                continue;
            }

            // Ohjelma tulostaa luvut 2, 4, 8, 10, 12, 14, 16 ja 18, kaikki omille riveilleen
            System.out.println(currentNumber);
        }
    }
}
