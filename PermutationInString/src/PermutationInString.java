public class PermutationInString {
    public static void main(String[] args) {
        System.out.println(checkInclusion("ab", "eidbaooo"));
    }

    private static boolean checkInclusion(String s1, String s2) {
        int[] arr1 = new int[26];
        int[] arr2 = new int[26];

        for(int i = 0; i < s1.length(); i++){
            arr1[s1.charAt(i) - 'a']++;
            arr2[s2.charAt(i) - 'a']++;
        }

        int left = 0, right = s1.length() - 1;
        while(right < s2.length()){
            if(areEquals(arr1, arr2)) return true;
            if(++right != s2.length()){
                arr2[s2.charAt(right) - 'a']++;
            }
            arr2[s2.charAt(left++) - 'a']--;
        }
        return false;
    }

    private static boolean areEquals(int[] arr1, int[] arr2){
        for(int i = 0; i < arr1.length; i++){
            if(arr1[i] != arr2[i]) return false;
        }
        return true;
    }
}
