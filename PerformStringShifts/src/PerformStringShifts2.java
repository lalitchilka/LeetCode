public class PerformStringShifts2 {
    public static void main(String[] args) {
        System.out.println(performStringShifts(new int[][]{{1,1},{1,1}, {0,2},{1,3}}, "abcdefg"));
    }

    private static String performStringShifts(int[][] shift, String s){
        int finalMoves = 0;
        for(int i = 0; i < shift.length; i++){
            if(shift[i][0] == 1) finalMoves += shift[i][1];
            else finalMoves -= shift[i][1];
        }
        //abcdefg
        String firstPart = "";
        String secondPart = "";
        finalMoves = finalMoves % s.length();
        if(finalMoves < 0){
            finalMoves = Math.abs(finalMoves);
            firstPart = s.substring(finalMoves, s.length());
            secondPart = s.substring(0, finalMoves);
        }else{
            firstPart = s.substring(s.length() - finalMoves, s.length());
            secondPart = s.substring(0, s.length() - finalMoves);
        }
        return firstPart + secondPart;
    }
}
