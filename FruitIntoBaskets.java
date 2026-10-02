import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;

public class FruitIntoBaskets{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] fruit = new int[n];
		for(int i =0;i<n;i++) fruit[i]= sc.nextInt();
		int ans = totalFruit(fruit);
		System.out.print(ans);
	}
	private static int totalFruit(int[] fruits) {
		int low =0,high=0,max=0;
		Map<Integer,Integer> map = new HashMap<>();
		while(high<fruits.length){
			map.put(fruits[high],map.getOrDefault(fruits[high],0)+1);
			while(map.size()>2){
				int fruit = fruits[low];
				map.put(fruit, map.get(fruit)-1);
				if(map.get(fruit)==0) map.remove(fruit);
				low++;
			}
			max=Math.max(max,high-low+1);
			high++;
		}
		
		return max;
	}
}