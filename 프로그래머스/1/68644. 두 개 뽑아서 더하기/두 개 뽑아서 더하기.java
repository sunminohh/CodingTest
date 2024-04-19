import java.util.*;

class Solution {
    public ArrayList<Integer> solution(int[] numbers) {
        
        HashSet<Integer> set = new HashSet<>();
        for (int i=0; i<numbers.length-1; i++) {
            for (int j=i+1; j<numbers.length; j++) {
                set.add(numbers[i]+numbers[j]);
            }
        }
        
        ArrayList<Integer> answer = new ArrayList<>(set);
        Collections.sort(answer);
        
        return answer;
    }
}