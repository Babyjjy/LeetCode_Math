package Math;

import java.util.Scanner;

/*
 * 求n！阶乘末尾多少连续的0
 * 10^k = 5^k * 2^k
 * 找因子5的个数 原因（5的因子的个数比2少）
 */
public class Factorial_Trailing_Zeroes {

	public static void main(String[] args) {
		System.out.println();
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int cnt = trailingZeroes(n);
		System.out.println(cnt);

	}

	public static int trailingZeroes(int n) {
		int sum = 0;
		while (n > 0) {
			sum = sum + n / 5;
			n = n / 5;
			
		}
		return  sum;

	}
//	 public static int trailingZeroes(int n) {
//	       int result = 0;
//	    for(long i=5; n/i>0; i*=5){
	/*
	 * To avoid the integer overflow as @localvar mentioned below(in case of 'n >=1808548329' ), 
	 * the expression " i <= INT_MAX/5" is not a good way to prevent overflow,
	 *  because 5^13 is > INT_MAX/5 and it's valid.
       So, if you want to use "multiply", consider define the 'i' as 'long long' type.
	 */
//	        result += (n/i);
//	    }
//	    return result;
//	    }

}
