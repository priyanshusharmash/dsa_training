import java.util.Scanner;
import java.util.Arrays;
public class DifuseTheBomb{
	public static void main(String[] args){
		Scanner sc  = new Scanner(System.in);
		int n = sc.nextInt();
		int[] nums = new int[n];
		for(int i =0;i<n;i++) nums[i] = sc.nextInt();
		int k = sc.nextInt();
		int[] ans = decrypt(nums,k);
		System.out.print(Arrays.toString(ans));
	}
	private static int[] decrypt(int[] code, int k) {
		int i =0,j=0,sum =0;
		int[] ans = new int[code.length];
		if(k ==0) return ans;
		if(k<0) {
			i = code.length-1;
			j = code.length-1;
		}
		if(k>0){
			while(j-i<k){
				j++;
				sum+=code[j%code.length];
			}
			while(i<code.length){
				ans[i] = sum;
				i++;
				sum+= code[(++j)%code.length];
				if(i<code.length)sum -=code[i];
			}
		}else{
			while(j-i>k){
				j--;
				sum+=code[Math.floorMod(j,code.length)];
			}
			while(i>=0){
				ans[i] = sum;
				i--;
				j=Math.floorMod(j-1,code.length);
				sum+=code[j];
				if(i>=0)sum-=code[i];
			}
		}
		return ans;
	}
}