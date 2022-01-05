package week9.exceptionexample;

public class NoDatabaseEntryException extends Exception {

    public NoDatabaseEntryException(String missingEntry) {
        super("Did not find the entry '" + missingEntry + "' in the database");
    }
}
