import java.util.Arrays;
import java.util.Collections;

class Solution {
    public String solution(String s) {
  
        char[] chArr = s.toCharArray();
        Arrays.sort(chArr);
        StringBuilder sb = new StringBuilder(String.valueOf(chArr));
        
        return sb.reverse().toString();
    }
}