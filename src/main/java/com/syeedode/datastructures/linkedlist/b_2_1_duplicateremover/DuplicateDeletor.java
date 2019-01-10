package com.syeedode.datastructures.linkedlist.b_2_1_duplicateremover;

import com.syeedode.datastructures.linkedlist.Node;

import java.util.*;

import static java.util.Objects.isNull;
import static java.util.Objects.nonNull;

/**
 * 2.1 Remove Dups
 *
 * Write code to remove duplicates from an unsorted linked list
 */

public class DuplicateDeletor {

    /**
     * This method (using a buffer) runs in
     * O(N) time. There is only one loop.
     *
     * @param head
     * @return
     */
    public Node removeDupFromWebsite(Node head){
        Set<Integer> ht = new HashSet<Integer>();
        if(head==null){
            return null;
        }
        Node currNode = head.next;
        Node prevNode = head;
        Node temp; // keeping it so that last node would be eligible for garbage collection
        ht.add(head.data);
        while(currNode!=null){
            int data = currNode.data;
            if(ht.contains(data)){
                prevNode.next = currNode.next;
                temp= currNode;
                currNode = currNode.next;
                temp.next = null;
            }else{
                ht.add(data);
                prevNode = currNode;
                currNode = currNode.next;
            }
        }
        return head;
    }
}
