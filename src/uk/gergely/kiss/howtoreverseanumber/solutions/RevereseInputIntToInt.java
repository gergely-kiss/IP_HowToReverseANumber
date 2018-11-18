package uk.gergely.kiss.howtoreverseanumber.solutions;

public class RevereseInputIntToInt {

	public static int reverseNumber(int input) {
		boolean isNegative = input < 0;
		input = isNegative ? -input : input;
		int reveresedNumber = 0;
		while (input > 0) {
			reveresedNumber = (reveresedNumber * 10) + input % 10;
			input /= 10;
		}
		reveresedNumber = isNegative ? -reveresedNumber : reveresedNumber;
		return reveresedNumber;
	}

	public static int reveresNumberRecursive(int input) {
		boolean isNegative = input < 0;
		input = isNegative ? -input : input;
		return isNegative ? -reveresNumberRecursive(input, 0) : reveresNumberRecursive(input, 0);
	}

	private static int reveresNumberRecursive(int input, int reveresedNumber) {
		reveresedNumber = (reveresedNumber * 10) + input % 10;
		return input/10 == 0 ? reveresedNumber : reveresNumberRecursive(input / 10, reveresedNumber);
	}
	
}
