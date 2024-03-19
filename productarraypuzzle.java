
class Solution {
    public static long[] productExceptSelf(int nums[], int n) {
        long product[] = new long[n];
        for (int i = 0; i < n; i++) {
            int prod = 1;
            for (int j = 0; j < n; j++) {
                if (i != j) {
                    prod *= nums[j];
                }
            }
            product[i] = prod;
        }
        return product;
    }
}
