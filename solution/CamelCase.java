class CamelCase {

	public static String convert(String str){
	    str = str.toLowerCase();
	    String result = "";
	    boolean isNextUpper = false; 
	    
	    for (int i = 0; i < str.length(); i ++) {
	        char currentChar = str.charAt(i);
	        if (currentChar != ' ') {
	            
	            if (isNextUpper == true) {
	                // transforme le caractère à ajouter en majuscule
	                currentChar = Character.toUpperCase(currentChar);
	                isNextUpper = false;  
	            }
                result += currentChar;                   
	        } else {
	            // prochain caractère en majuscule
	            isNextUpper = true; 
	        }
	    }
	    return result;
	}
}
