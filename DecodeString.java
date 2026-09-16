import java.util.Scanner;
import java.util.Stack;

public class DecodeString{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		String ans = decodeString(str);
		System.out.print(ans);
	}
	private static String decodeString(String s){
		String currentString = "";
		int num =0;
		Stack<Integer> noStack = new Stack<>();
		Stack<String> stringStack = new Stack<>();
		for(char ch : s.toCharArray()){
			
			if(Character.isDigit(ch)){
				num = (num*10)+ (ch-'0');
			}
			else if(ch == '[') {
				noStack.push(num);
				stringStack.push(currentString);
				currentString = "";
				num = 0;
			}
			else if(ch == ']') {
				int count = noStack.pop();
				String previous = stringStack.pop();

				currentString = previous + currentString.repeat(count);
			}
			else currentString+=ch;
		}
		return currentString;
	}
}