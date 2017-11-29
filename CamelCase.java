class CamelCase {

	public static String convert(String text) {
		boolean capitalize = false;
		String result = "";
		for (int i = 0; i < text.length(); i++) {
			char letter = text.charAt(i);
			if (letter == ' ') {
				capitalize = true;
			} else if (capitalize) {
				capitalize = false;
				result += Character.toUpperCase(letter);
			} else {
				result += Character.toLowerCase(letter);
			}
		}
		return result;
	}
}