import java.util.Scanner;
public class PrimeNo{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		boolean ans = true;
		for(int i=2;(i*i)<n;i++){
			if(n%i == 0) {
				ans = false;
			}
		}
		if(ans) System.out.println("Prime.");
		else System.out.println("Not Prime.");
	}
}