package com.syeedode.datastructures.arraysandstrings.a_1_1_is_unique;

import com.sun.deploy.util.StringUtils;

import java.util.Objects;

/**
 * Implement an algorithm to determine if a string has
 * all unique characters. What if you cannot use
 * additional data structures.
 */
public class IsUniqueService {
    /**
     * Assumption ASCII - 128 characters
     * (Uniqcode would be 256)
     *
     * character count
     *
     * Time: O(n)
     * Space: O(1)
     */
    public boolean isUniqueCharacterSet(String origString) {
        /** if character set is null then all characters are unique */
        if(Objects.isNull(origString)) return true;

        /** if character set greater than 128 there must be repeats */
        if(origString.length() > 128) return false;

        boolean char_set [] = new boolean[128];
        for(int i =0; i < origString.length(); i++) {
            int charValue = origString.charAt(i);
            /** have we found char previously */
            if(char_set[charValue]) {
                return false;
            }
            /** char found */
            char_set[charValue] = true;
        }
        return true;
    }
}
