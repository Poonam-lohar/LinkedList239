package com.bridgelabz;

public class LinkedListMain {

    public static void main(String[] args) {

        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.push(70);
        linkedList.push(30);
        linkedList.push(56);
        linkedList.display();

        Integer popData = linkedList.pop();
        if (popData == null) {
            System.out.println("Empty linked list");
        } else
            System.out.println("First Element Popped " + popData);
            linkedList.display();

        LinkedList<Integer> linkedList1 = new LinkedList<>();
        linkedList1.append(56);
        linkedList1.append(30);
        linkedList1.append(70);
        linkedList1.display();

        Integer popLastElement = linkedList1.popLast();
        if (popLastElement == null)
            System.out.println("Empty linked list..");
        else
            System.out.println("Last Element popped.."+ popLastElement);
        linkedList1.display();

    }
}
