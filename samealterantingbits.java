class Solution {
    public boolean hasAlternatingBits(int n) {

        while (n != 0) {
            int s1 = n & 1;
            n >>= 1;
            int s2 = n & 1;
            if (s1 == s2) {
                return false;
            }
        }
        return true;

    }
}