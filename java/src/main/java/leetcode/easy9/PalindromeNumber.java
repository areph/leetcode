package leetcode.easy9;

/*
 * @lc app=leetcode id=9 lang=java
 *
 * [9] Palindrome Number
 */

// @lc code=start
class Solution {
    public boolean isPalindrome(int x) {
        // 計算せずに即返却
        // - 負数の場合
        // - 最後が10の場合
        if (x < 0 || (x != 0 && x % 10 == 0)) {
            return false;
        }

        char[] ch = String.valueOf(x).toCharArray();
        for (int i = 0; i < ch.length / 2; i++) {
            if (!(ch[i] == ch[ch.length - (i + 1)])) {
                return false;
            }
        }
        return true;
    }
}
// @lc code=end

