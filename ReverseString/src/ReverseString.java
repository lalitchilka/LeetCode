
public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] s = new char[] {'h', 'e', 'l', 'l', 'o'};
		char[] result = reverseString(s);
		for(Character c:result) {
			System.out.println(c);
		}
	}
	
	private static char[] reverseString(char[] s) {
        int start = 0, end = s.length - 1;
        while(start < end){
            Character temp = s[start];
            s[start++] = s[end];
            s[end--] = temp;
        }
        return s;
    }

}
