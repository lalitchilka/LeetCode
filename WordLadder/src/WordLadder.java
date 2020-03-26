import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;

public class WordLadder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String beginWord = "hit", endWord = "dog";
		List<String> wordList = Arrays.asList("hot","dog");
		System.out.println(ladderLength(beginWord, endWord, wordList));
	}
	
	private static int ladderLength(String beginWord, String endWord, List<String> wordList) {
		Set<String> set = new HashSet<>();
		for(String word: wordList)set.add(word);
		
		if(!set.contains(endWord)) return 0;
		
		Queue<String> q = new LinkedList<>();
		q.offer(beginWord);
		int level = 1;
		
		while(!q.isEmpty()) {
			int size = q.size();
			for(int i = 0; i < size; i++) {
				char[] letters = q.poll().toCharArray();
				for(int j = 0; j < letters.length; j++) {
					char originalLetter = letters[j];
					for(char c = 'a'; c < 'z'; c++) {
						if(letters[j] == c) continue;
						letters[j] = c;
						String new_word = String.valueOf(letters);
						if(new_word.equals(endWord)) return level + 1;
						if(set.contains(new_word)) {
							q.offer(new_word);
							set.remove(new_word);
						}
					}
					letters[j] = originalLetter;
				}
			}
			level++;
		}
		return 0;
	}
}
