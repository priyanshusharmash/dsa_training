import java.util.Scanner;
import java.util.Arrays;

public class SortColors{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] nums= new int[n];
		for(int i =0;i<n;i++) nums[i] = sc.nextInt();
		sortColors(nums);
		System.out.print(Arrays.toString(nums));
	}
	private static void sortColors(int[] nums){
		int low = 0,mid=0,high=nums.length-1;
		while(mid<=high){
			if(nums[mid]==2) {
				swap(nums,mid,high);
				high--;
			}
			else if(nums[mid] ==1) mid++;
			else {
				swap(nums,low,mid);
				low++;
				mid++;
			}
		}
	}
	private static void swap(int[] nums, int a ,int b){
		int temp = nums[a];
		nums[a] = nums[b];
		nums[b] = temp;
	}
}