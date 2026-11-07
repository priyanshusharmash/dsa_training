import java.util.Scanner;

public class HIndex{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] nums = new int[n];
		for(int i =0;i<n;i++) nums[i] = sc.nextInt();
		int ans = hIndex(nums);
		System.out.print(ans);
	
	}
	
	private static int hIndex(int[] citations) {
		sort(citations,0,citations.length-1);
		int len =citations.length;
		for(int i =0;i<citations.length;i++){
			if(citations[i] >= len) return len;
			len--;
		}
		return len;
	}	
	
	private static void sort(int[] arr, int low, int high){
		if(low<high){
			int partitionIdx = partition(arr, low, high);
			sort(arr,low,partitionIdx);
			sort(arr,partitionIdx+1,high);
		}
	}
	private static int partition(int[] arr, int low, int high){
		int i = low-1,j=high+1,pivot = arr[(low+high)/2];
		while(true){
			do{
				i++;
			}while(arr[i]<pivot);
			do{
				j--;
			}while(arr[j] >pivot);
			if(i>=j) return j;
			swap(arr,i,j);
		}
	}
	private static void swap(int[] arr, int low, int high){
		int temp = arr[low];
		arr[low] = arr[high];
		arr[high]=temp;
	}
}