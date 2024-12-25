package helloapagain;

public class StringManipulator {
	// removes spaces from a string
	public  String removeSpaces(String str) {
	        String result = "";
	        for (int i = 0; i < str.length(); i++) {
	            if (str.charAt(i) != ' ') {
	                result += str.charAt(i);
	            }
	        }
	        return result;
	    }
	  
	// reverses a string
	  public String reverseString(String text) {
		  
		  // Borrow or rob
		  String reversedString = "";
		  String spacesRemoved = removeSpaces(text);
		  // start from the last index. if there are 10 chars, it means last index is 9. 
		  // That's why length() -1;
		  for (int i = spacesRemoved.length() - 1; i >= 0; i--) {
			reversedString +=  spacesRemoved.charAt(i);
		  }
		  return reversedString;
	  }
	  
	  // Delia Saw I Was Ailed
	  public boolean isPalindrome(String text) {
		  String spacesRemoved = removeSpaces(text).toLowerCase(); // deliasawiwasailed
		  String reversed = reverseString(spacesRemoved); // deliasawiwasailed
		  
		  return spacesRemoved.equals(reversed);
		
		 
	  }
	  

	  

}
