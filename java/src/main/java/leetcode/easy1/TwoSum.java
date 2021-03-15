package leetcode.easy1;

import java.util.*;

;/*
 * @lc app=leetcode id=1 lang=java
 *
 * [1] Two Sum
 */

// @lc code=start
class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> hash = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int key = target - nums[i];
            if (hash.containsKey(key)) {
                return new int[] { hash.get(key), i };
            }
            hash.put(nums[i], i);
        }
        throw new IllegalArgumentException("invalid arguments");
    }
}
// @lc code=end
