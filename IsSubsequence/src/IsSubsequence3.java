public class IsSubsequence3 {
    public static void main(String[] args) {
        System.out.println(isSubsequence("abc", "ahbgdc"));
    }

    private static boolean isSubsequence(String s, String t) {
        if(s.length() == 0) return true;
        if(t.length() == 0) return false;

        int pt1 = 0, pt2 = 0;

        while(pt2 < t.length()){
            if(s.charAt(pt1) == t.charAt(pt2)){
                pt1++;
                if(pt1 == s.length()) return true;
            }
            pt2++;
        }
        return false;
    }
}
