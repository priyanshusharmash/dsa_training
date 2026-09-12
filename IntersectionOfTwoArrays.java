import java.util.Scanner;
import java.util.Arrays;
import java.util.Set;
import java.util.HashSet;
public class IntersectionOfTwoArrays{
	public static void main(String[] strs){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr1 = new int[n];
		for(int i =0;i<n;i++){
			arr1[i] = sc.nextInt();
		}
		int m = sc.nextInt();
		int[] arr2 = new int[m];
		for(int i =0;i<m;i++) arr2[i] = sc.nextInt();
		int[] ans = intersection(arr1,arr2);
		System.out.print(Arrays.toString(ans));
	}
	
	private static int[] intersection(int[] nums1,int[] nums2){
		Set<Integer> set = new HashSet<>();
		Set<Integer> ans = new HashSet<>();
		for(int num:nums1) set.add(num);
		for(int num:nums2){
			if(set.contains(num)) ans.add(num);
		}
		return ans.stream().mapToInt(Integer::intValue).toArray();
	}
	
	
}