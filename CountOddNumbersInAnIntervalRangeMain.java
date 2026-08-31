import java.util.Scanner;
public class CountOddNumbersInAnIntervalRangeMain{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int low = sc.nextInt();
		int high = sc.nextInt();
		var obj = new CountOddNumbersInAnIntervalRange();
		int ans = obj.countOdds(low,high);
		System.out.println(ans);
	}
}

class CountOddNumbersInAnIntervalRange{
	public int countOdds(int low, int high){
		if(low%2 == 0 && high%2==0) return (high-low)/2;
		else if(low%2 !=0 && high%2 != 0) return (high-low)/2 +1;
		else return (high-low+1)/2;
	}
}