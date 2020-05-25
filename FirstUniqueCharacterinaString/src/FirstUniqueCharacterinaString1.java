public class FirstUniqueCharacterinaString1 {
    public static void main(String[] args) {
        System.out.println(firstUniqChar("llll"));
    }

    private static int firstUniqChar(String s) {
        int[] arr = new int[26];
        for(char c: s.toCharArray()) arr[c - 'a']++;
        for(int i = 0; i < s.length(); i++){
            if(arr[s.charAt(i) - 'a'] == 1) return i;
        }
        return -1;
    }
}
