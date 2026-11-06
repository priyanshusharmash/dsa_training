import java.util.Scanner;
import java.util.Arrays;
public class WiggleSortII{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] nums = new int[n];
		for(int i =0;i<n;i++) nums[i] = sc.nextInt();
		wiggleSort(nums);
		System.out.print(Arrays.toString(nums));		
	}
	private static void wiggleSort(int[] nums) {
		int[] temp = Arrays.copyOf(nums,nums.length);
		
		quickSort(temp,0,temp.length-1);
		int i =1,j =temp.length-1;
		while(i<nums.length){
			nums[i] = temp[j--];
			i=i+2;
		}
		i=0;
		while(i<nums.length){
			nums[i] = temp[j--];
			i=i+2;
		}
	}
	private static void quickSort(int[] nums,int low, int high){
		if(low<high){
			int partitionIdx = partition(nums,low,high);
			quickSort(nums,low,partitionIdx);
			quickSort(nums,partitionIdx+1,high);
		}
	}
	private static int partition(int[] nums, int low, int high){
		int i =low-1, j =high+1, pivot = nums[(low + high) / 2];
		while(true){
			do{
				i++;
			}while(nums[i]<pivot);
			do{
				j--;
			}while(nums[j]>pivot);
			if(i>=j) return j;
			swap(nums,i,j);
		}
	}
	private static void swap(int[] nums, int low, int high){
		int temp = nums[low];
		nums[low] = nums[high];
		nums[high] = temp;
	}
}