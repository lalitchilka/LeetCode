import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LetterCasePermutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(letterCasePermutation("a1b2"));

	}
	
	private static List<String> letterCasePermutation(String S) {
        if(S == null) return new LinkedList<String>();
        Queue<String> q = new LinkedList<String>();
        q.offer(S);
        
        for(int i = 0; i < S.length(); i++) {
        	if(Character.isDigit(S.charAt(i))) continue;
        	int size = q.size();
        	for(int j = 0; j < size; j++) {
        		String curr = q.poll();
        		char[] arr = curr.toCharArray();
        		
        		arr[i] = Character.toUpperCase(arr[i]);
        		q.offer(String.valueOf(arr));
        		
        		arr[i] = Character.toLowerCase(arr[i]);
        		q.offer(String.valueOf(arr));
        	}
        }
        return new LinkedList<String>(q);
    }

}
