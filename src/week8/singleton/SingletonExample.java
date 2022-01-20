package week8.singleton;

public class SingletonExample {

    private static SingletonExample instance = null;

    // Luomalla luokalle tyhjä yksityinen rakentaja varmistetaan, ettei muu koodi voi luoda
    // luokan instansseja käyttämättä getInstance-metodia
    private SingletonExample() {
    }

    public static SingletonExample getInstance() {
        if (instance == null) {
            instance = new SingletonExample();
        }
        return instance;
    }
}
