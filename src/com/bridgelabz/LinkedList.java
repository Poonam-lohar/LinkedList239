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


    public void insertAfter(E searchData, E data) {
        Node<E> searchedNode = findNode(searchData);
        if (searchedNode == null) {
            System.out.println("Element not find...");
        } else {
            Node<E> newNode = new Node(data);
            Node<E> nextNode = searchedNode.next;
            searchedNode.next = newNode;
            newNode.next = nextNode;
            System.out.println("Inserted data: " + data);
        }
    }

    public void delete(E data) {
        if (head == null) {
            System.out.println("Empty linked list....");
            return;
        }
        Node<E> node = head;
        while (node != null) {
            if (node.next.key == data) {
                node.next = node.next.next;
                System.out.println("Deleted Element: " + data);
                return;
            }
            node = node.next;
        }
        System.out.println("Not found");
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
}


