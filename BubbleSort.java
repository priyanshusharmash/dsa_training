import java.util.Scanner;
import java.util.Arrays;

public class BubbleSort{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] nums = new int[n];
		for(int i =0;i<n;i++) nums[i] = sc.nextInt();
		sort(nums);
		System.out.print(Arrays.toString(nums));
	}
	private static void sort(int[] nums){
		for(int i =0;i<nums.length;i++){
			for(int j =0;j<nums.length-1;j++){
				if(nums[j]>nums[j+1]){
					int temp = nums[j];
					nums[j] = nums[j+1];
					nums[j+1] = temp;
				}
			}
		}
	}
}