import java.util.*;

class Solution {
    public String[] solution(String myStr) {
        
        List<String> answer = new ArrayList<>();
        
        StringBuilder sb = new StringBuilder();
        for (char c : myStr.toCharArray()) {
            if (c == 'a' || c == 'b' || c == 'c') {
                if (0 < sb.length()) {                    
                    answer.add(sb.toString());
                    sb = new StringBuilder();
                }
            } else {
                sb.append(c);
            }
        }
        
        if (0 < sb.length()) {
            answer.add(sb.toString());
        }
        
        if (answer.isEmpty()) {
            return new String[]{"EMPTY"};
        } else {
            return answer.toArray(new String[0]);
        }
        
    }
}