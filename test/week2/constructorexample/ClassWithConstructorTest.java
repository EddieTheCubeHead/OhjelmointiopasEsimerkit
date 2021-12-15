package week2.constructorexample;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClassWithConstructorTest {

    @Test
    void constructorWhenGivenDataThenDataBoundToCreatedInstance() {
        ClassWithConstructor child = new ClassWithConstructor(420, "Data");
        assertEquals(420, child.intData);
        assertEquals("Data", child.stringData);
    }

}