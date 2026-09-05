import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
public class ThreeSum{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] nums = new int[n];
		for(int i =0;i<n;i++){
			nums[i] = sc.nextInt();
		}
		List<List<Integer>> ans = threeSum(nums);
		System.out.println(ans.toString());
	}
	private static List<List<Integer>> threeSum(int[] nums){
		List<List<Integer>> list = new ArrayList<>();
		Arrays.sort(nums);
		for(int i =0;i<nums.length;i++){
			if(i>0 && nums[i]==nums[i-1]) continue;
			int target = nums[i];
			int low = i+1,high=nums.length-1;
			while(low<high){
				if(nums[low]+nums[high]+target == 0) {
					list.add(Arrays.asList(target,nums[low++],nums[high--]));
					while(low<high && nums[low]== nums[low-1]) low++;
					while(low<high && nums[high]==nums[high+1]) high++;
				}
				else if(nums[low]+nums[high]+target <0) low++;
				else high--;
			}
		}
		return list;
	}
}