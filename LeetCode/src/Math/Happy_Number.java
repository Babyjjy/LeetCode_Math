package Math;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Happy_Number {

	public static void main(String[] args) {
		System.out.println();
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		if(isHappy(n) == true){
			System.out.println("Yes!!");
		}else{
			System.out.println("No!!");
		}

	}

	public static boolean isHappy(int n) {
         Set<Integer> see = new HashSet<Integer>();
         while(!see.contains(n)){
        	 see.add(n);
        	 int sum = 0;
        	 while(n > 0){
        		 sum += (n % 10) * (n % 10);
        		 n /= 10;
        	 }
        	 n = sum;
         }
         return see.contains(1);
	}

}
