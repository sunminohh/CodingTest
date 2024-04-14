import java.util.*;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        
        int[] answer = {-1};
        List<Integer> ansList = new ArrayList<Integer>();
        
        for (int num : arr) {
            if (num % divisor == 0) {
                ansList.add(num);
            }
        }
        
        if (ansList.size() != 0) {
            answer = new int[ansList.size()];
            
            for (int i=0; i<ansList.size(); i++) {
                answer[i] = ansList.get(i);
            }
            
            Arrays.sort(answer);
        }   
        
        return answer;
    }
}