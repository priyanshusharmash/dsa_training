import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
public class FindAllNumbersDisappearedInAnArray{
	public static void main(String[] ags){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] nums = new int[n];
		for(int i =0;i<n;i++){
			nums[i] = sc.nextInt();
		}
		List<Integer> ans = findDisappearedNumbers(nums);
		System.out.println(ans.toString());
	}
	private static List<Integer> findDisappearedNumbers(int[] nums){
		List<Integer> list = new ArrayList<>();
		boolean[] arr = new boolean[nums.length];
		for(int i =0;i<nums.length;i++){
			arr[nums[i]-1]= true;
		}
		for(int i =0;i<nums.length;i++){
			if(!arr[i]) list.add(i+1);
		}
		return list;
	}
}