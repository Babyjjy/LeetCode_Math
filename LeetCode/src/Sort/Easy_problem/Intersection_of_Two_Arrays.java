package Sort.Easy_problem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

/*
 * 题意：给定两个数组，求数组的交集。输出结果中的元素唯一，输出数组可以无序。
 */
/*
 1）对数组nums1进行排序；
 2）对数组nums2进行排序；
 3）遍历数组nums1和nums2中元素，并比较对应的元素，
 若相等，则判断其值是否与结果中最后保存的元素是否相等，相等则直接变化两个索引，否则将该值保存到结果中，并变化两个索引
 不等，则变化较小元素对应的索引即可。
 */
/*
public class Intersection_of_Two_Arrays {

	public static void main(String[] args) {
		System.out.println();
		Scanner input = new Scanner(System.in);
		int[] nums1 = new int[1100];
		int[] nums2 = new int[1100];
		for (int i = 0; i < 4; i++) {
			nums1[i] = input.nextInt();
		}
		for (int i = 0; i < 2; i++) {
			nums2[i] = input.nextInt();
		}
		int mark = 0;
		Arrays.sort(nums1);
		Arrays.sort(nums2);
		ArrayList<Integer> result = new ArrayList<Integer>();
		for (int i = 0, j = 0; i < nums1.length && j < nums2.length;) {
			if (nums1[i] == nums2[j]) {
				if (result.size() == 0 || nums1[i] != mark) {
					result.add(nums1[i]);
					mark = nums1[i];
				}
				i++;
				j++;
			} else if (nums1[i] < nums2[j]) {
				i++;

			} else {
				j++;
			}

		}
		int[] res = new int[result.size()];
		for (int i = 0; i < result.size(); i++) {
			res[i] = (int) result.get(i);
		}
		for (int i = 0; i < res.length; i++) {
			System.out.printf("%d ", res[i]);
		}

	}

}*/


public class Intersection_of_Two_Arrays {

	public static void main(String[] args) {
		System.out.println();
		Scanner input = new Scanner(System.in);
		int[] nums1 = new int[1100];
		int[] nums2 = new int[1100];
		for (int i = 0; i < 4; i++) {
			nums1[i] = input.nextInt();
		}
		for (int i = 0; i < 2; i++) {
			nums2[i] = input.nextInt();
		}
		Arrays.sort(nums2);
		 HashSet<Integer> set = new HashSet<Integer>();
		  for (Integer num : nums1) {
	            if (binarySearch(nums2, num)==true) {
	                set.add(num);
	            }
	        }
	        int cnt = 0;
	        int[] res = new int[set.size()];
	        for (Integer num : set) {
	            res[cnt++] = num;
	        }
		for (int i = 0; i < res.length; i++) {
			System.out.printf("%d ", res[i]);
		}

	}
	public static boolean binarySearch(int[]nums,int target) {
		int left = 0;
		int right = nums.length - 1;
		while(left <= right){
			int mid = (left + right) / 2;
			if(nums[mid] == target){
				return true;
			}
			if(nums[mid] > target){
				right = mid - 1;
			}
			else{
				left = mid + 1;
			}
			
		}
		return false;
		
	}

}

