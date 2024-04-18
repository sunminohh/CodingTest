class Solution {
    public int solution(int n) {
        
        String str = Integer.toString(n,3);
        String reverse = new StringBuilder(str).reverse().toString(); 
        
        return  Integer.valueOf(reverse, 3); 
    }
}