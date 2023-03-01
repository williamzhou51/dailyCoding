public class LongestPrefixLength {
    public int findMaxPrefixLength(int[] arr1, int[] arr2){
        // null return 0
        if(arr1 == null || arr2 == null){
            return 0;
        }
        // initial properties
        int res = 0;

        // traverse two array and use find Prefix Length method
        for(int i =0; i< arr1.length; i++){
            String s1 = arr1[i] + "";
            for(int j = 0; j < arr2.length; j++){
                String s2 = arr2[j] + "";
                int l = findPrefixLength(s1, s2);
                res = Math.max(res, l);
            }
        }
        System.out.println(res);
        return res;
    }

    // return a pair number Prefix Length
    private static int findPrefixLength(String s1, String s2){
        // initial properties
        int l = 0;
        for(int i = 0; i < Math.min(s1.length(), s2.length()); i++){
            if(s1.charAt(i) == s2.charAt(i)){
                l++;
            }else{ break;}
        }
        return l;
    }

    public static void main(String[] args) {
         LongestPrefixLength longestPrefixLength = new LongestPrefixLength();

        longestPrefixLength.findMaxPrefixLength(new int[] {25, 288, 2655, 54546, 54, 55},
                new int[] {2, 255, 266, 244, 26, 5, 54547});
    }
}
