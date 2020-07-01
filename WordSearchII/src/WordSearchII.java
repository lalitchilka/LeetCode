import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class WordSearchII {
    public static void main(String[] args) {
        char[][] board = new char[][]{
                {'o','a','a','n'},
                {'e','t','a','e'},
                {'i','h','k','r'},
                {'i','f','l','v'}
        };
        String[] words = new String[]{"oath","pea","eat","rain"};
        System.out.println(findWords(board, words));
    }

    private static List<String> findWords(char[][] board, String[] words) {
        if(words.length == 0) return new ArrayList<>();
        Trie t = new Trie();
        for(String word: words){
            t.insert(word);
        }

        Set<String> set = new HashSet<>();

        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[0].length; j++){
                dfs(board, set, i, j, t, "");
            }
        }
        return new ArrayList<>(set);
    }

    private static void dfs(char[][] board, Set<String> set, int i, int j, Trie trie, String s){
        if(board[i][j] == '*') return;
        char c = board[i][j];
        board[i][j] = '*';

        Trie subTrie = trie.children[c - 'a'];

        if(subTrie != null){
            String ss = s + c;
            if(subTrie.isEnd) set.add(ss);
            if(i < board.length - 1) dfs(board, set, i + 1, j, subTrie, ss);
            if(j < board[0].length - 1) dfs(board, set, i, j + 1, subTrie, ss);
            if(i > 0) dfs(board, set, i - 1, j, subTrie, ss);
            if(j > 0) dfs(board, set, i, j  - 1, subTrie, ss);
        }

        board[i][j] = c;
    }
}

class Trie{
    public Trie[] children;
    public boolean isEnd;

    public Trie(){
        children = new Trie[26];
        isEnd = false;

        for(int i = 0; i < 26; i++) children[i] = null;
    }

    public void insert(String word){
        Trie t = this;

        for(char c: word.toCharArray()){
            if(t.children[c - 'a'] == null) t.children[c - 'a'] = new Trie();
            t = t.children[c - 'a'];
        }
        t.isEnd = true;
    }
}
