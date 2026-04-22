package br.com.erudio.requestConverters;
import br.com.erudio.exception.ResourceNotFoundException;

public class NumberConverter {
    
    public static Double covertToDouble(String strNumber) {
		if (strNumber == null || strNumber.isEmpty()) throw new ResourceNotFoundException("Please set a numeric value!"); 
		String number = strNumber.replaceAll(",", ".");// Moeda Americana x Brasileira
		return Double.parseDouble(number);
	}

	public static boolean isNumeric(String strNumber) {
		if (strNumber == null || strNumber.isEmpty()) return false; 
		String number = strNumber.replaceAll(",", ".");
			return number.matches("[-+]?[0-9]*\\.?[0-9]+");
	}
}
