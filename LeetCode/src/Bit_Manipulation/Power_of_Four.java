package Bit_Manipulation;

import java.util.Scanner;
/*
 * 题解：首先根据Power of Two中的解法，
 * 我们知道num & (num - 1)可以用来判断一个数是否为2的次方数，
 * 更进一步说，就是二进制表示下，只有最高位是1，那么由于是2的次方数，不一定是4的次方数，比如8，
 * 所以我们还要其他的限定条件，我们仔细观察可以发现，4的次方数的最高位的1都是奇数位，
 * 那么我们只需与上一个数(0x55555555) <==> 1010101010101010101010101010101，
 * 如果得到的数还是其本身，则可以肯定其为4的次方数：
 */
public class Power_of_Four {

	public static void main(String[] args) {
		System.out.println();
		Scanner input = new Scanner(System.in);
		int n;
		n = input.nextInt();
		boolean flag = false;
		flag = isPowerOfFour(n);
		if(flag == true){
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}

	}

	public static boolean isPowerOfFour(int num) {
		return ((num > 0) &&(num&(num-1))==0 &&(num & 0x55555555) != 0 );

	}

}
