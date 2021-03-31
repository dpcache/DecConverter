public class Convert {

		static int MAX_DIGITS = 8;
		
	    public static void main(String[] args) {

	    	float base = Float.parseFloat(args[0]);
	    	
			for (int i = 1; i<args.length; i++) {
		    	float floatValue = Float.parseFloat(args[i]); 
		    	System.out.println("Base 10: " + floatValue);
				String result = convert(floatValue, base);
		    	System.out.println("Base " + (int)base+ ": " + result);
		    	System.out.println(" ");
			}
			
	    }
	    
	    
	    
	    static String convert(float floatValue, float base) {
	    	
	    	String result = "0.";
	    	//float baseRemainder = base - 1;
	    	
	    	if (floatValue == 0.0) {
	    		return "0";
	    	}
	    	
	    	int repeatCounter = 0;
	    	
	    	//If "floatValue" is negative add the "-" sign to the front of the string.
	    	if (floatValue < 0) {
	    		//Take value then negate. Makes it positive.
	    		floatValue = -1 * floatValue;
	    		result = "-" + result.substring(0, result.length());
	    	}
	    	
	    	float value = base * floatValue;
	    	
	    	//Convert from decimal to result for values between 1 and 0.
	    	while (value%1 != 0) {

		    	if (value > 1.0) {
		    		
		    		if (value >= 10.0) {
		    			
		    			result += "("+(int)value+")";
		    			
		    		} else {
		    			
		    			result += (int)value;
		    			
		    		}
		    		value =  base * (value - (int)value);

		    	}
		    	
		    	if (value < 1.0) {
		    		result += "0";
		    		value = base * value;
		    	}
		    
	    		//Checking for repeating numbers.
		    	int prevLength = result.length()-2;
		    	int length = result.length()-1;
			    if (result.charAt(prevLength) == result.charAt(length)) {
			    	repeatCounter++;
			    	if (repeatCounter + 2 == MAX_DIGITS) {
			    		break;
			    	}
			    } else {
			    	repeatCounter = 0;
			    } 
	    	}

	    	
    		if (value >= 10.0) {
    			
    			result += "("+(int)value+")";

    			
    		} else {
    			
    			result += (int)value;
    			
    		}
	    	return result;
	    }
	    
}
