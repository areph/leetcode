package leetcode.easy7;

/*
 * @lc app=leetcode id=7 lang=java
 *
 * [7] Reverse Integer
 */

// @lc code=start
class Solution {
    public int reverse(int x) {
        try {
            String str = Integer.toString(x);
            char[] cha = str.toCharArray();
            String result = "";
            // 文字列にして逆順に取得
            for (int i = cha.length - 1; i >= 0; i--) {
                result += String.valueOf(cha[i]);
            }
            if (x < 0) {
              // 負数の場合はマイナスまで付与されているので削除
              return -(Integer.valueOf(result.substring(0, result.length() -1)));
            }
            return Integer.valueOf(result);
        } catch (NumberFormatException e) {
            // reverseした結果intの許容値を超えるようであれば0を返却
            return 0;
        }
    }
}
// @lc code=end
