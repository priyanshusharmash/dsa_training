import java.util.Scanner;

public class StringToInteger{
	public static void main(String[] arg){
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int ans = stringToInteger(str);
		System.out.print(ans);
	}
	private static int stringToInteger(String str){
		if (str.isEmpty()) return 0;
		String trimmedString = str.trim();
		if (trimmedString.isEmpty()) return 0;
		int index = 0;
		boolean negative = false;
		if (trimmedString.charAt(index) == '+' || trimmedString.charAt(index) == '-') {
			negative = trimmedString.charAt(index) == '-';
			index++;
		}
		long number = 0;
		while (index < trimmedString.length()) {
			char ch = trimmedString.charAt(index);
			if (!Character.isDigit(ch)) {
				break;
			}
			int digit = ch - '0';
			long limit = negative? -(long) Integer.MIN_VALUE: Integer.MAX_VALUE;
			if (number > (limit - digit) / 10) {
				return negative? Integer.MIN_VALUE: Integer.MAX_VALUE;
			}
			number = number * 10 + digit;
			index++;
		}
		return negative ? (int) -number : (int) number;
	}
}