package com.syeedode.datastructures.linkedlist.b_2_3_delete_middle_node;

import com.syeedode.datastructures.linkedlist.Node;

import java.util.Objects;

import static java.util.Objects.isNull;
import static java.util.Objects.nonNull;

/**
 * Delete Middle Node
 *
 * Implement an algorithm to delete a node in teh middle (i.e.
 * any node but the first and last node, not necessarily the
 * exact middle) of a singly linked list, given only access
 * to that node.
 *
 * EXAMPLE:
 * Input: the node 3 from 1->2->3->4->5->6
 * Result: nothing is returned, but th new linked list looks
 * like 1->2->4->5->6
 */
public class MiddleNodeDeletor {

    boolean deleteNode(Node n) {
        if(n == null || n.next == null) {
            return false;
        }
        Node next = n.next;
        n.data = next.data;
        n.next = next.next;
        return true;
    }

    /**
     * This solution is a different problem space. It
     * deletes the second middle of an even linked list.
     * And it deletes the middle of the list, not just
     * a node in the list.
     *
     * First count number of nodes in the linked list,
     * then delete n/2'th node using the simple deletion
     * process.
     */
    public Node deleteMiddleNode(Node head) {
        if(isNull(head) || isNull(head.next)) {
            return null;
        }

        /**
         * We will use two traversals of linked list.
         * We can delete middle node using one traversal.
         * When fastNode reaches end, slowNode reaches
         * middle.
         */
        Node slowNode = head;
        Node fastNode = head;
        Node prev = null; // Stores the prev of slowNode

        while(nonNull(fastNode) && nonNull(fastNode) && nonNull(fastNode.next)) {
            fastNode = fastNode.next.next;
            prev = slowNode;
            slowNode = slowNode.next;
        }
        prev.next = slowNode.next;
        return head;
    }
}
