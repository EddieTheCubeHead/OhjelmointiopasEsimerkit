package week2.accessmodifierexample;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import week2.accessmodifierexample.SecondClass;

import static org.junit.jupiter.api.Assertions.*;

class SecondClassTest {

    private SecondClass secondChild;

    @BeforeEach
    void setUp() {
        this.secondChild = new SecondClass();
    }

    @Test
    void hasPublicText() {
        assertTrue(this.secondChild.publicMethod());
    }
}