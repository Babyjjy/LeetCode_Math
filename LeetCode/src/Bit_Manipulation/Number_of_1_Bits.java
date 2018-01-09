package Bit_Manipulation;

import java.util.Scanner;

public class Number_of_1_Bits {

	public static void main(String[] args) {
		System.out.println();
		Scanner input = new Scanner(System.in);
		int n;
		n = input.nextInt();
		int cnt = 0;
		cnt = hammingWeight(n);
		System.out.println(cnt);

	}
	 public static int hammingWeight(int n) {
		 int ans = 0;
		 while (n != 0) {///这样用的原因 因为在java中如果录入2147483648 默认变为-2147483648 所以 n >0 不严密
			ans += n & 1;
			n >>>= 1;   //无符号右移，忽略符号位，空位都以0补齐
		}
		 return ans;
	        
	    }

}
