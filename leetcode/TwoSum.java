import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        // 创建一个哈希表，用来存放遍历过的数字和它的下标
        Map<Integer, Integer> map = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i]; // 计算需要的差值
            
            // 如果哈希表里有这个差值，说明找到了
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            // 如果没有，把当前的数字和下标存入哈希表
            map.put(nums[i], i);
        }
        return new int[] {};
    }
}
