import java.util.*;

class Solution {
    public int solution(String[] strArr) {
        
        int [] count = new int[100000];
        
        for (String str : strArr) {
            count[str.length()]++;
        }
        
        return Arrays.stream(count).max().getAsInt();
    }
}