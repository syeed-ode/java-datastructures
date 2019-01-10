package com.syeedode.datastructures.linkedlist.b_2_2_Kth_to_the_last;

import com.syeedode.datastructures.linkedlist.Node;

import java.util.Objects;

public class KthToTheLastComputer {

    /**
     * The way to do this is to change the problem to simply
     * printing the kth to last element. Then, we can pass
     * back the value of teh counter simply through return
     * values.
     *
     */
    public Integer printKthToTheLast(Node head, int k) {
        if(Objects.isNull(head)) {
            return 0;
        }

        /***
         * The algorithm recurses through the linked list.
         * When it hits the end, the method passes back a
         * counter set to 0. Each parent adds 1 to this
         * counter. When the counter equals k, we know we
         * have reached the kth to last element of the
         * linked list.
         */
        int index = printKthToTheLast(head.next, k) + 1;
        if(index == k) {
            System.out.println(k + "th to the last node is " + head.data);
        }
        return index;
    }


    /**
     * By utilizing a class, we can mimic passing by
     * reference. This has a space of O(n).
     * The time is O(1).
     */
    public class Index {
        public int indexValue = 0;
    }

    public Node printKthToTheLastUsingWrapperClass(Node head, int k) {
        Index idx = new Index();
        return printKthToTheLastUsingWrapperClass(head, k, idx);
    }

    private Node printKthToTheLastUsingWrapperClass(Node head, int k, Index index) {
        if(head == null) {
            return null;
        }

        Node node = printKthToTheLastUsingWrapperClass(head.next, k, index);
        index.indexValue = index.indexValue + 1;
        if(index.indexValue == k) {
            return head;
        }

        return node;
    }
}
