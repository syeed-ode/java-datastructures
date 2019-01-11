package com.syeedode.datastructures.arraysandstrings.a_1_3_URLify;

public class URLifyMain {
    public static void main(String [] args) {
        String input = "Mr John Smith      ";
        int originalLength = 13;

        String s = new URLifyService().replaceSpaces(input.toCharArray(),originalLength);
        System.out.println(s);
    }
}
