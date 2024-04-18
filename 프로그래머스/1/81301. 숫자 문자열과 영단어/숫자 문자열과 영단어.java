class Solution {
    public int solution(String s) {
        
        String[] strArr = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        
        for (int i=0; i<strArr.length; i++) {
            if (s.contains(strArr[i])) {
                s = s.replace(strArr[i], Integer.toString(i));
            }
        }
        
        return Integer.parseInt(s);
    }
}