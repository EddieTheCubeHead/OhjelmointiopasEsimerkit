package week2.gettersetterexample;

public class NumberStorage {

    private int positiveNumber;

    // Suurin osa noutajista näyttää tältä.
    public int getPositiveNumber() {
        return this.positiveNumber;
    }

    // Asettajat mahdollistavat esimerkiksi annettujen arvojen validoinnin pakottamisen.
    public void setPositiveNumber(int positiveNumber) {
        if (positiveNumber < 0) {
            System.out.println("A positive number is required.");
            return;
        }
        this.positiveNumber = positiveNumber;
    }
}
