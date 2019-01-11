package com.syeedode.datastructures.arraysandstrings.a_1_3_URLify;

/**
 * Write a method to replace all spaces in a sring with %20.
 * You may assume that you are given the "true" length of
 * the string. (Note: if implementing in Java, please use a
 * character array so that you can perform this operation in
 * place.)
 */
public class URLifyService {
    /** A common approach in string manipulation poroblems
     * is to edit the string starting from the end and
     * working backwards. This is useful because we have an
     * extra buffer at the end.  This allows us to change
     * characters without worrying about what we're
     * overwriting.
     */
    public String replaceSpaces(char [] originalString, int originalCharactersLength) {
        int numberOfSpaces = 0, index, i = 0;

        /** This first scan counts the number of spaces. By
         *  tripling this number, we can compute how many
         *  extra characters we will have in the final string.
         */
        for(i =0; i < originalCharactersLength; i++) {
            if(originalString[i] == ' ') {
                numberOfSpaces++;
            }
        }

        index = originalCharactersLength + numberOfSpaces * 2;
        // truncate the array if it's longer than the final
        // length
        if(originalCharactersLength < originalString.length) {
            originalString[originalCharactersLength] = '\0';
        }

        /** We scan this array in reverse order. This time we
         *  actually edit the string. When we see a space
         *  we replace it with %20. If there is no space we
         *  copy the original character.
         */
        for (i = originalCharactersLength - 1; i >= 0; i--) {
            if(originalString[i] == ' ') {
                originalString[index - 1] = '0';
                originalString[index - 2] = '2';
                originalString[index - 3] = '%';
                index = index - 3;
            } else {
                originalString[index - 1] = originalString[i];
                index--;
            }
        }

        return new String(originalString);
    }
}
