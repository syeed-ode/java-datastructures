package com.syeedode.datastructures.linkedlist.b_2_1_duplicateremover;

import com.syeedode.datastructures.linkedlist.Node;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/**
 * 2.1 Remove Dups
 *
 * Write code to remove duplicates from an unsorted linked list
 */

public class DuplicateDeletor {

    public Node deleteDuplicates(Node n) {
        Set<Integer> buffer = new HashSet<>();
        Node previous = null;
        while(Objects.nonNull(n)) {
            if(buffer.contains(n.data)) {
                previous = n.next;
            } else {
                buffer.add(n.data);
                previous = n;
            }
            n = n.next;

        }
        return previous;
    }
}
