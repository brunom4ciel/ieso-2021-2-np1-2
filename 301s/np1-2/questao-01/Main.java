import java.util.Arrays;
// alternativa correta: 123.0, 123.12, 123.33, 1234.5, 23406.66, 2342.9, 2342354.99, 234254.66, 234534.44, 2345345.46, 23455.45, 245.55, 345.45, 345.5, 34534.34, 34534.54, 345345.32, 3455.33, 3456090.66, 345634.0, 35345.0, 44.44, 569563.4, 73456.11, 83463.45, 839045.4
class Main {
	public static void main(String[] args) {
		String[] args2 = { "123.12", "1234.5", "2345345.46", "839045.40", "2345345,34", "123.", "345634.0", "3455.33",
				"569563.4", "345.5", "245.55", "234534.44", "23455.45", "34653.52.", "35345.", "34234,434.0",
				"34534.54", "2342354.99", "9234,34", "73456.11", "83463.45", "345345.32", "123424,235", "234254.66",
				"23406.66", "3456090.66", "44.44", "345.45", "345354.y6", "2342.90", "34534.34", "123.33" };
		Arrays.sort(args2);
		for (int i = 0; i < args2.length; i++) {
			if (isNumeric(args2[i], '.')) {
				System.out.print("" + (i > 0 ? ", " : "") + Double.parseDouble(args2[i]));
			}
		}
	}

	public static boolean isNumeric(String value, char decimalSeparator) {
		boolean result = false;
		boolean ds = false;
		for (int i = 0; i < value.length(); i++) {
			if (value.charAt(i) == '1' || value.charAt(i) == '2' || value.charAt(i) == '3' || value.charAt(i) == '4'
					|| value.charAt(i) == '5' || value.charAt(i) == '6' || value.charAt(i) == '7'
					|| value.charAt(i) == '8' || value.charAt(i) == '9' || value.charAt(i) == '0') {
				result = true;
			} else {
				if (value.charAt(i) == decimalSeparator) {
					if (ds) {
						result = false;
						break;
					} else {
						if (result) {
							ds = true;
						} else {
							result = false;
							break;
						}
					}
				} else {
					result = false;
					break;
				}
			}
		}
		return result;
	}
}