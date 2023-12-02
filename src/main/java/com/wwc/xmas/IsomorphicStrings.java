package com.wwc.xmas;

import java.util.HashMap;
import java.util.Map;

// Day 1 of WWD- Christmas Coding Challenge
public class IsomorphicStrings {
    public boolean isIsomorphic(String s, String t) {

        Map<Character, Character> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char char_str1 = s.charAt(i), char_str2 = t.charAt(i);
            if (map.containsKey(char_str1))
            {
                if (map.get(char_str1) != char_str2)
                    return false;
            }
            else
            {
                if (map.containsValue(char_str2))
                    return false;
                map.put(char_str1, char_str2);
            }
        }
        return true;
    }

    public static void main(String[] s){
        new IsomorphicStrings().isIsomorphic("egg", "add");
    }

}
