package week2.basicexamples;

// public-avainsana kertoo luokan olevan koko muun ohjelmiston nähtävissä
//
// class-avainsana aloittaa luokan määritelmän. Sitä seuraa luokan nimi ja hakasulkeisiin suljettu
// luokan runko. Pääluokan nimeä ei ole etukäteen määritelty ja onkin suositeltavaa nimetä se
// kuvailevasti, esimerkiksi koko ohjelman nimen mukaisesti.
class HelloWorld {

    // static-avainsana käsitellään oppaassa myöhemmin. Toistaiseksi riittää
    // että tiedostaa main-metodin vaadittavan olevan muotoa "public static void"
    public static void main(String[] args){

        // Kutsu println-funktioon tulostaa annetun merkkijonon ja rivinvaihdon
        System.out.println("Hello world!");
    }
}