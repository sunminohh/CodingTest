class Solution {
    public int solution(int[] numbers, int n) {
        int sum = 0;
        for (int i=0; i<numbers.length; i++) {
            sum += numbers[i];
            if (n < sum) {
                break;
            }
        }
        
        return sum;
    }
}