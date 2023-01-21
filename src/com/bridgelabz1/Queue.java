package com.bridgelabz1;

public class Queue<E> {

    LinkedList<E> linkedList = new LinkedList<>();
    public void enqueue(E key) {
        linkedList.append(key);
    }

    public void display() {
        linkedList.display();
    }

    public boolean isEmpty() {
        return linkedList.size() ==0;
    }
    public E peek(){
        return linkedList.peek();
    }
    public E dequeue() {
        return linkedList.pop();
    }
}
