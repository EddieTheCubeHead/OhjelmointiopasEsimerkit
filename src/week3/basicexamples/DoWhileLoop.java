package week3.basicexamples;

public class DoWhileLoop {

    public static void main(String[] args) {

        int number = 0;

        // Do-while-silmukassa toistoehto tarkastetaan vasta silmukan rungon jälkeen. Täten runko
        // ajetaan ainakin kertaalleen, vaikka toistoehto olisi koko ajan epätosi.
        do {
            System.out.println("Inside do while loop.");
            number++;
        } while(number < 0);
    }
}
