package week2.basicexamples;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class DataTypesTest {

    @Test
    void hasAllFields() {
        var typeTest = new DataTypes();
        Assert.assertTrue(typeTest.booleanValue);
        Assert.assertEquals(typeTest.maxByteValue, Byte.MAX_VALUE);
        Assert.assertEquals(typeTest.maxShortValue, Short.MAX_VALUE);
        Assert.assertEquals(typeTest.maxIntValue, Integer.MAX_VALUE);
        Assert.assertEquals(typeTest.maxLongValue, Long.MAX_VALUE);
        Assert.assertEquals(typeTest.floatValue, 1.1f, 0);
        Assert.assertEquals(typeTest.doubleValue,
                3.141592653589793238462643383279502884197169399375105820974944592d, 0);
        Assert.assertEquals(typeTest.charValue, 'a');
        Assert.assertEquals(typeTest.unicodedCharValue, '\u0123');
    }
}