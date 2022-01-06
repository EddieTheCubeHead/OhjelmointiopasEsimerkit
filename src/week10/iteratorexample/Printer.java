package week10.iteratorexample;

import java.util.function.Consumer;

// Luodaan parametrisoitu implementaatio Consumer-rajapinnasta
public class Printer implements Consumer<String> {
    @Override
    public void accept(String string) {
        System.out.println(string);
    }
}
