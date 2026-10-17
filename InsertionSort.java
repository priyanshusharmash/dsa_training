import java.util.Scanner;
import java.util.Arrays;

public class InsertionSort{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] nums = new int[n];
		for(int i =0;i<n;i++) nums[i] = sc.nextInt();
		sort(nums);
		System.out.print(Arrays.toString(nums));
	}
	private static void sort(int[] nums){
		int j  =0;
		for(int i =0;i<nums.length;i++){
			j=i;
			while(j>0 && nums[j-1]>nums[j]){
				int temp = nums[j];
				nums[j] = nums[j-1];
				nums[j-1] = temp;
				j--;
			}
		}
	}
}