package com.bridgelabz;

public class LinkedListMain {

    public static void main(String[] args) {

        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.push(70);
        linkedList.push(30);
        linkedList.push(56);
        linkedList.display();

        System.out.println();
        Integer popData = linkedList.pop();
        if (popData == null) {
            System.out.println("Empty linked list");
        } else
            System.out.println("First Element Popped " + popData);
        linkedList.display();

        System.out.println();

        LinkedList<Integer> linkedList1 = new LinkedList<>();
        linkedList1.append(56);
        linkedList1.append(30);
        linkedList1.append(70);
        linkedList1.display();

        Integer popLastElement = linkedList1.popLast();
        if (popLastElement == null)
            System.out.println("Empty linked list..");
        else
            System.out.println("Last Element popped.." + popLastElement);
        linkedList1.display();

        LinkedList<Integer> linkedList2 = new LinkedList<>();
        linkedList2.findNode(30);
        linkedList2.append(56);
        linkedList2.append(30);
        linkedList2.append(70);
        linkedList2.display();

        System.out.println();

        Node<Integer> findElement = linkedList2.findNode(30);
        if (findElement == null)
            System.out.println("Element not Found..");
        else
            System.out.println("Element Found...");
        System.out.println(findElement);

        System.out.println();

        LinkedList<Integer> linkedList3 = new LinkedList<>();
        linkedList3.append(56);
        linkedList3.append(30);
        linkedList3.append(70);
        linkedList3.display();
        linkedList3.insertAfter(30, 40);
        linkedList3.display();

        System.out.println();

        linkedList3.delete(40);
        linkedList3.display();
        System.out.println("Size of List: "+ linkedList3.size());
        linkedList3.display();

        //linkedList3.sort();
    }
}

