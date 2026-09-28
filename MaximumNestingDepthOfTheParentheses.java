import java.util.Scanner;
import java.util.Stack;

public class MaximumNestingDepthOfTheParentheses{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int ans = maxDepth(str);
		System.out.print(ans);
	}
	private static int maxDepth(String s) {
		
		int count =0,currentCount=0;
		for(char ch:s.toCharArray()){
			if(ch == '(') {
				currentCount++;
			}else if(ch == ')'){
				count = Math.max(count,currentCount);
				currentCount--;
			}
		}
		return count;
	}
}