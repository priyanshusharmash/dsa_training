import java.util.Scanner;

public class BackspaceStringCompare{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String t = sc.next();
		boolean ans = backspaceCompare(s,t);
		System.out.print(ans);
	}
	private static boolean backspaceCompare(String s, String t) {
		StringBuilder sb1 = new StringBuilder();
		StringBuilder sb2 = new StringBuilder();
		int i =0,j=0;
		while(s.charAt(i)=='#') i++;
		while(t.charAt(j)=='#') j++;
		while(i<s.length() && j<t.length()){
			if(s.charAt(i)=='#') {
				if(sb1.length()!=0) sb1.deleteCharAt(sb1.length()-1);
			}
			else sb1.append(s.charAt(i));
			
			if(t.charAt(j) == '#'){
				if(sb2.length() !=0) sb2.deleteCharAt(sb2.length()-1);
			}
			else sb2.append(t.charAt(j));
			i++;
			j++;
		}
		
		while(i<s.length()) {
			
			if(s.charAt(i)=='#'){
				
				if(sb1.length()!=0) sb1.deleteCharAt(sb1.length()-1);
				
			}
			else sb1.append(s.charAt(i));
			
			i++;
		}
		
		while(j<t.length()){
			if(t.charAt(j)=='#') {
				if(sb2.length()!=0) sb2.deleteCharAt(sb2.length()-1);
			}
			else sb2.append(t.charAt(j));
			j++;
		}
		System.out.println("sb1: "+sb1);
		System.out.println("sb2: "+ sb2);
		
		return sb1.toString().equals(sb2.toString());
	}
}