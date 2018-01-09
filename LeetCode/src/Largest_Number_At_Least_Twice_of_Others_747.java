import java.util.Arrays;
import java.util.Scanner;

public class Largest_Number_At_Least_Twice_of_Others_747 {
	public static void main(String[] args) {
		System.out.println();
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int[] nums = new int[n];
		for(int i = 0;i < n;i ++){
			nums[i] = input.nextInt();
		}
		int index = dominantIndex(nums);
		System.out.println(index);
	}

	public static  int dominantIndex(int[] nums) {
		if(nums.length == 1) return 0;
		int MAX = 0;
		int index = -1;
		for(int i = 0;i < nums.length;i ++){
			if(nums[i] >= MAX){
				index = i;
				MAX = nums[i];
			}
		}
		Arrays.sort(nums);
		if(MAX >= 2 * nums[nums.length - 2]){
			return index;
		}
		return -1;

	}
}
