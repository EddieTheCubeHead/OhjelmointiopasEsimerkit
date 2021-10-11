package week2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static com.github.stefanbirkner.systemlambda.SystemLambda.tapSystemOut;
import static org.junit.jupiter.api.Assertions.*;

class GetterSetterChildTest {

    private GetterSetterChild getterSetter;

    @BeforeEach
    void setUp() {
        this.getterSetter = new GetterSetterChild();
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
            fail(Arrays.toString(e.getStackTrace()));
        }

        assertEquals("A positive number is required.\r\n", text);
        assertEquals(0, this.getterSetter.getPositiveNumber());
    }
}