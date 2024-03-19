import java.util.*;

class Solution {
    public String[] solution(String myString) {
        
        String[] splitArr = myString.split("x");
        ArrayList<String> resultList = new ArrayList<>();
        
        for (String str : splitArr) {
            if (!str.isEmpty()) {
                resultList.add(str);
            }
        }
        
        String[] answer = resultList.toArray(new String[resultList.size()]);
        Arrays.sort(answer);
        
        return answer;
    }
}