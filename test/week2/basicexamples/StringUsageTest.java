package week2.basicexamples;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StringUsageTest {

    @Test
    void classHasStringAttribute() {
        StringUsage stringUsage = new StringUsage();
        assertEquals("Example string", stringUsage.exampleString);
    }
}