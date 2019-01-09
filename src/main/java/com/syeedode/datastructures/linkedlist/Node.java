package com.syeedode.datastructures.linkedlist;

import java.util.Objects;

public class Node {
    public Node next = null;
    public int data;

    public Node(int d) {
        data = d;
    }

    public void appendToTail(int d) {
        Node end = new Node(d);
        Node n = this;
        while(n.next != null) {
            n = n.next;
        }

        n.next = end;
    }

    public Node deleteNode(Node head, int d) {
        Node n = head;

        if(n.data == d) {
            return n.next; /* moved head */
        }

        while(Objects.nonNull(n.next)) {
            if(n.next.data == d) {
                n.next = n.next.next;
                return head;
            }
            n = n.next;
        }

        return head;
    }

    public void printList() {
        Node n = this;
        if(Objects.nonNull(n)) {
            StringBuilder sb = new StringBuilder();
            sb.append(n.data);
            while(Objects.nonNull(n.next)) {
                sb.append("->" + n.next.data);
                n = n.next;
            }
            System.out.println(sb.toString());
        } else {
            System.out.println("List is empty");
        }
    }
}
