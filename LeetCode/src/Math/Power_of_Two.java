package Math;

import java.util.Scanner;
/*
 * ���⣺�ж�һ�����Ƿ���2����
 * ˼�룺��Ϊ���һ������2������ôת��Ϊ2��������һλ����1
 * ��ôֻ��Ҫ�ж�1�ĸ�������ֱ���ж�n&��n - 1�� �Ƿ�Ϊ0�Ϳ������
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
