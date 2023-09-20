import java.util.ArrayList;

class Solution {
    public static int removeDuplicates(int[] nums) {
        // k = 1 ya que si es = 0 chafariamos el primer elemento de la array
        int k = 1;
        for (int i = 1; i < nums.length; i++) {
            if(nums[i] != nums[i-1]){
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }
}
