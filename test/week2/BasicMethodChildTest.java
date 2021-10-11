package week2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BasicMethodChildTest {

    BasicMethodChild child;

    @BeforeEach
    void setUp() {
        this.child = new BasicMethodChild();
    }

    @Test
    void combineStringsWhenCalledWithTwoStringCombinedStringReturned() {
        String actual = this.child.combineStrings("1", "2");
        assertEquals("12", actual);
    }

}