package week2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccessModifierExampleSecondChildTest {

    private AccessModifierExampleSecondChild secondChild;

    @BeforeEach
    void setUp() {
        this.secondChild = new AccessModifierExampleSecondChild();
    }

    @Test
    void hasPublicText() {
        assertTrue(this.secondChild.publicMethod());
    }
}