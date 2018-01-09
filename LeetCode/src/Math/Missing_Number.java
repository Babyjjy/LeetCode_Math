package Math;

import java.util.Scanner;
/*
 * ����˼· ����λ����
 * 0 ^ a = a;
 * a ^ b ^ a = b;
 * �Ȳ�������ͣ�Ȼ���ȥ�����е�����
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
