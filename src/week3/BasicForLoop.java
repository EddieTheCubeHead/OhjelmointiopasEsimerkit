package week3;

public class BasicForLoop {

    public static void main(String[] strings) {

        // For-looppi, joka iteroi luvut 0-9 muuttujassa i
        for(int i = 0; i < 10; i++) {

            // Iterointiehtona toimiva muuttuja on käytettävissä loopin sisällä
            // Tulostaa luvut 0-9, jokaisen omalle rivilleen
            System.out.println(i);
        }

        // Seuraava rivi aiheuttaisi virhetilan, koska muuttuja i ei ole saatavilla loopin rungon
        // ulkopuolella:
        /* System.out.println(i); */
    }
}
