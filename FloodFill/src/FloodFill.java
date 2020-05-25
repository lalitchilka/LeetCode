public class FloodFill {
    public static void main(String[] args) {
        int[][] result = floodFill(new int[][]{{1,1,1}, {1,1,0}, {1,0,0}}, 1, 1, 2);
        for (int[] row:
             result) {
            for (int i:
                 row) {
                System.out.print(i);
            }
            System.out.println();
        }
    }

    private static int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        if(image == null || image.length == 0 || image[sr][sc] == newColor) return image;
        helper(image, sr, sc, newColor, image[sr][sc]);
        return image;
    }

    private static void helper(int[][] image, int sr, int sc, int newColor, int oldColor){
        if(sr < 0 || sr >= image.length || sc < 0 || sc >= image[0].length || image[sr][sc] != oldColor) return;

        if(image[sr][sc] == oldColor) image[sr][sc] = newColor;

        helper(image, sr + 1, sc, newColor, oldColor);
        helper(image, sr - 1, sc, newColor, oldColor);
        helper(image, sr, sc + 1, newColor, oldColor);
        helper(image, sr, sc - 1, newColor, oldColor);
    }
}
