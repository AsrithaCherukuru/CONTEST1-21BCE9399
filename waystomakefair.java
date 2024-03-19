class Solution {
    public int waysToMakeFair(int[] nums) {
        int n = nums.length;
        int totalsum = 0;
        int leftsum = 0;
        int count = 0;
        for (int num : nums) {
            totalsum += num;
        }
        for (int i = 0; i < n; i++) {
            leftsum += (i > 0) ? nums[i - 1] : 0;
            totalsum -= nums[i];
            if (leftsum == totalsum) {
                count++;
            }
        }
        return count;
    }
}