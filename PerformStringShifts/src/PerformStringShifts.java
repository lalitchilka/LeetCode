import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PerformStringShifts {
    public static void main(String[] args) {
        System.out.println(stringShift("abcdefg", new int[][]{{1,1},{1,1}, {0,2},{1,3}}));

    }

    private static String stringShift(String s, int[][] shift) {
        if(s.length() == 0) return "";
        if(s.length() == 1) return s;
        List<Character> l = s.chars().mapToObj(c -> (char) c).collect(Collectors.toList());
        for(int i = 0; i < shift.length; i++){
            if(shift[i][0] == 0){
                for(int j = 0; j < shift[i][1]; j++){
                    char c = l.get(0);
                    l.remove(0);
                    l.add(c);
                }
            }else{
                for(int j = 0; j < shift[i][1]; j++){
                    char c = l.get(l.size() - 1);
                    l.remove(l.size() - 1);
                    l.add(0, c);
                }
            }
        }
        StringBuilder sb = new StringBuilder(l.toString());
        return sb.toString();
    }
}
