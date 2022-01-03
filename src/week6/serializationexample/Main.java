package week6.serializationexample;

import java.io.*;

public class Main {

    public static void main(String[] args) {

        SerializableData dataPoint = new SerializableData("Data example", 10);

        // Serialisaatio ja tiedostonkäsittely try-catch -rakenteen sisällä
        try {
            // Huomioi ".ser"-pääte
            FileOutputStream fileOutputStream =
                    new FileOutputStream("serialization_example.ser");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(dataPoint);
            objectOutputStream.close();
            fileOutputStream.close();
        } catch (IOException exception) {
            exception.printStackTrace();
        }

        try {
            FileInputStream fileInputStream =
                    new FileInputStream("serialization_example.ser");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            SerializableData deSerializedDataPoint = (SerializableData) objectInputStream.readObject();
            System.out.println(deSerializedDataPoint.getDataAsString());
            objectInputStream.close();
            fileInputStream.close();
        } catch (IOException exception) {
            exception.printStackTrace();
        } catch (ClassNotFoundException exception) {
            System.out.println("Could not find the class for deserialization.");
            exception.printStackTrace();
        }
    }
}
