package com.bridgelabz;

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

    public E popLast() {
        if (head == null) {
            return null;
        } else {
            E popElement = tail.key;
            Node<E> temp = head;
            while (temp.next != tail) {
                temp = temp.next;
            }
            temp.next = null;
            tail = temp;
            return popElement;
        }
    }

    public Node<E> findNode(E value) {
        if (head == null)
            return null;
        Node<E> temp = head;
        while (temp != null) {
            if (temp.key == value)
                return temp;
                temp = temp.next;
            }
            return null;
        }
    }

