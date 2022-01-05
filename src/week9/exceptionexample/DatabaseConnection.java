package week9.exceptionexample;

import java.util.HashMap;

public class DatabaseConnection {

    private HashMap<String, String> entries;

    public DatabaseConnection() {
        this.entries = new HashMap<>();
        entries.put("LUT", "Lappeenranta Lahti University of Technology");
    }

    public String getEntry(String key) throws NoDatabaseEntryException {
        String entry = this.entries.get(key);
        if (entry == null) {
            throw new NoDatabaseEntryException(key);
        }
        return entry;
    }
}
