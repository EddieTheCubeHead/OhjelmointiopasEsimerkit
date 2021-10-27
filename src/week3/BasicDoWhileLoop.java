package week3;

public class BasicDoWhileLoop {

    public static void main(String[] args) {

        int number = 0;

        // Do-while -loopissa toistoehto tarkastetaan vasta loopin rungon jälkeen. Täten loopin
        // runko ajetaan ainakin kertaalleen, vaikka toistoehto olisi koko ajan epätosi.
        do {
            System.out.println("Inside do while loop.");
            number++;
        } while(number < 0);
    }
}
