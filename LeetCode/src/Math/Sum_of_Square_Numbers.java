package Math;

import java.util.Scanner;

public class Sum_of_Square_Numbers {

	public static void main(String[] args) {
		System.out.println();
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		if (judgeSquareSum(n)) {
			System.out.println("TRUE");
		} else {
			System.out.println("False");
		}

	}

	// public static boolean judgeSquareSum(int c) {
	// if(c == 0) return true;
	// int temp;
	// for(int i = 1;i <= (int)Math.sqrt(c);i ++){
	// temp=c - (i * i);
	// if((int)(Math.sqrt(temp)) * (int)(Math.sqrt(temp)) == temp){
	// return true;
	// }
	// }
	// return false;
	//
	// }
	public static boolean judgeSquareSum(int c) {
		if (c == 0)
			return true;
		int left = 0, right = (int) Math.sqrt(c);
		while (left <= right) {
			int ans = left * left + right * right;
			if (ans < c) {
				left++;
			} else if (ans > c) {
				right--;

			} else {
				return true;
			}
		}
		return false;
	}

}
