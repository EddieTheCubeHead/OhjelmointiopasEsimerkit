package week8.singletonexample;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimpleSingletonTest {

    @Test
    void getInstanceWhenCalledThenReturnsInstanceOfSingleton() {
        SimpleSingleton instance = SimpleSingleton.getInstance();
        assertNotNull(instance);
    }

    @Test
    void getInstanceWhenCalledTwiceThenReturnsSameInstance() {
        SimpleSingleton expectedInstance = SimpleSingleton.getInstance();
        assertEquals(expectedInstance, SimpleSingleton.getInstance());
    }
}