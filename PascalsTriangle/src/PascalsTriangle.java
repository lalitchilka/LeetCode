import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(generate(5));
	}
	
	private static List<List<Integer>> generate(int numRows) {
		List<List<Integer>> result = new ArrayList<>();
		for(int i = 0; i < numRows; i++) {
			List<Integer> row = new ArrayList<Integer>();
			for(int j = 0; j < i + 1; j++) {
				if(j == 0 || j == i) row.add(1);
				else {
					int a = result.get(i - 1).get(j - 1);
					int b = result.get(i - 1).get(j);
					row.add(a + b);
				}
			}
			result.add(row);
		}
		return result;
	}

}
