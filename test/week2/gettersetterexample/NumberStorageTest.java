package week2.gettersetterexample;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import week2.gettersetterexample.NumberStorage;

import static com.github.stefanbirkner.systemlambda.SystemLambda.tapSystemOut;
import static org.junit.jupiter.api.Assertions.*;

class NumberStorageTest {

    private NumberStorage getterSetter;

    @BeforeEach
    void setUp() {
        this.getterSetter = new NumberStorage();
    }

    @Test
    void whenNumberIsSetUsingSetterThenGetNumberReturnsTheNumber()
    {
        int expectedNumber = 3145;
        this.getterSetter.setPositiveNumber(expectedNumber);
        assertEquals(expectedNumber, this.getterSetter.getPositiveNumber());
    }

    @Test
    void setPositiveNumberWhenCalledWithNegativeNumberThenNumberNotSetAndFeedbackPrinted() {
        int invalidNumber = -1;
        String text = null;
        try {
            text = tapSystemOut(() -> this.getterSetter.setPositiveNumber(invalidNumber));
        } catch (Exception e) {
            e.printStackTrace();
            fail();
        }

        assertEquals("A positive number is required.\r\n", text);
        assertEquals(0, this.getterSetter.getPositiveNumber());
    }
}