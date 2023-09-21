class Solution {
    public void moveZeroes(int[] nums) {
        int aux;
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] != 0){
                aux = nums[i];
                nums[i] = nums[k];
                nums[k] = aux;
                k++;
            }
        }
    }
}