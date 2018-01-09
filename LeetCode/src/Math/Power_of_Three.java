package Math;

import java.util.Scanner;

public class Power_of_Three {

	public static void main(String[] args) {
		System.out.println();
		Scanner input = new Scanner(System.in);
		int n;
		n = input.nextInt();
		boolean flag = false;
		flag = isPowerOfThree(n);
		if(flag == true){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
		
	}
	 public static boolean isPowerOfThree(int n) {
		 if(n <= 0) return false;       
	        int k =(int) (Math.log(Integer.MAX_VALUE) / Math.log(3));
	        int big3 = (int)Math.pow(3,k);
	        return (big3 % n == 0);
	        
	    }

}
