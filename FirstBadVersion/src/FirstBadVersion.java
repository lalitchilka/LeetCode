public class FirstBadVersion {
    private static boolean[] isBad = new boolean[]{false,false,false,true,true};
    public static void main(String[] args) {
        System.out.println(firstBadVersion(5));
    }

    private static int firstBadVersion(int n) {
        int start = 0, end = n;
        while(start < end) {
            int mid = start + (end - start) / 2;
            if(!isBadVersion(mid)) start = mid + 1;
            else end = mid;
        }
        return start;
    }

    private static boolean isBadVersion(int pos){
        return isBad[pos];
    }
}
