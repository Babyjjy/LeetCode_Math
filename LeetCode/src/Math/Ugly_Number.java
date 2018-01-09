package Math;

import java.util.Scanner;
/*
 * 题意:丑数是一个正数，它的质因子只包括2、3、5。
 */
public class Ugly_Number {

	public static void main(String[] args) {
		System.out.println();
		Scanner inputScanner = new Scanner(System.in);
		int n = inputScanner.nextInt();
		if (isUgly(n) == true) {
			System.out.println("Yes!!");
		} else {
			System.out.println("No!!");
		}

	}

	public static boolean isUgly(int num) {
		if (num == 1)
			return true;
		if (num == 0)
			return false;
		while (num % 2 == 0)
			num /= 2;
		while (num % 3 == 0)
			num /= 3;
		while (num % 5 == 0)
			num /= 5;
		return num == 1;

	}
}
