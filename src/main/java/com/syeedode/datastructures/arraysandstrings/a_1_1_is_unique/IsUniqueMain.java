package com.syeedode.datastructures.arraysandstrings.a_1_1_is_unique;

public class IsUniqueMain {
    public static void main(String [] args) {
        String stringToEvaluate = "This couldbe";
        System.out.println("This string ->"+stringToEvaluate
                +  (new IsUniqueService().isUniqueCharacterSet(stringToEvaluate)
                ? "<- is unique" : "<- isn't unique")
        );
    }
}
