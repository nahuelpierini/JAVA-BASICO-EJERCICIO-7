package com.company;

import java.util.ArrayList;
import java.util.LinkedList;

public class P5_ArrayListYLinkedList {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);

        System.out.println(arrayList);
        for (int i=0; i<arrayList.size();i++){
            System.out.println(arrayList.get(i));
        }

        LinkedList<Integer> linkedList = new LinkedList<>(arrayList);

        System.out.println(linkedList);
        for (int j=0; j<linkedList.size();j++){
            System.out.println(linkedList.get(j));
        }
    }
}
