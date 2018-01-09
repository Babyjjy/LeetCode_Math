package Math;
/*
 * 给定一个非负整型数字，重复相加其所有的数字直到最后的结果只有一位数。

例如：

给定sum = 38，这个过程就像是：3 + 8 = 11，1 + 1 = 2，因为2只有一位数，所以返回它。

紧接着：

你可以不用循环或递归在O(1)时间内完成它吗？
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
