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
				if(!currentString.isBlank()) stringStack.push(currentString);
				currentString = "";
				num = (num*10)+ (ch-'0');
			}
			else if(ch == '[') {
				noStack.push(num);
				num =0;
			}
			else if(ch == ']'){
				currentString = (stringStack.isEmpty()? "": stringStack.pop())+(currentString.repeat(noStack.pop()));
			}
			else currentString+=ch;
			System.out.println("Current String: " + currentString);
			System.out.println("Stack: " + stringStack.toString());
		}
		return currentString;
	}
}