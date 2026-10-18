import java.util.Scanner;
import java.util.Arrays;

public class MergeSort{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] nums = new int[n];
		for(int i =0;i<n;i++) nums[i] = sc.nextInt();
		mergeSort(nums,0,n-1);
		System.out.print(Arrays.toString(nums));
	}
	
	private static void mergeSort(int[] nums,int start, int end){
		if(start>=end) return;
		int mid = (start+end)/2;
		mergeSort(nums,start,mid);
		mergeSort(nums,mid+1,end);
		merge(nums,start,mid,end);
	}
	
	private static void merge(int[] arr, int start,int mid, int end){
		int s1 = start, s2 = mid+1,current =start;
		int[] temp = new int[arr.length];
		while(s1<=mid && s2<=end){
			if(arr[s1]>arr[s2]){
				temp[current++]=arr[s2++];
			}else{
				temp[current++] = arr[s1++];
			}
		}
		while(s1<=mid) temp[current++] = arr[s1++];
		while(s2<=end) temp[current++] = arr[s2++];
		for(int i =start;i<=end;i++) arr[i] = temp[i];
	}
	private static void swap(int[] arr,int a, int b){
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}
}