import java.util.Scanner;
public class RemoveDuplicatesFromSortedArray{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] nums = new int[n];
		for(int i =0;i<n;i++){
			nums[i] = sc.nextInt();
		}
		int ans = removeDuplicates(nums);
		System.out.print("[");
		for(int i = 0;i<ans;i++){
			if(i == ans-1) System.out.println(nums[i]+"]");
			else System.out.print(nums[i]+" ");
		}
		System.out.print(ans);
	}
	private static int removeDuplicates(int[] nums){
		int i =1, prev= nums[0],last=0,count =1;
		while(i<nums.length){
			while(i<nums.length && nums[i] == prev) i++;
			if(i>=nums.length) break;
			prev = nums[i];
			nums[++last] = nums[i];
			count++;
			i++;
		}
		return count;
	}
}