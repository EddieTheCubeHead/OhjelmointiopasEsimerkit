package week2.accessmodifierexample;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import week2.accessmodifierexample.FirstClass;

import static org.junit.jupiter.api.Assertions.*;

class FirstClassTest {

    private FirstClass firstChild;

    @BeforeEach
    void setUp() {
        this.firstChild = new FirstClass();
    }

    @Test
    void hasPublicText() {
        assertEquals("Public string", this.firstChild.publicString);
    }
}