import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class SubarraysDistinctElementSumOfSquaresI{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		List<Integer> nums = new ArrayList<>();
		for(int i =0;i<n;i++) {
			int num = sc.nextInt();
			nums.add(num);
		}
		int ans = sumCounts(nums);
		System.out.print(ans);
	}
	/*
	private static int sumCounts(List<Integer> nums) {
		Set<Integer> set = new HashSet<>();
		int count = 0;
		for(int i =0;i<nums.size();i++){
			for(int j = i;j<nums.size();j++){
				set.add(nums.get(j));
				count += (set.size()*set.size());
			}
			set.clear();
		}
		return count;
	}
	*/
	
	
	private static int sumCounts(List<Integer> nums){
		int count =0;
		for (int i = 0; i < nums.size(); i++) {
			int[] arr = new int[101];
			int currentCount = 0;
			for (int j = i; j < nums.size(); j++) {
				if (arr[nums.get(j)] == 0) {
					currentCount++;
				}
				arr[nums.get(j)]++;
				count += currentCount * currentCount;
			}
		}
		return count;
	}

}