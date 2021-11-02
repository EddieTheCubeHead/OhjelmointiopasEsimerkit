package week3;

public class BasicStaticChild {

    // Muuttuja voisi olla prettyPrint-metodin sisällä, joten kehitysympäristö ehdottaa tätä.
    // Tämä @SuppressWarnings estää tämän valittamisen. @-merkin sisältävästä rivistä ei siis
    // tarvitse välittää.
    //
    // Luokkamuuttujan luonti
    @SuppressWarnings("FieldCanBeLocal")
    private static String decoratorString = "###";

    // Luokkametodin luonti. Huomioi, että luokkamuuttujaa voidaan käyttää luokkametodissa, mutta
    // normaalia muuttujaa ei voitaisi.
    public static void prettyPrint(String string) {
        System.out.println(decoratorString + " " + string + " " + decoratorString);
    }
}
