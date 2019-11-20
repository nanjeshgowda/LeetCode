﻿Given a string, find the length of the longest substring without repeating characters.

Example 1:

Input: "abcabcbb"
Output: 3 
Explanation: The answer is "abc", with the length of 3. 
Example 2:

Input: "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.
Example 3:

Input: "pwwkew"
Output: 3
Explanation: The answer is "wke", with the length of 3. 
             Note that the answer must be a substring, "pwke" is a subsequence and not a substring.



public class Solution {
    public int lengthOfLongestSubstring(String s) {
        // Note: The Solution object is instantiated only once and is reused by each test case.
        int maxLength = 0;
        
        for(int i = 0; i < s.length(); i++) {
            HashSet<Character> chars = new HashSet<Character>();
            chars.add(s.charAt(i));
            int j = i + 1;
            while(j < s.length()) {
                if(chars.contains(s.charAt(j))) {
                    break;
                }
                else {
                    chars.add(s.charAt(j));
                    j++;
                }
            }
            if(chars.size() > maxLength) {
                maxLength = chars.size();
            }
        }
        
        return maxLength;
    }
}
© 2019 GitHub, Inc.