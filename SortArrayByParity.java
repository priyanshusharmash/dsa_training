import java.util.Scanner;
import java.util.Arrays;
public class SortArrayByParity{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] nums = new int[n];
		for(int i =0;i<n;i++) nums[i] = sc.nextInt();
		int[] ans = sortArrayByParity(nums);
		System.out.print(Arrays.toString(ans));
	}
	private static int[] sortArrayByParity(int[] nums) {
		for (int i = 0; i < nums.length; i++){
			if (nums[i] % 2 == 0) {
				int temp = nums[i];
                nums[i] = nums[low];
                nums[low] = temp;
                low++;
            }
        }
        return nums;
	}
	
}