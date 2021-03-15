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
        // ２つの数を加算してtargetの値になる添字を検索する

        // ハッシュに格納しつつ検索する
        Map<Integer, Integer> hash = new HashMap<>();
        // 配列の最初から順番に検索していく
        for (int i = 0; i < nums.length; i++) {
            // targetから数値を差し引いて差分を取得
            int key = target - nums[i];
            // 差分の値がすでにハッシュにある場合は現在の添字とハッシュに格納した添字が答え
            if (hash.containsKey(key)) {
                return new int[] { hash.get(key), i };
            }
            // ハッシュに存在しない場合は数字と添字をハッシュへ格納する
            hash.put(nums[i], i);
        }
        throw new IllegalArgumentException("invalid arguments");
    }
}
// @lc code=end
