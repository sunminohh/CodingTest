class Solution {
    public int solution(int[] num_list) {
        int answer = 11 <= num_list.length ? 0 : 1;
        
        for (int i=0; i<num_list.length; i++) {
            if (11 <= num_list.length) {
                answer += num_list[i];
            } else {
                answer *= num_list[i];
            }
        }
        
        return answer;
    }
}