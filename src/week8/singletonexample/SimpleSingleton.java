package week8.singletonexample;

public class SimpleSingleton {

    private static SimpleSingleton instance = null;

    // Luomalla luokalle tyhjä yksityinen rakentaja varmistetaan, ettei muu koodi voi luoda
    // luokan instansseja käyttämättä getInstance-metodia
    private SimpleSingleton() {
    }

    public static SimpleSingleton getInstance() {
        if (instance == null) {
            instance = new SimpleSingleton();
        }
        return instance;
    }
}
