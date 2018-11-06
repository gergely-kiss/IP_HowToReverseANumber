package uk.gergely.kiss.howtoreverseanumber;

public class HowToReverseANumber {
	public static void main(String[] args) {
		int test1 = 12345;
		int test2 = -67890;
		int test3 = 0;
		int test4 = 111000;
		int test5 = -230000400;

		printTest(test1);
		printTest(test2);
		printTest(test3);
		printTest(test4);
		printTest(test5);
	}

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

	private static void printTest(int testCase) {
		System.out.println("The input is: " + testCase + ". The reverse of that is: " + reverseNumber(testCase));
	}
}
