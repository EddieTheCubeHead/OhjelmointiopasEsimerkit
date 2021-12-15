package week2.methodexample;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MethodClassTest {

    MethodClass child;

    @BeforeEach
    void setUp() {
        this.child = new MethodClass();
    }

    @Test
    void combineStringsWhenCalledWithTwoStringCombinedStringReturned() {
        String actual = this.child.combineStrings("1", "2");
        assertEquals("12", actual);
    }

}