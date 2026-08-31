import java.util.Scanner;
public class SmallestEvenMultipleMain{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		var obj = new SmallestEvenMultiple();
		int ans = obj.smallestEvenMultiple(n);
		System.out.println(ans);
	}
}

class SmallestEvenMultiple{
	public int smallestEvenMultiple(int n){
		int divident = n, divisor = 2, rem = divident%divisor;
		while(rem != 0){
			divident = divisor;
			divisor = rem;
			rem = divident%divisor;
		}
		return (n*2)/divisor;
	}
}