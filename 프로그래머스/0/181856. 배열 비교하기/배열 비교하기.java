class Solution {
    public int solution(int[] arr1, int[] arr2) {
   
        int len1 = arr1.length;
        int len2 = arr2.length;
        int sum1 = 0;
        int sum2 = 0;
        
        for (int num : arr1) {
            sum1 += num;
        }
        
        for (int num : arr2) {
            sum2 += num;
        }
        
       if (len2 < len1 || (len1 == len2 && sum2 < sum1)) {
           return 1;
       } else if (len1 < len2 || (len1 == len2 && sum1 < sum2)) {
           return -1;
       } else {
           return 0;
       }

    }
}