import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;
public class HappyNumber{
	public static void main(String[] str){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		boolean ans = happyNumber(n);
		System.out.print(ans);
	}
	
	private static boolean happyNumber(int n){
		Set<Integer> set = new HashSet<>();
		while(true){

			if(set.contains(n)) return false;
			else set.add(n);
			n= calculateSquareSum(n);
			if(n==1) return true;
		}
	}
	
	private static int calculateSquareSum(int n ){
		int sum = 0;
		while(n!=0){
			sum += (n %10)*(n%10);
			n/=10;
		}
		return sum;
	}
}