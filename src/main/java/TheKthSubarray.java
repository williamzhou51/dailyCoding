import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TheKthSubarray {
    /**
     * @param a: an array
     * @param k: the kth
     * @return: return the kth subarray
     */
    public long theKthSubarray(int[] a, long k) {
        if(a.length == 0){
            return -1;
        }
        List<Integer> allSums = new ArrayList<>();
        for(int i = 0; i < a.length; i++){
            for(int j = 1; j <= a.length - i; j++){
                int sum = 0;
                int[] temp = Arrays.copyOfRange(a, i, i+j);
                for(int o = 0; o < temp.length; o++){
                    sum = sum + temp[o];
                }
                allSums.add(sum);
            }
        }

        Collections.sort(allSums);
        return allSums.get((int)k-1);
    }



    public static void main(String[] args) {
        TheKthSubarray theKthSubarray = new TheKthSubarray();
        int[] a = new int[] {2,3,1,4};
        long k = 6;
        System.out.println(theKthSubarray.theKthSubarray(a, k));

    }

}
