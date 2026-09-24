import java.util.Scanner;
import java.util.Arrays;

public class ThreeSumClosest{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] nums = new int[n];
		for(int i =0;i<n;i++) nums[i] = sc.nextInt();
		int target = sc.nextInt();
		int ans = threeSumClosest(nums,target);
		System.out.print(ans);
	}
	private static int threeSumClosest(int[] nums, int target) {
		Arrays.sort(nums);
        int lowestDiff = Integer.MAX_VALUE,low,high, closestSum=0;
        int sum;
        for(int i =0;i<nums.length-2;i++){
            low = i+1;
            high=nums.length-1;
            while(low<high){
                sum = nums[i]+nums[low]+nums[high];
                if(Math.abs(sum-target)<lowestDiff){
                    lowestDiff = Math.abs(sum-target);
                    closestSum = sum;
                }
                if(sum<target) low++;
                else high--;
            }
        }
        return closestSum;
	}
}