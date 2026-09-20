import java.util.Scanner;
import java.util.Stack;
import java.util.Set;
import java.util.HashSet;

public class MinimumRemoveToMakeValidParentheses{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String ans = minRemoveToMakeValid(s);
		System.out.print(ans);
	}
	private static String minRemoveToMakeValid(String s) {
		Stack<Integer> stack = new Stack<>();
		Set<Integer> set = new HashSet<>();
		for(int i =0;i<s.length();i++){
			char current = s.charAt(i);
			if(current == '(') stack.push(i);
			if(current== ')') {
				if(stack.isEmpty()) set.add(i);
				else stack.pop();
			}
		}
		while(!stack.isEmpty()) set.add(stack.pop());
		StringBuilder sb = new StringBuilder();
		for(int i =0;i<s.length();i++){
			if(set.contains(i)) continue;
			else sb.append(s.charAt(i));
		}
		return sb.toString();
	}
}