class Solution {
    public void moveZeroes(int[] nums) {
        int insertPos = 0; // Position to insert the next non-zero element

        // Move all non-zero elements to the front of the array
        for (int num : nums) {
            if (num != 0) {
                nums[insertPos++] = num;
            }
        }

        // Fill the rest of the array with zeros
        while (insertPos < nums.length) {
            nums[insertPos++] = 0;
        }
    }
}