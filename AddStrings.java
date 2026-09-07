import java.util.Scanner;
public class AddStrings{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String num1 = sc.next();
		sc.nextLine();
		String num2 = sc.next();
		String ans = addStrings(num1,num2);
		System.out.print(ans);
	}
	/*
	private static String addStrings(String num1,String num2){
		int a =0,b=0,placeValue =1;
		for(int i = 0;i<num1.length();i++){
			a = a*placeValue + Integer.parseInt(num1.charAt(i)+"");
			if(placeValue ==1) placeValue *= 10;
		}
		placeValue =1;
		for(int i = 0;i<num2.length();i++){
			b = b*placeValue + Integer.parseInt(num2.charAt(i)+"");
			if(placeValue ==1) placeValue *= 10;
		}
		System.out.println("a: "+a+"b: "+b);
		return String.valueOf(a+b);
	}*/
	private static String addStrings(String num1,String num2){
		String minString,maxString;
		if(num1.length()<num2.length()) {
			minString = num1;
			maxString = num2;
		}else{
			minString=num2;
			maxString=num1;
		}
		int carry =0;
		String ans="";
		int diff=maxString.length()-minString.length();
		for(int i=maxString.length()-1;i>=maxString.length()-minString.length();i--){
			int sum = (minString.charAt(i-diff) -'0') + (maxString.charAt(i)-'0')+carry;
			ans = (sum %10) + ans;
			carry = sum/10;
		}
		System.out.println("Min string: "+minString+"Max string: "+maxString);
		System.out.println("ans: "+ans);
		for(int i = maxString.length()-minString.length()-1;i>=0;i--){
			int sum = (maxString.charAt(i)-'0') + carry;
			ans = (sum%10)+ans;
			carry =sum/10;
		}
		if(carry>0) ans = carry+ans;
		return ans;
	}
}