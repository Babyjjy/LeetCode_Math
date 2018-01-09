package Math;

import java.util.Scanner;

public class Palindrome_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println();
	 
		Scanner input = new Scanner(System.in);
		int n;
		while (input.hasNext()) {
			n = input.nextInt();
			boolean res = isPalindrome(n);
			if (res == true) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}

	}

//	public static boolean isPalindrome(int x) {
//		if (x < 0) {
//			return false;
//		}
//		String str = String.valueOf(x);
//		for (int i = 0; i < str.length() / 2; i++) {
//			if (str.charAt(i) == str.charAt(str.length() - 1 - i)) {
//				continue;
//			} else {
//				return false;
//			}
//		}
//		return true;
//
//	}
	public static boolean isPalindrome(int x){
		if(x < 0){
			return false;
		}
		int cnt = 0;
		int temp = x;
		while (temp != 0) {
			temp /= 10;
			cnt ++;
			
		}
		for(int i = 1;i <= cnt;i ++){
			//大端表示法 高位在低 低位在高
			int high = cnt - i + 1;
			int low = i;
			if(getDigit(x, high) != getDigit(x, low)){
				return false;
			}
		}
		return true;
	}
	public static int getDigit(int x,int i) {
		if(i == 1){
			return x % 10;
		}
		return  (x / (int)Math.pow(10,i - 1)) % 10;
	}

}
