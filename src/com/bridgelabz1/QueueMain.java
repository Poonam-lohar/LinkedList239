package com.bridgelabz1;

public class QueueMain {

    public static void main(String[] args) {

        Queue<Integer> queue = new Queue<>();

        queue.enqueue(56);
        queue.enqueue(30);
        queue.enqueue(70);
        System.out.println("Queue...");
        queue.display();

        while(!queue.isEmpty()){
            System.out.println(queue.peek());
            queue.dequeue();
            queue.display();
        }
    }
}
