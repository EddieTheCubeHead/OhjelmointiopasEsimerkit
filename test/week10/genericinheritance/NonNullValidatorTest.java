package week10.genericinheritance;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class NonNullValidatorTest {

    @Test
    void validateWhenCalledWithNonNullObjectThenTrueReturned() {
        NonNullValidator<List<Integer>> listValidator = new NonNullValidator<>();
        List<Integer> object = new ArrayList<>();
        assertTrue(listValidator.validate(object));
    }

    @Test
    void validateWhenCalledWithNullObjectThenFalseReturned() {
        NonNullValidator<Integer> integerValidator = new NonNullValidator<>();
        Integer object = null;
        assertFalse(integerValidator.validate(object));
    }

}