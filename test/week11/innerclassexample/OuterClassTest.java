package week11.innerclassexample;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class OuterClassTest {

    @Test
    void getMessageWhenCalledConstructorParameterReturnedWithCallLocation() {
        OuterClass outer = new OuterClass("Test");
        assertEquals("Inside outer class: Test", outer.getMessage());
    }

    @Test
    void innerClassGetMessageWhenCalledOuterClassConstructorParameterReturnedWithCallLocation() {
        OuterClass outer = new OuterClass("Test");
        OuterClass.InnerClass inner = outer.new InnerClass();
        assertEquals("Inside inner class: Test", inner.getMessage());
    }

}