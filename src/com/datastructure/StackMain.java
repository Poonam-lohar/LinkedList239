package com.datastructure;

public class StackMain {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(70);
        stack.push(30);
        stack.push(56);
        System.out.println("Stack...");
        stack.display();

        System.out.println("POP from the Stack...");
        while (!stack.isEmpty()) {
            System.out.println(stack.peek());
            stack.pop();
            stack.display();
        }
    }
}
