import java.util.Scanner;

public class MinimumRecolorsToGetKConsecutiveBlackBlocks{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int k = sc.nextInt();
		int ans = minimumRecolors(str,k);
		System.out.print(ans);
	}
	private static int minimumRecolors(String blocks, int k){
		int left =0, right =0, min = k, current =0;
		for(right=0 ; right< k; right++) if(blocks.charAt(right)=='W') current++;
		while(right<blocks.length()){
			min = Math.min(min, current);
			if(blocks.charAt(right)=='W') current++;
			if(blocks.charAt(left)=='W') current--;
			left++;
			right++;
		}
		min = Math.min(min,current);
		return min;
	}

}