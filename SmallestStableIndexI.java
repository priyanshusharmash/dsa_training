import java.util.Scanner;
public class SmallestStableIndexI{
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		int n = sc.nextInt();
		int[] nums = new int[n];
		for(int i =0;i<n;i++){
			nums[i] = sc.nextInt();
		}
		int k = sc.nextInt();
		int ans = firstStableIndex(nums,k);
		System.out.print(ans);
		
	}
	//Brute Forece method
	/*
	private static int firstStableIndex(int[] nums, int k){
		int currentMin= 101,currentMax = -1;
		for(int i =0; i<nums.length;i++){
			currentMin = 101;
			currentMax = Math.max(currentMax,nums[i]);
			for(int j = i;j<nums.length;j++){
				currentMin = Math.min(currentMin,nums[j]);
			}
			
			if((currentMax - currentMin)<=k){
				return i;
			}
		}
		return minStableIdx;
	}
	*/
	
	//Optimal method
	private static int firstStableIndex(int[] nums,int k ){
		int[] prefixMax = new int[nums.length];
		int currentMax=Integer.MIN_VALUE;
		int[] suffixMin = new int[nums.length];
		int currentMin = Integer.MAX_VALUE;
		for(int i =0;i<nums.length;i++){
			currentMax = Math.max(currentMax,nums[i]);
			prefixMax[i] = currentMax;
			
			currentMin = Math.min(currentMin,nums[nums.length-1-i]);
			suffixMin[nums.length-1-i] = currentMin;
		}
		for(int i =0;i<nums.length;i++){
			if(prefixMax[i]-suffixMin[i] <= k) return i;
		}
		return -1;
	}	
}