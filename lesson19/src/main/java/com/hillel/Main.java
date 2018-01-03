package com.hillel;

import java.util.Iterator;

public class Main {

  public static void main(String[] args) {
    CustomLinkedList list = new CustomLinkedList();
    list.add(5);
    list.add(1);
    list.add(2);
    list.add(4);

    /*
    Iterator iter = list.iterator();
    while (iter.hasNext()) {
      int element = (int) iter.next();
      System.out.println(element);
    }
    */

    for (Object elem : list) {
      System.out.println(elem);
    }

  }
}
