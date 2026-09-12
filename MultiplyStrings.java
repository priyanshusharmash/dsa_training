import java.util.Scanner;

public class MultiplyStrings{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String num1 = sc.next();
		String num2 = sc.next();
		String ans = multiplyStrings(num1,num2);
		System.out.println(ans);
	}
	
	private static String multiplyStrings(String num1, String num2){
		StringBuilder largest = new StringBuilder(num1);
		StringBuilder smaller = new StringBuilder(num2);
		while(!largest.isEmpty() && largest.charAt(0)=='0') largest.deleteCharAt(0);
		while(!smaller.isEmpty() && smaller.charAt(0)=='0') smaller.deleteCharAt(0);
		if(largest.length()==0 || smaller.length()==0) return "0";
		if(largest.length()<smaller.length()) {
			StringBuilder temp = largest;
			largest = smaller;
			smaller = temp;
		}
		String ans = "";
		for(int i =smaller.length()-1;i>=0;i--){
			char multiplier = smaller.charAt(i);
			StringBuilder sb = new StringBuilder();
			int carry = 0;
			for(int j = largest.length()-1;j>=0;j--){
				char multiplicant = largest.charAt(j);
				int mul = (multiplicant-'0') * (multiplier-'0');
				System.out.println("MUL: "+mul+ " for multiplicant "+multiplicant + " multiplier "+multiplier);
				sb.insert(0,String.valueOf((mul+carry)%10));
				carry = mul/10;
			}
			if(carry!=0) sb.insert(0,String.valueOf(carry));
			for(int j =0;j<smaller.length()-i-1;j++) sb.append('0');
			System.out.println("Current sum : " +sb.toString());
			if(ans.isBlank()) ans = sb.toString();
			else {
				ans = sum(ans,sb.toString());
			}
			System.out.println("Current answer: "+ans);
		}
		return ans;
	}
	
	
	private static String sum(String a, String b){
		String smallest = "", largest ="";
		StringBuilder sb = new StringBuilder();
		int carry =0;
		if(a.length()>b.length()) {
			largest = a;
			smallest = b;
		}else{
			smallest = a;
			largest = b;
		}
		int i = smallest.length()-1;
		int diff = largest.length() - smallest.length();
		while(i>=0){
			int num1 = smallest.charAt(i) -'0';
			int num2 = largest.charAt(i+diff) -'0';
			int sum = num1+num2+carry;
			sb.insert(0,String.valueOf(sum%10));
			carry = sum/10;
			i--;
		}
		i = largest.length()-smallest.length()-1;
		while(i>=0){
			int sum = (largest.charAt(i)-'0')+carry;
			carry = sum / 10;
			sb.insert(0,String.valueOf(sum%10));
			
			i--;
		}
		if (carry != 0) {
			sb.insert(0, String.valueOf(carry));
		}
		return sb.toString();
	}
}