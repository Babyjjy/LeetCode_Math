package Math;
/*
 * ����һ���Ǹ��������֣��ظ���������е�����ֱ�����Ľ��ֻ��һλ����

���磺

����sum = 38��������̾����ǣ�3 + 8 = 11��1 + 1 = 2����Ϊ2ֻ��һλ�������Է�������

�����ţ�

����Բ���ѭ����ݹ���O(1)ʱ�����������
 */
import java.util.Scanner;

public class Add_Digits {

	public static void main(String[] args) {
		System.out.println();
		Scanner input = new Scanner(System.in);
		int n;
		n = input.nextInt();
		int t = addDigits(n);
		System.out.println(t);

	}

	public static int addDigits(int num) {
		if(num == 0) return 0;
		return ( (num - 1)%9 + 1);

	}

}
