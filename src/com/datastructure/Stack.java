package com.datastructure;

public class Stack<E> {

    LinkedList<E> linkedList = new LinkedList<>();

    public void push(E key) {

        linkedList.push(key);
    }

    public void display() {

        linkedList.display();
    }

    public void pop() {

        linkedList.pop();
    }

    public boolean isEmpty() {

        return linkedList.size() == 0;
    }

    public E peek() {
        return linkedList.peek();
    }
}
