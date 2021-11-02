package week2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BasicConstructorChildTest {

    @Test
    void constructorWhenGivenDataThenDataBoundToCreatedInstance() {
        BasicConstructorChild child = new BasicConstructorChild(420, "Data");
        assertEquals(420, child.intData);
        assertEquals("Data", child.stringData);
    }

}