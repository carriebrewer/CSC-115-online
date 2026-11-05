// Carrie Brewer
// 11-5-26
// Partial code for validatePassword() method from Project: Password Suite.
// This code will not compile and run but you can copy from it into your Password.java.
//
// Copy the inside of the validatePassword() method to your Password.java and complete it. 
// Do not change the main method in Password.java.

public class PasswordValidate {
	
	public static void main(String[] args) {
	    
	    // partial main method code
	    // input is the password that the user typed in to check 
	    
	    if(validatePassword(input) == true) {
	    	System.out.println("Password valid");
	    } else {
	        System.out.println("Password invalid");
	    }
	}

	// This method takes a String password and returns true if the password is valid according to the rules
	public static boolean validatePassword(String input) {

		// ex. input = "ABcDEfg123!"

		// Rules:
		// at least 8 characters
		// at least 1 capital letter
		// at least 2 numbers

		// check length for 8 characters
		if(input.length() < 8) {
			return false;
		}

		// count capital letters

		int loopCounter = 0;
		int capitalCounter = 0;

		while(loopCounter < input.length()) {

			char ch = input.charAt(loopCounter);

			if(ch >= 'A' && ch <= 'Z') {
				capitalCounter++;
			}

			loopCounter++;
		}

		// count numbers

		// *** WRITE THIS PART OF THE CODE *** //

		// returns true if password meets the specifications
		if(capitalCounter >= 1 && numberCounter >= 2) {
			return true;
		}
		return false;

	}



	
}
