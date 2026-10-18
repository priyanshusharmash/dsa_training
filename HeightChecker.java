import java.util.Scanner;
import java.util.Arrays;
public class HeightChecker{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] nums = new int[n];
		for(int i =0;i<n;i++) nums[i] = sc.nextInt();
		int ans = heightChecker(nums);
		System.out.print(ans);
	}
	
	public int heightChecker(int[] heights) {
        int[] expected = Arrays.copyOf(heights,heights.length);
        int count =0;
        mergeSort(expected,0,heights.length-1);
        for(int i =0;i<heights.length;i++){
            if(heights[i]!=expected[i]) count++;
        }
        return count;
    }
    private static void mergeSort(int[] arr, int start, int end){
        if(start>=end) return;
        int mid = (start+end)/2;
        mergeSort(arr,start,mid);
        mergeSort(arr,mid+1,end);
        merge(arr, start,mid,end);
    }
    private static void merge(int[] arr, int start, int mid, int end){
        int[] ans = new int[arr.length];
        int s1=start,s2=mid+1,current =start;
        while(s1<=mid && s2<=end){
            if(arr[s1]>arr[s2]){
                ans[current++] = arr[s2++];
            }else ans[current++] = arr[s1++];
        }
        while(s1<=mid) ans[current++] = arr[s1++];
        while(s2<=end) ans[current++] = arr[s2++];
        for(int i = start;i<=end;i++) arr[i] = ans[i];
    }
}