package week6.abstractexample;

public abstract class AbstractLogger {

    // Tässä metodissa voitaisiin lisätä esimerkiksi loggaustapahtuman ajankohta, esimerkin vuoksi
    // metodi on yksinkertaistettu
    protected String formatLogString(String logString) {
        return "LOGGED: " + logString;
    }

    // Abstraktista metodista määritellään vain signatuuri
    public abstract void logString(String logString);
}
