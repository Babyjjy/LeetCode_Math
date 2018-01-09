package Math;

import java.util.Arrays;
import java.util.Scanner;

public class Maximum_Product_of_Three_Numbers {

	public static void main(String[] args) {
			System.out.println();
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int num[] = new int[n];
		for(int i = 0;i < n;i++){
			num[i] = input.nextInt();
		}
		int res = maximumProduct(num);
		System.out.println(res);

	}

	public static int maximumProduct(int[] nums) {
          if(nums.length == 0 || nums == null){
        	  return 0;
          }
          Arrays.sort(nums);
          int a = nums[nums.length - 1] *nums[nums.length - 2] * nums[nums.length - 3];
          int b = nums[0] * nums[1] * nums[nums.length - 1];
          return a > b ? a : b;
	}

}
