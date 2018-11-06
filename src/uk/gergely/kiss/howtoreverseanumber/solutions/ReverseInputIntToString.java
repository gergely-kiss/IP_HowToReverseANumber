package uk.gergely.kiss.howtoreverseanumber.solutions;

public class ReverseInputIntToString {

	public static String reverseNumber(int input) {

		boolean isNegative = input < 0;
		input = isNegative ? -input : input;
		int reveresedInput = 0;
		int zeroEndingDigits = 0;
		boolean justZerosUntilThis = true;
		while (input > 0) {

			if (input % 10 == 0 && justZerosUntilThis) {
				zeroEndingDigits++;
				justZerosUntilThis = (input / 10) % 10 == 0;
			}
			reveresedInput = (reveresedInput * 10) + input % 10;
			input /= 10;
		}

		String reverseInputString = zeroEndingDigits > 0 ? addZerosToTheBegin(zeroEndingDigits, reveresedInput)
				: String.valueOf(reveresedInput);
		reverseInputString = isNegative ? reverseInputString + "-" : reverseInputString;
		return reverseInputString;
	}

	private static String addZerosToTheBegin(int zeroEndingDigits, int reveresedInput) {
		String reveresedInputString = "0";
		for (int i = 0; i < zeroEndingDigits - 1; i++) {
			reveresedInputString += "0";
		}
		return reveresedInputString + reveresedInput;
	}


}
