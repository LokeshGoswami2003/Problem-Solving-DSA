class Solution {
    public int[] twoSum(int[] nums, int target) {
        int len = nums.length;
        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j < len; j++) {
                int temp=nums[i] + nums[j];
                if (temp == target) {
                    return new int[] { i, j };
                }
            }
        }
        return new int[] {-1,-1};
    }
}
public class R{
    public static void main(String[] args) {
        Solution ss=new Solution();
        int[] nums={2,3,5};
        int target=5;
        System.out.println(ss.twoSum(nums, target));
    }
}