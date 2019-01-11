package com.syeedode.datastructures.arraysandstrings.a_1_4_palindrome_permutation;

public class PermutatedPalindromeMain {

    public static void main(String [] args) {
        String input = "TtAac Co";
        System.out.print("The phrase \n\t->" + input + "<-\nis");
        System.out.print(new PermuatedPalindromeService().isPermutationOfPalindrome(input)
                ? " " : " not ");
        System.out.println("a palindrome permutation");
    }
}
