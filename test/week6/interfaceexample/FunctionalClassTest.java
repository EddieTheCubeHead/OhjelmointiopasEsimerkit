package week6.interfaceexample;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FunctionalClassTest {

    @Test
    void getTextWhenCalledReturnsClassText() {
        String exampleText = "Example text";
        FunctionalClass instance = new FunctionalClass(exampleText);
        assertEquals(exampleText, instance.getText());
    }

}