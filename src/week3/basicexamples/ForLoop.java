package week3.basicexamples;

public class ForLoop {

    public static void main(String[] args) {

        // For-silmukka, joka iteroi luvut 0-9 muuttujassa i
        for(int i = 0; i < 10; i++) {

            // Iterointiehtona toimiva muuttuja on käytettävissä silmukan sisällä
            // Tulostaa luvut 0-9, jokaisen omalle rivilleen
            System.out.println(i);
        }

        // Seuraava rivi aiheuttaisi virhetilan, koska muuttuja i ei ole saatavilla silmukan rungon
        // ulkopuolella:
        /* System.out.println(i); */
    }
}
