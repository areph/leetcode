#
# @lc app=leetcode id=9 lang=ruby
#
# [9] Palindrome Number
#

# @lc code=start
# @param {Integer} x
# @return {Boolean}
def is_palindrome(x)
  return false if x < 0
  return true if x < 10
  return x.to_s == x.to_s.reverse
end
# @lc code=end

