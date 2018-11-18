package uk.gergely.kiss.howtoreverseanumber;

import uk.gergely.kiss.howtoreverseanumber.utils.PrintUtil;

public class HowToReverseANumber {
	public static void main(String[] args) {
		int test1 = 12345;
		int test2 = -67890;
		int test3 = 0;
		int test4 = 111000;
		int test5 = -230000400;

		PrintUtil.printTestIntToString(test1);
		PrintUtil.printTestIntToString(test2);
		PrintUtil.printTestIntToString(test3);
		PrintUtil.printTestIntToString(test4);
		PrintUtil.printTestIntToString(test5);

		PrintUtil.printTestIntToInt(test1);
		PrintUtil.printTestIntToInt(test2);
		PrintUtil.printTestIntToInt(test3);
		PrintUtil.printTestIntToInt(test4);
		PrintUtil.printTestIntToInt(test5);

		PrintUtil.printTestIntToIntRecursive(test1);
		PrintUtil.printTestIntToIntRecursive(test2);
		PrintUtil.printTestIntToIntRecursive(test3);
		PrintUtil.printTestIntToIntRecursive(test4);
		PrintUtil.printTestIntToIntRecursive(test5);

		PrintUtil.printTestRecursiveReverse(test1);
		PrintUtil.printTestRecursiveReverse(test2);
		PrintUtil.printTestRecursiveReverse(test3);
		PrintUtil.printTestRecursiveReverse(test4);
		PrintUtil.printTestRecursiveReverse(test5);
	}
}
