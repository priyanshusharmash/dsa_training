import java.util.Scanner;
import java.util.Arrays;

public class SelectionSort{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] nums = new int[n];
		for(int i =0;i<n;i++) nums[i] = sc.nextInt();
		sort(nums);
		System.out.print(Arrays.toString(nums));
	}
	private static void sort(int[] arr){
		int min = 0;
		for(int i =0;i<arr.length;i++){
			min = i;
			for(int j = i+1;j<arr.length;j++){
				if(arr[min]>arr[j]) min = j;
			}
			int temp =arr[i];
			arr[i] = arr[min];
			arr[min] = temp;
		}
	}
}