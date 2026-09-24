import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class FourSum{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] nums = new int[n];
		for(int i = 0;i<n;i++) nums[i] = sc.nextInt();
		int target = sc.nextInt();
		List<List<Integer>> ans = fourSum(nums,target);
		System.out.print(ans.toString());
	}
	private static List<List<Integer>> fourSum(int[] nums, int target) {
		Arrays.sort(nums);
        List<List<Integer>> list = new ArrayList<>();
        int high, low;
        long sum;
        for (int i = 0; i < nums.length - 3; i++) {
            if (i > 0 && nums[i] == nums[i - 1])
                continue;
            for (int j = i + 1; j < nums.length - 2; j++) {
                if (j > i + 1 && nums[j] == nums[j - 1])
                    continue;
                low = j + 1;
                high = nums.length - 1;
                while (low < high) {
                    sum = (long) nums[i] + nums[j] + nums[low] + nums[high];
                    if (sum == target) {
                        list.add(Arrays.asList(
                                nums[i],
                                nums[j],
                                nums[low],
                                nums[high]));
                        low++;
                        high--;
                        while (low < high && nums[low] == nums[low - 1])
                            low++;
                        while (low < high && nums[high] == nums[high + 1])
                            high--;
                    } else if (sum < target)
                        low++;
                    else
                        high--;
                }
            }
        }
        return list;
	}
}