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
		 while (n != 0) {///�����õ�ԭ�� ��Ϊ��java�����¼��2147483648 Ĭ�ϱ�Ϊ-2147483648 ���� n >0 ������
			ans += n & 1;
			n >>>= 1;   //�޷������ƣ����Է���λ����λ����0����
		}
		 return ans;
	        
	    }

}
