package week2.basicexamples;

// Luokan luonnin notaatio käydään läpi myöhemmin tässä luvussa
class DataTypes {

    // Primitiivisten tietotyyppien luominen

    // boolean määritetään "true" tai "false" avainsanalla
    boolean booleanValue = true;
    // byte, short ja int voidaan kaikki määrittää normaaleilla lukuarvoilla
    byte maxByteValue = 127;
    short maxShortValue = 32767;
    int maxIntValue = 2147483647;
    // Huomaa long-tietotyypin määrittämiseen vaadittu L-pääte
    long maxLongValue = 9223372036854775807L;
    // float ja double ilmoitetaan f- ja d-päätteillä
    float floatValue = 1.1f;
    double doubleValue = 3.141592653589793238462643383279502884197169399375105820974944592d;
    // char-arvot määritellään ympäröimällä yksittäinen merkki tai unicode-koodi heittomerkeillä (')
    char charValue = 'a';
    char unicodedCharValue = '\u0123';
}
