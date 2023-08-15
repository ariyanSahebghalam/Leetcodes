import java.util.HashMap;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] newNum = new int[2];


        for (int i = 0; i < nums.length; i++) {
            map.put(target - nums[i], i);
        }

        for (int i = 0; i < nums.length; i++) {
            // If the complement is contained, and the indices of the complements are not referring to the same index
            if (map.containsKey(nums[i]) && map.get(nums[i]) != i) {
                newNum[0] = map.get(nums[i]);
                newNum[1] = i;
            }
        }


        return newNum;
    }
}