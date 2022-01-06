package week10.genericinheritance;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringValidatorTest {

    @Test
    void validateWhenCalledWithValidStringThenTrueReturned() {
        StringValidator validator = new StringValidator();
        String string = "Valid";
        assertTrue(validator.validate(string));
    }

    @Test
    void validateWhenCalledWithInvalidStringThenFalseReturned() {
        StringValidator validator = new StringValidator();
        String string = "Invalid";
        assertFalse(validator.validate(string));
    }

}