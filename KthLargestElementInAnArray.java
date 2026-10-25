import java.util.Scanner;

public class KthLargestElementInAnArray{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] nums = new int[n];
		for(int i =0;i<n;i++) nums[i] = sc.nextInt();
		int k = sc.nextInt();
		int ans = findKthLargest(nums,k);
		System.out.print(ans);
	}
	private static int findKthLargest(int[] nums, int k) {
		return quickSelect(nums,0,nums.length-1,nums.length-k);
	}
	private static int quickSelect(int[] arr, int low, int high, int targetIdx){
		int partitionIndex = partitionIndex(arr,low,high);
		if(partitionIndex== targetIdx) return arr[partitionIndex];
		else if(partitionIndex < targetIdx) return quickSelect(arr,partitionIndex+1,high, targetIdx);
		else return quickSelect(arr,low,partitionIndex-1,targetIdx);
	}
	private static int partitionIndex(int[] arr, int low, int high){
		int i = low, j = high, pivot = arr[low];
		while(i<j){
			while(i<high && arr[i]<=pivot)i++;
			while(j>low && arr[j] >pivot) j--;
			if(i<j) swap(arr,i,j);
		}
		swap(arr,low,j);
		return j;
	}
	/*
	
	private static int findKthLargest(int[] nums, int k) {
		quickSort(nums,0,nums.length-1);
		return nums[nums.length-k];
	}

	private static int partitionIndex(int[] arr, int low, int high){
		int i =low-1,j=high+1,pivot = arr[low];
		while (true) {
			do {
				i++;
			} while (arr[i] < pivot);

			do {
				j--;
			} while (arr[j] > pivot);

			if (i >= j) {
				return j;
			}
			swap(arr, i, j);
		}
	}
	*/
	private static void swap(int[] arr, int low, int high){
		int temp = arr[low];
		arr[low] = arr[high];
		arr[high] = temp;
	}
}