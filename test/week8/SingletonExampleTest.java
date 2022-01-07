package week8;

import org.junit.jupiter.api.Test;
import week8.SingletonExample;

import static org.junit.jupiter.api.Assertions.*;

class SingletonExampleTest {

    @Test
    void getInstanceWhenCalledThenReturnsInstanceOfSingleton() {
        SingletonExample instance = SingletonExample.getInstance();
        assertNotNull(instance);
    }

    @Test
    void getInstanceWhenCalledTwiceThenReturnsSameInstance() {
        SingletonExample expectedInstance = SingletonExample.getInstance();
        assertEquals(expectedInstance, SingletonExample.getInstance());
    }
}