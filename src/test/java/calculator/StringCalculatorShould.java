package calculator;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.jupiter.api.Test;


public class StringCalculatorShould {
	
	
private StringCalculator stringCalculator;
    @Test
    public void emptyStringShouldReturnZero() {
    
        assertEquals(0, stringCalculator.add(""));
    }
    @Test
    public void oneNumberShouldReturnItseft() {
        
        assertEquals(3, stringCalculator.add("3"));
    }
    @Test
    public void twoNumbersShouldBeAdded() {
        
        assertEquals(7, stringCalculator.add("2,5"));
    }
    @Test
    public void moreDigitsSupported() {
        
        assertEquals(77, stringCalculator.add("22,55"));
    }
 
    @Test
    public void allowNnumersAsInput() {
        
        assertEquals(45, stringCalculator.add("1,2,3,4,5,6,7,8,9"));
    }
    // p3 ------------------
    @Test
    public void supportNewLineAsSeparator() {
       
        assertEquals(6, stringCalculator.add("1\n2,3"));
    }

    @Test
    public void supportForCustomDelimiter() {
        
        assertEquals(10, stringCalculator.add(";\n1;2;3;4"));
    }

    @Test
    public void negativeNotSupported() {
        StringCalculator sut = new StringCalculator();
        try {
        	stringCalculator.add("-1;4");
            fail("exception should have been thrown");
        }
        catch (IllegalArgumentException e) {
            assertEquals("negatives not allowed -1", e.getMessage());
        }
    }
}
