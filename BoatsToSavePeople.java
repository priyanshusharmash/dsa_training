import java.util.Scanner;
import java.util.Arrays;

public class BoatsToSavePeople{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] people = new int[n];
		for(int i =0;i<n;i++) people[i] = sc.nextInt();
		int limit = sc.nextInt();
		int ans = numRescueBoats(people,limit);
		System.out.print(ans);
	}
	private static int numRescueBoats(int[] people, int limit) {
		Arrays.sort(people);
		int low = 0,high =people.length-1;
		int count=0;
		while(low<=high){
			if(people[low]+people[high]<=limit){
				count++;
				low++;
				high--;
			}else{
				count++;
				high--;
			}
		}
		return count;
	}
}