package com.datastructure;

public class LinkedList<E> {

    Node<E> head;
    Node<E> tail;


    public void push(E key) {
        Node<E> newNode = new Node(key);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    public void display() {
        Node<E> temp = head;
        while (temp != null) {
            System.out.print(temp.key + " -> ");
            temp = temp.next;
        }
        System.out.println();
    }

    public void append(E key) {
        Node<E> newNode = new Node(key);
        if (head == null) {
            head = newNode;
        } else {
            tail.next = newNode;
        }
        tail = newNode;
    }

    public E pop() {
        if (head == null) {
            return null;
        } else {
            E popData = head.key;
            head = head.next;
            return popData;
        }
    }

    public int size() {
        int count = 0;
        Node<E> node = head;
        while (node != null) {
            node = node.next;
            count++;
        }
        return count;
    }

    public E peek() {
        return head.getKey();
    }
}
