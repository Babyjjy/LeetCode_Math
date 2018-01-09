package Math;

import java.util.Scanner;
/*
 * ���⣺����һ��int�͵������������á�
 */
/*
 ˼·��Ҫ�����Ƿ�int��Χ
 */

public class Reverse_Integer {
	 public static final int maxint = 0x7fffffff;
	 public static final int minint = 0x80000000;
	 
	public static void main(String[] args){
		System.out.println();
		Scanner input = new Scanner(System.in);
		int x = input.nextInt();
    		System.out.println(reverse(x));
		
	}
	
        public static int reverse(int x) {
        	long ans = 0;
        	int flag = x < 0 ? -1 : 1;
        	x = Math.abs(x);
        	while (x > 0) {
				ans  = ans * 10 + (x % 10);
				x /= 10;
				if(ans > Integer.MAX_VALUE)
        		       return 0;
			}
        	
        		return (int)ans*flag; 
    }
        

}
