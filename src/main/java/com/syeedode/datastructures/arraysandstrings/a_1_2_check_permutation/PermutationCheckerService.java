package com.syeedode.datastructures.arraysandstrings.a_1_2_check_permutation;

import java.util.Arrays;

public class PermutationCheckerService {

    /**
     * This way is inefficient but extremely clean.
     */
    public boolean permutationUsingSorts(String firstString, String s2) {
        if (firstString.length() != s2.length()) {
            return false;
        }

        return  sortString(firstString).equals(sortString(s2));
    }

    private String sortString(String originalString) {
        char [] charSet = originalString.toCharArray();
        Arrays.sort(charSet);
        return new String(charSet);
    }


    /**
     * We can check for character counts, the definition of
     * a permutation is equal character counts.
     */
    public boolean permutationUsingCharCounts(String firstString, String s2) {
        /** uneven lengths means unequal character counts */
        if(firstString.length() != s2.length()) return false;

        int[] allCharacters = new int [128]; // assuming ASCII

        char[] firstStringArray = firstString.toCharArray();
        for(char c : firstStringArray) {
            allCharacters[c]++;
        }

        for(char c : s2.toCharArray()) {
            allCharacters[c]--;
            if(allCharacters[c] < 0) {
                return false;
            }
        }

        return true;
    }
}
