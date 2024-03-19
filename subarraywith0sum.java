class Solution {

    static boolean findsum(int arr[], int n) {
        Set<Integer> set = new HashSet<>();
        int prefixSum = 0;
        for (int i = 0; i < n; i++) {
            prefixSum += arr[i];
            if (prefixSum == 0 || set.contains(prefixSum)) {
                return true;
            } else {
                set.add(prefixSum);
            }
        }

        return false;
    }
}