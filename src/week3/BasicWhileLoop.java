package week3;

public class BasicWhileLoop {

    public static void main(String[] args) {

        // Wnile-looppia käytettäessä toistoehdon sisältävät muuttujat on määriteltävä ennen looppia
        int number = 0;

        // Toistoehto olisi yleensä sidottu esimerkiksi käyttäjän syötteeseen tai muuhun
        // ulkopuoliseen etukäteen tuntemattomaan arvoon. For- ja for-each -loopit ovat
        // helppolukuisempia ja helppokäyttöisempiä käsiteltäessä etukäteen tunnettua arvojoukkoa
        // Printtaa numerot 0-9 omille riveilleen
        while(number < 10) {
            System.out.println(number);
            number++;
        }
    }
}
