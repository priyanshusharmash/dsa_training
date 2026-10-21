import java.util.Scanner;
import java.util.Arrays;

public class RelativeSortArray{
	public static void main(String[] args){
		Scanner  sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] nums = new int[n];
		int[] nums2 = new int[m];
		for(int i =0;i<n;i++) nums[i] = sc.nextInt();
		for(int i =0;i<m;i++) nums2[i] = sc.nextInt();
		int[] ans = relativeSortArray(nums,nums2);
		System.out.print(Arrays.toString(ans));		
	}
	private static int[] relativeSortArray(int[] arr1, int[] arr2) {
		int right = 0, start = -1;
		while (right < arr2.length) {
			int current = start + 1;
			while (current < arr1.length) {
				if (arr1[current] == arr2[right]) swap(arr1, current, ++start);
				current++;
			}
			right++;
		}
		Arrays.sort(arr1, start + 1, arr1.length);
		return arr1;
	}

	private static void swap(int[] arr,int a, int b){
		int temp = arr[a];
		arr[a]=arr[b];
		arr[b] = temp;
	}
}