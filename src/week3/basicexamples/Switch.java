package week3.basicexamples;

public class Switch {

    @SuppressWarnings("ConstantConditions")
    public static void main(String[] args) {
        // grade-muuttujan arvo saataisiin oikeassa ohjelmassa jostain muualta
        int grade = 9;
        String verbalGrade;

        // Valintaehdon ei ole pakko olla näin simppeli, vaan se voi olla monimutkaisempi
        // määritelmä. Esimerkiksi grade * 2 olisi validi valintaehto.
        switch(grade) {
            case 4:
                verbalGrade = "Failed";
                break;
            case 5:
                verbalGrade = "Passable";
                break;
            case 6:
                verbalGrade = "Decent";
                break;
            case 7:
                verbalGrade = "Satisfactory";
                break;
            case 8:
                verbalGrade = "Good";
                break;
            case 9:
                verbalGrade = "Laudable";
                break;
            case 10:
                verbalGrade = "Excellent";
                break;

            // Oletushaaraa voi käyttää  virhetilanteiden tunnistamiseen ja niihin reagointiin
            default:
                System.out.println("Unrecognized grade! Pleae give a grade from 4 to 10.");
                verbalGrade = "Error: Unrecognized grade";
                // Viimeinen haara (yleensä default) ei tarvitse break-avainsanaa
        }

        // Printtaa tässä tapauksessa "Laudable"
        System.out.println(verbalGrade);
    }
}
