import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

public class BrickWall{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int rows = sc.nextInt();
		List<List<Integer>> wall = new ArrayList<>();
		for(int i =0;i<rows;i++){
			int col = sc.nextInt();
			List<Integer> cols = new ArrayList<Integer>();
			for(int j = 0;j<col;j++){
				int el = sc.nextInt();
				cols.add(el);
			}
			wall.add(cols);
		}
		int ans = leastBricks(wall);
		System.out.print(ans);
		
	}
	private static int leastBricks(List<List<Integer>> wall) {
		Map<Long, Integer> map = new HashMap<>();
        int maxFreq = 0;

        for (List<Integer> row : wall) {
            long prefix = 0;

            
            for (int i = 0; i < row.size() - 1; i++) {
                prefix += row.get(i);

                int freq = map.getOrDefault(prefix, 0) + 1;
                map.put(prefix, freq);

                maxFreq = Math.max(maxFreq, freq);
            }
        }

        return wall.size() - maxFreq;
	}
}