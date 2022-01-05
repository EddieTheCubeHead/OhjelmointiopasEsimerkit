package week9.exceptionexample;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NoDatabaseEntryExceptionTest {

    @Test
    void constructorWhenGivenEntryNameThenMessageWithEntryNameConstructed() {
        NoDatabaseEntryException exception = new NoDatabaseEntryException("Test Uni");
        assertEquals("Did not find the entry 'Test Uni' in the database",
                exception.getMessage());
    }

}