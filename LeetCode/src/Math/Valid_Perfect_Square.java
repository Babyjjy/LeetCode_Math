package Math;

import java.util.Scanner;

public class Valid_Perfect_Square {
	public static void main(String[] args) {
		System.out.println();
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		if (isPerfectSquare1(n) == true)
			System.out.println("True");
		else
			System.out.println("False");

	}

	/*
	 * һ����ȫƽ�������Էֽ�Ϊ1 + 3 + 5 + 7 + ... ��Ϊ (x + 1) ^ 2 - x ^ 2 = 2 * x + 1
	 */
	public static boolean isPerfectSquare1(int num) {
		int i = 1;
		while (num > 0) {
			num -= i;
			i += 2;
		}
		if (num == 0) {
			return true;
		} else {
			return false;
		}

	}

	/*
	 * ţ�ٵ���������Ѱ��ƽ���� ��ƽ��������ת��Ϊ����y = x ^ 2 - num�ĸ� ��������x = (x + num / x) * 1/2
	 */
	public static boolean isPerfectSquare2(int num) {
		long x = num;
		while (x * x > num) {
			x = (x + num / x) >> 1;
		}
		return x * x == num;

	}

	public static boolean isPerfectSquare3(int num) {
		long left = 0, right = num;
		long mid = 0;
		while (left <= right) {
			mid = (left + right) / 2;
			if (mid * mid >= num)
				right = mid - 1;
			else
				left = mid + 1;
		}
		return left * left == num;

	}
}
