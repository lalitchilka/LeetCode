public class FindtheTownJudge {
    public static void main(String[] args) {
        System.out.println(findJudge(4, new int[][] {{1,3}, {1,4}, {2,3}, {2,4}, {4,3}}));
    }

    private static int findJudge(int N, int[][] trust) {
        int[] arr = new int[N + 1];
        for(int[] i: trust){
            arr[i[0]]--;
            arr[i[1]]++;
        }
        for(int i = 1; i <= N; i++){
            if(arr[i] == N - 1) return i;
        }
        return -1;
    }
}
