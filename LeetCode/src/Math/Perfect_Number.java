package Math;

import java.util.Scanner;

public class Perfect_Number {

	public static void main(String[] args) {
		System.out.println();
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		if(checkPerfectNumber(n) == true){
			System.out.println("YEs!!");
		}
		else {
			System.out.println("No!!");
		}
	}

	public static boolean checkPerfectNumber(int num) {
		if(num == 1) {
			return false;
		}
		int sum = 1,sqrt=(int)Math.sqrt(num);
		for(int i = 2;i <= sqrt; i ++){
			if(num % i ==0){
				sum += i + (i * i == num? 0 : num / i);
			}
		}
		return sum == num;
	}

}
