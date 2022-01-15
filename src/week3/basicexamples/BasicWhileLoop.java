package week3.basicexamples;

public class BasicWhileLoop {

    public static void main(String[] args) {

        // Wnile-silmukkaa käytettäessä toistoehdon sisältämät muuttujat on määriteltävä ennen
        // silmukkaa
        int number = 0;

        // Toistoehto olisi yleensä sidottu esimerkiksi käyttäjän syötteeseen tai muuhun
        // ulkopuoliseen etukäteen tuntemattomaan arvoon. For- ja for-each -silmukat ovat
        // helppolukuisempia ja helppokäyttöisempiä käsiteltäessä etukäteen tunnettua arvojoukkoa.
        // Printtaa numerot 0-9 omille riveilleen
        while(number < 10) {
            System.out.println(number);
            number++;
        }
    }
}
