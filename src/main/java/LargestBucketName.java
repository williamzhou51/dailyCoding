import java.util.*;

public class LargestBucketName {
    public String largestBucketName(String[] arr){
        int n = arr.length;
        int count = 0;
        String temp = "";
        String res = "";
        Map<String, Integer> map = new HashMap<>();
        for(int i = 0; i < n; i++){
            if(arr[i].contains("goto")){
                temp = arr[i];
                count = 0;
            }
            if(arr[i].contains("create")){
                count++;
            }
            map.put(temp,count);
        }

        int maxValue = Collections.max(map.values());
        for(Map.Entry<String, Integer> entry : map.entrySet()){
            if(entry.getValue() == maxValue){
                res = entry.getKey();
            }
        }
        System.out.println(res);
        return res;

    }

    public static void main(String[] args) {
        LargestBucketName largestBucketName = new LargestBucketName();
        String[] arr = new String[]{
           "goto bucketA",
           "create fileA",
           "create fileB",
           "create fileA",
           "goto bucketB",
           "goto bucketC",
           "create fileA",
           "create fileB",
           "create fileC"
        };
        largestBucketName.largestBucketName(arr);
    }
}
