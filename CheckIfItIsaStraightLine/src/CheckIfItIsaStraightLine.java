public class CheckIfItIsaStraightLine {
    public static void main(String[] args) {
        System.out.println(checkStraightLine(new int[][]{{1,2},{2,3},{3,4}}));
    }

    private static boolean checkStraightLine(int[][] coordinates) {
        if(coordinates.length < 2) return false;
        if(coordinates.length == 2) return true;

        int y2 = coordinates[1][1], y1 = coordinates[0][1], x2 = coordinates[1][0], x1 = coordinates[0][0];
        int dx = x2 - x1, dy = y2 - y1;

        for(int[] co: coordinates){
            int x = co[0], y = co[1];
            if(dx * (y - y2) != dy * (x - x2)) return false;
        }
        return true;
    }
}
