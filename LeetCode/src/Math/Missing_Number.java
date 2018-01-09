package Math;

import java.util.Scanner;
/*
 * 结题思路 利用位运算
 * 0 ^ a = a;
 * a ^ b ^ a = b;
 * 等差数列求和，然后减去数组中的数字
 */
public class Missing_Number {

	public static void main(String[] args) {
		System.out.println();
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int []nums = new int[n];
		
		for(int i = 0;i < n;i ++){
			nums[i]=input.nextInt();
		}
		int x = missingNumber(nums);
		System.out.println(x);

	}

	public static int missingNumber(int[] nums) {
		 if(nums == null || nums.length == 0) {
	            return 0;
	        }
		 int res = nums.length;///n
		 for(int i = 0;i < nums.length;i ++){
			 res ^= i;
			 res ^= nums[i];
		 }
		 
		return res;
//		 if(nums == null || nums.length == 0) {
//	            return 0;
//	        }
//	        int sum = (1 + nums.length) * nums.length / 2;
//	        for(int i : nums) {
//	            sum -= i;
//	        }
//	        return sum;

	}

}
