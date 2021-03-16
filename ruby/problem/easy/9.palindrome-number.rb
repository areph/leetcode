#
# @lc app=leetcode id=9 lang=ruby
#
# [9] Palindrome Number
#

# @lc code=start
# @param {Integer} x
# @return {Boolean}
def is_palindrome(x)
  ch = x.to_s.chars
  ch.each_with_index {|s, i|
    break if i > ch.length / 2
    return false if ch[i] != ch[ch.length - (1 + i)]
  }
  return true
end
# @lc code=end

