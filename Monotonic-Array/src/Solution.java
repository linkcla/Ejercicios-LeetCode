class Solution {
    public static boolean isMonotonic(int[] nums) {

        boolean asc = true;
        boolean desc = true;

        for (int i = 1; i < nums.length; i++) {
            if (!asc && !desc) return false;
            if (asc && nums[i -1] > nums[i]){
                asc = false;
            }
            if (desc && nums[nums.length -1 -i] < nums[nums.length -i]){
                desc = false;
            }
        }
        return asc || desc;
    }
}