public class Trie {

    TrieNode root;
    /** Initialize your data structure here. */
    public Trie() {
        this.root = new TrieNode();
    }

    /** Inserts a word into the trie. */
    public void insert(String word) {
        TrieNode node = root;
        for(char c: word.toCharArray()){
            if(node.ref[c - 'a'] == null) node.ref[c - 'a'] = new TrieNode();
            node = node.ref[c - 'a'];
        }
        node.val = true;
    }

    /** Returns if the word is in the trie. */
    public boolean search(String word) {
        TrieNode node = root;
        for(char c: word.toCharArray()){
            if(node.ref[c - 'a'] == null) return false;
            node = node.ref[c - 'a'];
        }
        return node.val;
    }

    /** Returns if there is any word in the trie that starts with the given prefix. */
    public boolean startsWith(String prefix) {
        TrieNode node = root;
        for(char c: prefix.toCharArray()){
            if(node.ref[c - 'a'] == null) return false;
            node = node.ref[c - 'a'];
        }
        return true;
    }

    class TrieNode{
        TrieNode[] ref;
        private final int alphabets = 26;
        boolean val;

        public TrieNode(){
            this.ref = new TrieNode[alphabets];
            this.val = false;
        }
    }
}

class test{
    public static void main(String[] args) {
        Trie trie = new Trie();

        trie.insert("apple");
        System.out.println("Search apple : " + trie.search("apple"));   // returns true
        System.out.println("Search app : " + trie.search("app"));     // returns false
        System.out.println("Starts with app : " + trie.startsWith("app")); // returns true
        trie.insert("app");
        System.out.println("Search app : " + trie.search("app"));
    }
}
