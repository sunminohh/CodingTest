import java.util.*;

class Solution {
    public String[] solution(String myStr) {

        List<String> result = new ArrayList<>();
        
        StringBuilder current = new StringBuilder();
        for (char c : myStr.toCharArray()) {
            if (c == 'a' || c == 'b' || c == 'c') {
                if (current.length() > 0) {
                    result.add(current.toString());
                    current.setLength(0);
                }
            } else {
                current.append(c);
            }
        }
        
        if (current.length() > 0) {
            result.add(current.toString());
        }
        
        return result.isEmpty() ? new String[]{"EMPTY"} : result.toArray(new String[0]);
    }
}