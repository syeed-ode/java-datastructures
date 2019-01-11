package com.syeedode.datastructures.arraysandstrings.a_1_2_check_permutation;

public class PermutationCheckerMain {
    public static void main(String [] args) {
        String  s1 = "This is alpha",
                s2 = "alpha is This";
        System.out.print("The two strings: \n\t->"+s1+"<- and \n\t->"+s2+"<-\n");
        System.out.println(" are "
                + (new PermutationCheckerService().permutationUsingSorts(s1,s2) ? "" : "not ")
                + "permutations of one another");


        System.out.print("\n\n\n\n\n\n\nThe two strings: \n\t->"+s1+"<- and \n\t->"+s2+"<-\n");
        System.out.println(" are "
                + (new PermutationCheckerService().permutationUsingCharCounts(s1,s2) ? "" : "not ")
                + "permutations of one another when using character counts");
    }
}
