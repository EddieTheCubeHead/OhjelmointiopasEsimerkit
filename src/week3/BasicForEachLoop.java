package week3;

public class BasicForEachLoop {

    public static void main(String[] args) {

        // Taulukko voidaan alustaa suoraan tämäntyyppisellä notaatiolla, mikäli taulukon koko
        // sisältö on jo tiedossa
        String[] weekdays = new String[]{"Monday", "Tuesday", "Wednesday", "Thursday", "Friday",
                "Saturday", "Sunday"};

        // Jokainen taulukon alkio sidotaan vuodollaan String-tyypin weekday-muuttujaan
        // Muuttuja on käytettävissä vain loopin sisällä
        // Printtaa viikonpäivät taulukosta, jokaisen omalle rivilleen
        for(String weekday : weekdays) {
            System.out.println(weekday);
        }
    }
}
