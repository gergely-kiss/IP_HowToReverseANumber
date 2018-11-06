package uk.gergely.kiss.howtoreverseanumber.utils;

import uk.gergely.kiss.howtoreverseanumber.solutions.RevereseInputIntToInt;
import uk.gergely.kiss.howtoreverseanumber.solutions.ReverseInputIntToString;

public class PrintUtil {

	public static void printTestIntToString(int testCase) {
		System.out.println("The input is: " + testCase + ". The reverse of that is: "
				+ ReverseInputIntToString.reverseNumber(testCase));
	}

	public static void printTestIntToInt(int testCase) {
		System.out.println("The input is: " + testCase + ". The reverse of that is: "
				+ RevereseInputIntToInt.reverseNumber(testCase));
	}

	public static void printTestIntToIntRecursive(int testCase) {
		System.out.println("The input is: " + testCase + ". The reverse of that is: "
				+ RevereseInputIntToInt.reveresNumberRecursive(testCase));
	}

	public static void printTestRecursiveReverse(int testCase) {
		String isNegative = testCase < 0 ? "-" : "";
		testCase = testCase < 0 ? -testCase : testCase;
		System.out.print("The input is: " + testCase + ". The reverse of that is: " + isNegative);
		solvePrintingReverseNumberRecursive(testCase);

	}

	private static void solvePrintingReverseNumberRecursive(int input) {
		if (input == 0) {
			System.out.println(input);
		} else if (input < 10) {
			System.out.println(input);
		} else {
			System.out.print(input % 10);
			solvePrintingReverseNumberRecursive(input / 10);
		}
	}

}
