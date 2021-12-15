package week2.constructorexample;

public class ClassWithConstructor {

    public int intData;
    public String stringData;

    // Rakentajametodi luodaan ilman paluuarvoa tai return-avainsanaa
    public ClassWithConstructor(int intData, String stringData) {
        this.intData = intData;
        this.stringData = stringData;
    }
}
