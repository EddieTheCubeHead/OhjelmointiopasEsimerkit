// Javassa on kaksi tapaa kommentoida kirjoitettua koodia. Ensimmäinen on aloittaa kommentti
// kahdella kauttaviivalla. Tämä merkitsee kääntäjälle rivin loppuosan olevan kommenttia, jollon
// kääntäjä jättää sen huomiotta Huomioi, että tämä toimii vaikka rivillä olisi ollut aikaisemmin
// koodia, eikä riko toiselle riville jatkuvia rakenteita. Tämän oppaan kommentit käyttävät
// pääasiassa tätä tyyliä. Välin jättäminen kaksoiskauttaviivan ja sitä seuraavan kommentin
// väliin ei ole pakollista, mutta sitä pidetään monessa tyylioppaassa oikeaoppisena tyylinä.

//Myös tämä on siis toimiva kommentti

package week2; // Pakettimääritelmä toimii vaikka sitä seuraa kommentti

public class CommentingExample { // Luokan määritelmän jälkeen laitettu kommentti toimii myös

    /* Toinen tapa kommentoida on ympäröidä kommentti kauttaviivoilla ja tähdillä tähän tapaan */

    /* Tälläinen kommentti voi ulottua monelle riville.
     * Monesti jatketut kommenttirivit aloitetaan tähdellä.
     * Tämä erottaa kommentin selkeämmin muusta koodista.
     */

    /* Mutta esimerkiksi myös tälläinen kommentti toimii,
    joskin se ei näytä kovin mukavalta ja on hankalampi lukea.
     */

    public static void main(){

        // /*-merkillä aloitetut kommentit voivat sijaita myös koodirivin alussa tai keskellä.
        // Tällainen asettelu toimii kunhan kommentit eivät katkaise avainsanoja.
        // Tämä ei ole suositeltavaa viimeistellyssä koodissa, mutta saatta olla hyödyllistä
        // kehitysvaiheessa.

        /* Tämä toimii */ System.out.println(/* Tämäkin toimii */"Toimii");
    }
}

