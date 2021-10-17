package calculator;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.jupiter.api.Test;


public class StringCalculatorShould {
	
	
	private StringCalculator stringCalculator;
	
	@Before
	public void init() {
	stringCalculator=new StringCalculator() ;
	}

	@Test
   public void empty_string_should_return_0() {
       
        assertEquals(0,stringCalculator.add(""));
    }

  @Test
    void string_with_single_number_should_return_number_as_int() {
       
        assertEquals(1,stringCalculator.add("1"));
    }
  @Test
  public void twoNumbersCommaDelimitedReturnSum() {
	  assertEquals(stringCalculator.add("1,2"), 3);
  }
}
