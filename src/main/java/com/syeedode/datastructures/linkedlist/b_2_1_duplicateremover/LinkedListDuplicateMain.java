package com.syeedode.datastructures.linkedlist.b_2_1_duplicateremover;

import com.syeedode.datastructures.linkedlist.Node;

public class LinkedListDuplicateMain {

    public static void main(String [] args) {
        Node linkListNode = new Node(10);
        linkListNode.appendToTail(1);
        linkListNode.appendToTail(5);
        linkListNode.appendToTail(7);
        linkListNode.appendToTail(7);
        linkListNode.appendToTail(1);
        linkListNode.appendToTail(3);
        linkListNode.appendToTail(10);

        linkListNode.printList();
        System.out.println("Removing duplicates");
        linkListNode = new DuplicateDeletor().deleteDuplicates(linkListNode);
        linkListNode.printList();
    }
}
