/**
 * Given a rotated sorted array, recover it to sorted array in-place.
 * Clarification
 * What is rotated array?
 * For example, the orginal array is [1,2,3,4],
 * The rotated array of it can be [1,2,3,4], [2,3,4,1], [3,4,1,2], [4,1,2,3]
 * Example
 * [4, 5, 1, 2, 3] -> [1, 2, 3, 4, 5]
 * 
 * 
 */
package n.series.BinarySearchandSortedSearch;

import java.util.ArrayList;
import java.util.Arrays;

public class RecoverSortedArray {

	public void recoverRotatedSortedArray(ArrayList<Integer> nums) {
		// write your code
		for (int index = 0; index < nums.size() - 1; index++) {
			if (nums.get(index) > nums.get(index + 1)) {
				reverse(nums, 0, index);
				reverse(nums, index + 1, nums.size() - 1);
				reverse(nums, 0, nums.size() - 1);
				return;
			}
		}
	}

	private void reverse(ArrayList<Integer> nums, int start, int end) {
		for (int i = start, j = end; i < j; i++, j--) {
			int tmp = nums.get(i);
			nums.set(i, nums.get(j));
			nums.set(j, tmp);
		}
	}

	public void recoverRotatedSortedArray(int[] nums) {
		for (int index = 0; index < nums.length - 1; index++) {
			if (nums[index] > nums[index + 1]) {
				reverse(nums, 0, index);
				reverse(nums, index + 1, nums.length - 1);
				reverse(nums, 0, nums.length - 1);
			}
		}
	}

	private void reverse(int[] nums, int start, int end) {
		for (int i = start, j = end; i < j; i++, j--) {
			int tmp = nums[i];
			nums[i] = nums[j];
			nums[j] = tmp;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> nums = new ArrayList<Integer>();
		nums.add(4);
		nums.add(5);
		nums.add(1);
		nums.add(2);
		nums.add(3);
		System.out.println(nums.toString());
		RecoverSortedArray recoverSortedArray = new RecoverSortedArray();
		recoverSortedArray.recoverRotatedSortedArray(nums);
		System.out.println(nums.toString());
		int[] numbers = new int[] { 4, 5, 1, 2, 3 };
		System.out.println("numbers init : " + Arrays.toString(numbers));
		recoverSortedArray.recoverRotatedSortedArray(numbers);
		System.out.println("numbers : " +  Arrays.toString(numbers));

	}

}
