package calculator;

import java.util.ArrayList;
import java.util.List;

class StringCalculator {

	   public int add(String text) {
	        List<String> negatives = new ArrayList<String>();

	        if (text == null || text.isEmpty()) {
	            return 0;
	        }
	        char customDelimiter = getCustomDelimiter(text.split("\n")[0]);

	        String[] chuncks = (customDelimiter == ',') ? 
	                                text.split(",|\n") : text.split("\n|" + customDelimiter);
	        int total = 0;
	        int skipFirstLines = (customDelimiter == ',') ? 0 : 2;
	        
	        if (!negatives.isEmpty()) {
	            throw new IllegalArgumentException(
	                "negatives not allowed " + String.join(",", negatives));
	        }
	        return total;
	    }

	    private boolean isNumeric(String str) {
	        try {
	            Double.parseDouble(str);
	        } catch (NumberFormatException nfe) {
	            return false;
	        }
	        return true;
	    }

	    private char getCustomDelimiter(String line) {
	        if (line == null || line.isEmpty()) {
	            return ',';
	        }
	        if (isNumeric(line)) {
	            return ',';
	        }
	        if (line.length() == 1) {
	            return line.charAt(0);
	        }
	        return ',';
	    }
}
