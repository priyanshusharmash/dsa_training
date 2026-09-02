import java.util.Scanner;
public class RemoveElement{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] nums = new int[n];
		for(int i =0;i<n;i++){
			nums[i] = sc.nextInt();
		}
		int k = sc.nextInt();
		int ans = removeElement(nums,k);
		System.out.print("[");
		for(int i =0; i<ans;i++){
			if(i == ans-1) System.out.println(nums[i]+"]");
			else System.out.print(nums[i] + " ");
		}
		System.out.print(ans);
	}
	
	private static int removeElement(int[] nums, int k){
		int count =0,last = -1;
		for(int i =0;i<nums.length;i++){
			if(k != nums[i]){
				count++;
				nums[++last] = nums[i];
			}
		}
		return count;
	}
}