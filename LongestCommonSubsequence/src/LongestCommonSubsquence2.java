public class LongestCommonSubsquence2 {
    public static void main(String[] args) {
        System.out.println(longestCommonSubsequence("abcde", "ace"));
    }

    private static int longestCommonSubsequence(String text1, String text2) {
        int m = text1.length();
        int n = text2.length();
        int[][] matrix = new int[m + 1][n + 1];
        for(int i = 1; i <= m; i++){
            for(int j = 1; j <= n; j++){
                if(text1.charAt(i - 1) == text2.charAt( j - 1)) matrix[i][j] = ++matrix[i - 1][j - 1];
                else matrix[i][j] = Math.max(matrix[i - 1][j], matrix[i][j - 1]);
            }
        }
        return matrix[m][n];
    }
}
