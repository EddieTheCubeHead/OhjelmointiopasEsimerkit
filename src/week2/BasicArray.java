package week2;

public class BasicArray {

    public static void main(String[] args) {

        // Luodaan taulukko, joka sisältää neljä edellä esitellyn dataluokan instanssia. Taulukon
        // voi luoda primitiivisistä tyypeistä, standardikirjaston luokista tai käyttäjän itse
        // määrittelemistä luokista.
        BasicArrayDataPoint[] dataPoints = new BasicArrayDataPoint[4];

        // Täytetään instanssit esimerkkidatalla. Huomioi, että kuten suurimmassa osassa
        // ohjelmointikielistä, myös Javassa aloitetaan taulukon indeksointi nollasta. Lisäksi
        // huomionarvoista on mahdollisuus viitata olion ominaisuuksiin pistenotaatiolla, mikäli
        // taulukko koostuu olioista.
        dataPoints[0] = new BasicArrayDataPoint();
        dataPoints[0].courseName = "Ohjelmoinnin perusteet";
        dataPoints[0].recommendedYear = 1;

        dataPoints[1] = new BasicArrayDataPoint();
        dataPoints[1].courseName = "Olio-ohjelmointi";
        dataPoints[1].recommendedYear = 1;

        dataPoints[2] = new BasicArrayDataPoint();
        dataPoints[2].courseName = "Käyttöjärjestelmät";
        dataPoints[2].recommendedYear = 2;

        dataPoints[3] = new BasicArrayDataPoint();
        dataPoints[3].courseName = "Web Applications";
        dataPoints[3].recommendedYear = 3;

        // Luetaan data instansseista. Huomio plus-merkillä toteutettu tekstin yhdistäminen
        // tulostuslauseessa. Javassa on olemassa sivistyneempiä tapoja formatoida tulostetta,
        // mutta niitä käsitellään myöhemmin. Tämän tavan huonot puolet ovat ilmeisiä: se tuottaa
        // rumaa, ja hankalasti luettavaa koodia
        System.out.println(
                "First entry (index 0): '" + dataPoints[0].courseName
                        + "', year: " + dataPoints[0].recommendedYear +"\r\n" +
                "Second entry (index 1): '" + dataPoints[1].courseName
                        + "', year: " + dataPoints[1].recommendedYear + "\r\n" +
                "Third entry (index 2): '" + dataPoints[2].courseName
                        + "', year: " + dataPoints[2].recommendedYear + "\r\n" +
                "Fourth entry (index 3): '" + dataPoints[3].courseName
                        + "', year: " + dataPoints[3].recommendedYear
        );
    }
}
