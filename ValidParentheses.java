import java.util.Scanner;
import java.util.Stack;
public class ValidParentheses{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		boolean ans = isValid(s);
		System.out.print(ans);
	}
	private static boolean isValid(String s){
		Stack<Character> stack = new Stack<>();
		for(int i =0;i<s.length();i++){
			char c = s.charAt(i);
			if(c == '[' || c == '(' || c == '{') stack.push(c);
			else{
				if(stack.isEmpty()) return false;
				if(c == ')' && stack.peek()!='(') return false;
				if(c == ']' && stack.peek()!='[') return false;
				if(c == '}' && stack.peek()!='{') return false;
				stack.pop();
			}
		}
		return stack.isEmpty();
	}	
}