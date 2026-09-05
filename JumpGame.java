import java.util.Scanner;
public class JumpGame{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] nums = new int[n];
		for(int i =0;i<n;i++){
			nums[i] = sc.nextInt();
		}
		boolean ans = canReach(nums);
		System.out.print(ans);
	}
	private static boolean canReach(int[] nums){
		int max = 0;
        for (int i = 0; i < nums.length; i++) {
           if(i>max) return false;
            max = Math.max(max, i + nums[i]);
        }
        return true;
	}
}