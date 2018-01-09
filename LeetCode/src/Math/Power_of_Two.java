package Math;

import java.util.Scanner;
/*
 * 题意：判断一个数是否是2的幂
 * 思想：因为如果一个数是2的幂那么转化为2进制则有一位才是1
 * 那么只需要判断1的个数或者直接判断n&（n - 1） 是否为0就可以求解
 */
public class Power_of_Two {

	public static void main(String[] args) {
		System.out.println();
		int n;
		Scanner input =  new Scanner(System.in);
		n = input.nextInt();
		boolean ans = isPowerOfTwo(n);
		System.out.println(ans);
		
	}
public static boolean isPowerOfTwo(int n) {
	 //return n > 0 && ((n & (n - 1)) == 0 );
	if(n < 0) return false;
	return((n&(n-1))==0);
    }

}
