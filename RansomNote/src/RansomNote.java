public class RansomNote {
    public static void main(String[] args) {
        System.out.println(canConstruct("aa", "aab"));
        System.out.println();
    }

    private static boolean canConstruct(String ransomNote, String magazine) {
        int[] arr = new int[26];
        for(char c: magazine.toCharArray()) arr[c - 'a']++;
        for(char c: ransomNote.toCharArray()) {
            if(arr[c - 'a'] == 0) return false;
            arr[c - 'a']--;
        }
        return true;
    }
}
