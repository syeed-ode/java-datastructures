package com.syeedode.datastructures.linkedlist.b_2_2_Kth_to_the_last;

import com.syeedode.datastructures.linkedlist.Node;

public class KthToLastMain {

    public static void main(String [] args) {
        /**
         * 10->1->5->7->7->1->3->10
         *
         * This example is a straight loop
         */
        Node linkListNode = new Node(10);
        linkListNode.appendToTail(1);
        linkListNode.appendToTail(5);
        linkListNode.appendToTail(7);
        linkListNode.appendToTail(7);
        linkListNode.appendToTail(1);
        linkListNode.appendToTail(3);
        linkListNode.appendToTail(10);
        linkListNode.printList();

        new KthToTheLastComputer().printKthToTheLast(linkListNode, 3);


        /**
         * 10->1->5->7->7->1->3->10
         *
         * This example uses a wrapper class.
         */
        linkListNode = new Node(10);
        linkListNode.appendToTail(1);
        linkListNode.appendToTail(5);
        linkListNode.appendToTail(7);
        linkListNode.appendToTail(7);
        linkListNode.appendToTail(1);
        linkListNode.appendToTail(3);
        linkListNode.appendToTail(10);
        linkListNode.printList();

        Node kthNode = new KthToTheLastComputer().printKthToTheLastUsingWrapperClass(linkListNode, 3);
        System.out.println("\n\n\n\n\n\nThis is the kth node");
        kthNode.printList();
    }
}
