import java.util.Scanner;
import java.util.Arrays;

public class QuickSort{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] nums = new int[n];
		for(int i =0;i<n;i++) nums[i] = sc.nextInt();
		quickSort(nums,0,nums.length-1);
		System.out.print(Arrays.toString(nums));
	}
	private static void quickSort(int[] arr,int low, int high){
		if(low<high){
			int partitionIndex = partition(arr,low,high);
			quickSort(arr,low,partitionIndex);
			quickSort(arr,partitionIndex+1,high);
		}
	}
	private static int partition(int[] arr, int low, int high){
		int pivot = arr[low];
		int i =low,j=high;
		while(i<j){
			while(i<=high && arr[i]<=pivot) i++;
			while(j>=low && arr[j] > pivot) j--;
			if(i<j) swap(arr,i,j);
		}
		swap(arr,low,j);
		return j;
	}
	private static void swap(int[] arr, int low, int high){
		int temp = arr[low];
		arr[low] = arr[high];
		arr[high] = temp;
	}
}