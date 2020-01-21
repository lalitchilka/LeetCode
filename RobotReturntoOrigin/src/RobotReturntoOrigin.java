
public class RobotReturntoOrigin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(judgeCircle("LR"));
	}
	
	private static boolean judgeCircle(String moves) {
		int [] arr = new int[26];
		for(char c: moves.toCharArray()) {
			arr[c - 'A']++;
		}
		return (arr['U' - 'A'] == arr['D' - 'A']) && (arr['L' - 'A'] == arr['R' - 'A']);
	}

}
