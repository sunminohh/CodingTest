import java.util.*;

class Solution {
    public int[] solution(int n) {
        ArrayList<Integer> reslutList = new ArrayList<>();
        
        while(n!=1) {
            if (n%2==0) {
                reslutList.add(n);
                n /= 2;
            } else {
                reslutList.add(n);
                n = 3 * n + 1;
            }
        }
        
        reslutList.add(1);
        
        int[] answer = new int[reslutList.size()];
        for (int i=0; i<reslutList.size(); i++) {
            answer[i] = reslutList.get(i);
        }
        
        return answer;
    }
}