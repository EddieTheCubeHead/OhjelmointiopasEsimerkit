package week2;

import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccessModifierExampleFirstChildTest {

    private AccessModifierExampleFirstChild firstChild;

    @BeforeEach
    void setUp() {
        this.firstChild = new AccessModifierExampleFirstChild();
    }

    @Test
    void hasPublicText() {
        assertEquals("Public string", this.firstChild.publicString);
    }
}