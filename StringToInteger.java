import java.util.Scanner;

public class StringToInteger{
	public static void main(String[] arg){
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int ans = stringToInteger(str);
		System.out.print(ans);
	}
	private static int stringToInteger(String str){
		if(str.isEmpty()) return 0;
		StringBuilder trimmedString = new StringBuilder(str.trim());
		long longNumber = 0;
		boolean signedFound = false;
		if(trimmedString.charAt(0)== '-'){
			signedFound=true;
			trimmedString.deleteCharAt(0);
		}if(trimmedString.isEmpty()) return 0;
		if(trimmedString.charAt(0) == '+') trimmedString.deleteCharAt(0);
		for(char ch:trimmedString.toString().toCharArray()){
			System.out.println("Current Digit: "+ch);
			if(Character.isDigit(ch)){
				int currentNumber = Integer.parseInt(String.valueOf(ch));
				if(longNumber*10 + currentNumber > Integer.MAX_VALUE) {
					longNumber = Integer.MAX_VALUE;
					break;
				}
				longNumber = longNumber*10 + currentNumber;
			}else{
				break;
			}
		}
		if(signedFound){
			if(longNumber == Integer.MAX_VALUE) return Integer.MIN_VALUE;
			else return (int)(longNumber-(longNumber*2));
		}else return (int)longNumber;
	}
}