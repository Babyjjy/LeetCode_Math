package Bit_Manipulation;

import java.util.Scanner;
/*
 * ��⣺���ȸ���Power of Two�еĽⷨ��
 * ����֪��num & (num - 1)���������ж�һ�����Ƿ�Ϊ2�Ĵη�����
 * ����һ��˵�����Ƕ����Ʊ�ʾ�£�ֻ�����λ��1����ô������2�Ĵη�������һ����4�Ĵη���������8��
 * �������ǻ�Ҫ�������޶�������������ϸ�۲���Է��֣�4�Ĵη��������λ��1��������λ��
 * ��ô����ֻ������һ����(0x55555555) <==> 1010101010101010101010101010101��
 * ����õ����������䱾������Կ϶���Ϊ4�Ĵη�����
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
