package week6.serializationexample;

import java.io.Serializable;

public class SerializableData implements Serializable {

    // Mikäli muuttujat olisivat käyttäjän määrittelemiä luokkia, olisi pidettävä huolta, että
    // kaikkien muuttujien luokat implementoivat myös Serializable-rajapinnan
    private String stringData;
    private int intData;

    public SerializableData(String stringData, int intData) {
        this.stringData = stringData;
        this.intData = intData;
    }

    public String getDataAsString() {
        return stringData + ", " + intData;
    }
}
