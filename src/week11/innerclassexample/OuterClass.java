package week11.innerclassexample;

public class OuterClass {

    private String message;

    public OuterClass(String message) {
        this.message = message;
    }

    public String getMessage() {
        return "Inside outer class: " + message;
    }

    public class InnerClass {
        // Sisäluokka näkee ulommaan luokaan muuttujat ja metodit, ellei luokka ole määritelty
        // static-avainsanalla. Tällöin sisäluokka näkee vain static-muuttujat ja metodit.
        public String getMessage() {
            return "Inside inner class: " + message;
        }
    }
}
