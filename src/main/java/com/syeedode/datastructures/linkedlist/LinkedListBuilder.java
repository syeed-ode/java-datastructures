package com.syeedode.datastructures.linkedlist;

import java.util.List;
import java.util.Objects;

public class LinkedListBuilder {
    public Node buildLinkedList(List<Integer> list) {
        Node linkedList = null;
        for(Integer i : list) {
            if(Objects.isNull(linkedList)) {
                linkedList = new Node(i);
            } else {
                linkedList.next = new Node(i);
            }
        }
        return linkedList;
    }
}
