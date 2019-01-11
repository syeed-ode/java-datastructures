package com.syeedode.datastructures.arraysandstrings.a_1_4_palindrome_permutation;

/**
 * Given a string, write a function to check if its is a permutation
 * of a palindrome. A palindrome is a word or phrase that is the
 * same forwards and backwards. A permutation is a rearrangement of
 * letters. The palindrome does not need to be limited to just
 * dictionary words.
 *
 * SOLUTION:
 *   At most a palindrome can have only one letter with an odd count.
 *   All other characters must have an even count. The odd count
 *   character would be in the center of the final string.
 */
public class PermuatedPalindromeService {

    private final static int A_INT_VALUE = Character.getNumericValue('a');
    private final static int Z_INT_VALUE = Character.getNumericValue('z');

    public boolean isPermutationOfPalindrome(String palindromeEvaluationPhrase) {
        int[] letterTable = buildCharacterFrequencyTable(palindromeEvaluationPhrase);
        return isOnlyOneOddLetter(letterTable);
    }

    private int[] buildCharacterFrequencyTable(String phrase) {
        int [] letterFrequencyTable = new int[Z_INT_VALUE - A_INT_VALUE + 1];

        for(char c : phrase.toCharArray()) {
            int letterIntValue = getModulatedLetterIntValue(c);
            if(letterIntValue != -1) {
                letterFrequencyTable[letterIntValue]++;
            }
        }
        return letterFrequencyTable;
    }

    private int getModulatedLetterIntValue(char character) {
        /** Upper and lower case letters return the same numeric value
         *  from Character.getNumericValue(). 
         */
        int val = Character.getNumericValue(character);
        if(A_INT_VALUE <= val && val <= Z_INT_VALUE) {
            return val - A_INT_VALUE;
        }
        return -1;
    }

    private boolean isOnlyOneOddLetter(int[] letterTable) {
        boolean foundOddLetter = false;
        for(int count : letterTable) {
            if(count % 2 == 1) {
                if(foundOddLetter){
                    return false;
                }
                foundOddLetter = true;
            }
        }
        return true;
    }
}
