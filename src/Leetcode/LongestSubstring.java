package Leetcode;
import java.util.*;

public class LongestSubstring {
    public static int lengthOfLongestSubstring(String s) {
        int left = 0, maxLength = 0;
        Set<Character> set = new LinkedHashSet<>();

        for (int right = 0; right < s.length(); right++) {
            char c = s.charAt(right);

            // If duplicate, shrink the window from the left
            while (set.contains(c)) {
                set.remove(s.charAt(left));
                left++;
            }

            // Add current character
            set.add(c);

            // Update max length
            maxLength = Math.max(maxLength, right - left + 1);

        }
        return maxLength;
    }

    public static void main(String[] args) {
        String str = "abdcabcbb";
        System.out.println("Input: " + str);
        System.out.println("Length of Longest Substring: " + lengthOfLongestSubstring(str));
    }
}

