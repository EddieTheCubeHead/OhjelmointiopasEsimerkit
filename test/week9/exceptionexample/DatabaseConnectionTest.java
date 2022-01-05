package week9.exceptionexample;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DatabaseConnectionTest {

    DatabaseConnection connection;

    @BeforeEach
    void setUp() {
        this.connection = new DatabaseConnection();
    }

    @Test
    void getEntryGivenValidNameThenEntryReturned() {
        String entry = null;
        try {
            entry = this.connection.getEntry("LUT");
        } catch(NoDatabaseEntryException ignored) {}

        assertNotNull(entry);
    }

    @Test
    void getEntryGivenInvalidNameThenNoEntryExceptionRaised() {
        assertThrows(NoDatabaseEntryException.class,
                () -> this.connection.getEntry("Invalid key"));
    }

}