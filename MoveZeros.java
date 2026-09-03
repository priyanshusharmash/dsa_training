import java.util.Scanner;
import java.util.Arrays;
public class MoveZeros{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] nums = new int[n];
		for(int i =0;i<n;i++){
			nums[i] = sc.nextInt();
		}
		moveZeros(nums);
		System.out.print(Arrays.toString(nums));
	}
	private static void moveZeros(int[] nums){
		int i =0,last = -1;
		while(i<nums.length){
			while(nums[i]==0 && i<nums.length-1) i++;
			nums[++last] = nums[i];
			i++;
		}
		while(last<nums.length-1){
			nums[++last] = 0;
		}
	}
}