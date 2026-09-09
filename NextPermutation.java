import java.util.Scanner;
import java.util.Arrays;
public class NextPermutation{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] nums = new int[n];
		for(int i =0; i<n;i++){
			nums[i] = sc.nextInt();
		}
		nextPermutation(nums);
		System.out.print(Arrays.toString(nums));
	}
	private static void nextPermutation(int[] nums){
		int i = nums.length-2;
		while(i>=0){
			if(i>=0 && nums[i] < nums[i+1]) break;
			i--;
		}
		int right = nums.length-1;
		if(i==-1) {
			Arrays.sort(nums);
			return;
		}
		System.out.println("I : "+i);
		while(right>i){
			if(nums[right]>nums[i]){
				swap(nums,right,i);
				break;
			}
			right--;
		}
		reverse(nums,i+1,nums.length-1);
	}
	private static void swap(int[] nums, int a,int b){
		int temp = nums[a];
		nums[a] = nums[b];
		nums[b] = temp;
	}
	private static void reverse(int[] nums, int start,int end){
		while(start<end){
			nums[start] = nums[start]+nums[end];
			nums[end] = nums[start]-nums[end];
			nums[start] = nums[start++]-nums[end--];
		}
	}
}