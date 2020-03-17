package com.franco.dev;

public class Main {

/*    Given a string, find the length of the longest substring without repeating characters.

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
    Note that the answer must be a substring, "pwke" is a subsequence and not a substring.*/

    public static void main(String[] args) {
	// write your code here
    }

    static class Solution {
        public int lengthOfLongestSubstring(String s) {
            int longestSubstring = 0;
            if(s == null || s.equals("") || s.length() == 0)
                return 0;

            if(s.length() == 1)
                return 1;

            int startIndexWindow = 0;
            int endIndexWindow = 0;

            return longestSubstring;
        }
    }
}
