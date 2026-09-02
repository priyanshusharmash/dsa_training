import java.util.Scanner;
public class PlusOne{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] nums = new int[n];
		for(int i =0;i<n;i++){
			nums[i] = sc.nextInt();
		}
		int[] ans = plusOne(nums);
		System.out.print("[");
		for(int i =0;i<ans.length;i++){
			if(i==ans.length-1) System.out.print(ans[i]+"]");
			else System.out.print(ans[i]+" ");
		}
	}
	public static int[] plusOne(int[] digits){
		int carry =1,sum;
		for(int i = digits.length-1;i>=0;i--){
			sum = digits[i] + carry;
			carry = sum/10;
			digits[i] = sum%10;
		}
		if(carry!=0){
			int[] ans = new int[digits.length+1];
			ans[0] = carry;
			for(int i =0;i<digits.length;i++){
				ans[i+1] = digits[i];
			}
			return ans;
		}else return digits;
	}
}