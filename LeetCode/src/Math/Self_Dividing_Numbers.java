package Math;

import java.awt.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Self_Dividing_Numbers {

	public static void main(String[] args) {
		int left = 1;
		int right = 22;
		Scanner input = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i = left; i <= right;i ++){
			if(Check(i))
				list.add(i);
		}
		for(int ss: list){
			System.out.println(ss);
		}
		
	}
	
	public static boolean Check(int num) {
		int n = num;
		while (num != 0) {
			int mod = num % 10;
			if(mod  == 0) return false;
			else{
				if(n % mod == 0) {num /= 10;continue;}
				else return false;
			}
		}
		return true;
	}
	
}
