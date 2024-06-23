package com.cbfacademy;

import java.util.*;

public class CollectionsExercises {

    public LinkedList<Integer> useLinkedList() {
        // TODO: create an empty linked list
        LinkedList<Integer> useLinkedList = new LinkedList<>();
        //  - add 4 as the first element of the list
        useLinkedList.addFirst(4);
        //  - then add 5, 6, 8, 2, 9 to the list
        useLinkedList.add(5);
        useLinkedList.add(6);
        useLinkedList.add(8);
        useLinkedList.add(2);
        useLinkedList.add(9);
        //  - add another 2 as the last element of the list
        useLinkedList.addLast(2);
        //  - add 4 as the 3rd element of the list
        useLinkedList.add(2, 4);
        //  - invoke the method element() on the list and print the result on the screen
        System.out.print(useLinkedList.element());
        //  - return the list
        return useLinkedList;
    }

    public Stack<Integer> useStack() {
        // TODO: create an empty stack
        Stack<Integer> useStack = new Stack<>();
        //  - add 5, 6, 8, 9 to the stack
        useStack.add(5);
        useStack.add(6);
        useStack.add(8);
        useStack.add(9);
        //  - print the first element of the stack on the screen
        System.out.print(useStack.firstElement());
        //  - print the last element of the stack on the screen
        System.out.print(useStack.lastElement());
        //  - invoke the method pop() on the stack and print the result on the screen
        System.out.print(useStack.pop());
        //  - invoke the push(4) method on the stack
        useStack.push(4);
        //  - return the stack
        return useStack;
    }

    public ArrayDeque<Integer> useArrayDeque() {
        // TODO: create an empty arrayDeque
        ArrayDeque<Integer> useArrayDeque = new ArrayDeque<Integer>();
        //  - add 5, 6, 8, 9 to the queue
        useArrayDeque.addFirst(5);
        useArrayDeque.add(6);
        useArrayDeque.add(8);
        useArrayDeque.addLast(9);
        //  - print the first element of the queue on the screen
        System.out.print(useArrayDeque.getFirst());
        //  - print the last element of the queue on the screen
        System.out.print(useArrayDeque.getLast());
        //  - invoke the method poll() on the queue and print the result on the screen
        System.out.print(useArrayDeque.poll());
        //  - invoke the element() method on the queue and print the result on the screen
        System.out.print(useArrayDeque.element());
        //  - return the queue
        return useArrayDeque; 
    }

    public HashMap<Integer, String> useHashMap() {
        // TODO: create an empty hash map
        HashMap<Integer, String> useHashMap = new HashMap<Integer, String>();
        //  - add {1, TypeScript} entry to the map
        useHashMap.put(1, "TypeScript");
        //  - add {2, Kotlin} entry to the map
        useHashMap.put(2, "Kotlin");
        //  - add {3, Python} entry to the map
        useHashMap.put(3, "Python");
        //  - add {4, Java} entry to the map
        useHashMap.put(4, "Java");
        //  - add {5, JavaScript} entry to the map
        useHashMap.put(5, "JavaScript");
        //  - add {6, Rust} entry to the map
        useHashMap.put(6, "Rust");
        //  - determine the set of keys from the map and print it on the screen
        System.out.print(useHashMap.keySet());
        //  - determine the set of values from the map and print it on the screen
        System.out.print(useHashMap.values());
        //  - determine whether the map contains "English" as a language and print the result on the screen
        System.out.print(useHashMap.containsValue("English"));
        //  - return the map
        return useHashMap;
    }

    public String getName() {
        return "Collections Exercises";
    }
}
