class CamelCase {

	public static String convert(String sentence){
		String newSentence = "";
		boolean isUpperCase = false;
		for (int i = 0; i < sentence.length(); i++) {
			char letter = sentence.charAt(i);
			if (letter != ' ') {
				if (isUpperCase == true) {
					newSentence = newSentence + Character.toUpperCase(letter);
					isUpperCase = false;
				} else {
					newSentence = newSentence + Character.toLowerCase(letter);
				}
			} else {
				isUpperCase = true;
			}
		}

		return newSentence;
	}
}
