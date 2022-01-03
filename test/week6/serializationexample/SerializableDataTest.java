package week6.serializationexample;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SerializableDataTest {

    @Test
    void getDataAsStringWhenCalledThenDataReturned() {
        SerializableData dataPoint = new SerializableData("String data", 5);
        assertEquals("String data, 5", dataPoint.getDataAsString());
    }

}