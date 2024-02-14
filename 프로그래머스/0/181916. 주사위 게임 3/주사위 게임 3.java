class Solution {
    public int solution(int a, int b, int c, int d) {
        if (a == b && a == c && a == d) {       // abcd
            return 1111 * a;
        } else if (a == b && a == c) {          // abc
            return (10 * a + d) * (10 * a + d); 
        } else if (a == c && c == d) {          // acd
            return (10 * a + b) * (10 * a + b); 
        } else if (a == b &&  b == d) {         // abd
            return (10 * a + c) * (10 * a + c);
        } else if (b == c && c == d) {          // bcd
            return (10 * b + a) * (10 * b + a);
        } else if (a == b && c == d) {          // ab, cd
            return (a + c) * (Math.abs(a - c));
        } else if (a == c && b == d) {          // ac, bd
            return (a + b) * (Math.abs(a - b));
        } else if (a == d && b == c) {          // ad, cd
            return (a + b) * (Math.abs(a - b));
        } else if (a == b && c != d) {          // ab
            return (c * d);
        } else if (a == c && b != d) {          // ac
            return (b * d);
        } else if (a == d && b != c) {          // ad
            return (b * c);
        } else if (b == c && a != d) {          // bc
            return (a * d);
        } else if (b == d && a != c) {          // bd
            return (a * c);
        } else if (c == d && a != b) {          // cd
            return (a * b);
        } else {
            return Math.min(Math.min(a, b), Math.min(c,d));
        }
           
    }
}