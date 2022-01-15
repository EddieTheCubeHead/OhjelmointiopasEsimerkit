package week3.basicexamples;

public class ForEachLoop {

    public static void main(String[] args) {

        // Taulukko voidaan alustaa suoraan tämäntyyppisellä notaatiolla, mikäli taulukon koko
        // sisältö on jo tiedossa
        String[] weekdays = new String[]{"Monday", "Tuesday", "Wednesday", "Thursday", "Friday",
                "Saturday", "Sunday"};

        // Jokainen taulukon alkio sidotaan vuodollaan String-tyypin weekday-muuttujaan
        // Muuttuja on käytettävissä vain silmukan sisällä
        // Printtaa viikonpäivät taulukosta, jokaisen omalle rivilleen
        for(String weekday : weekdays) {
            System.out.println(weekday);
        }
    }
}
