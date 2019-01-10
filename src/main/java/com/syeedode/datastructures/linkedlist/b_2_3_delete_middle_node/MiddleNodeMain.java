package com.syeedode.datastructures.linkedlist.b_2_3_delete_middle_node;

import com.syeedode.datastructures.linkedlist.Node;

public class MiddleNodeMain {

    public static void main(String [] args) {
        Node linkListNode = new Node(1);
        linkListNode.appendToTail(2);
        linkListNode.appendToTail(3);
        linkListNode.appendToTail(4);
        linkListNode.appendToTail(5);
        linkListNode.appendToTail(6);
        linkListNode.appendToTail(7);
        linkListNode.printList();

        System.out.println("Finding the middle node: ");
        Node deletedMiddleList = new MiddleNodeDeletor().deleteMiddleNode(linkListNode);
        deletedMiddleList.printList();
    }
}
