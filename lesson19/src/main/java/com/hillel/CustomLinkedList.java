package com.hillel;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class CustomLinkedList implements Iterable {

  private Node first;
  private Node last;

  public CustomLinkedList() {
    first = null;
    last = null;
  }

  public void add(int element) {
    Node current = new Node(element, null);

    if (first == null) {
      first = last = current;
    } else {
      last.next = current;
      last = current;
    }

  }

  public int poll() {
    int result = first.value;
    first = first.next;
    return result;
  }

  public int peek() {
    return first.value;
  }

  public int getHillel(int index) {
    int currentIndex = 0;
    Node current = first;

    while (current != null && currentIndex < index) {
      currentIndex++;
      current = current.next;
    }

    if(current == null) {
      throw new NoSuchElementException();
    }

    return current.value;
  }

  public void introduceCycle(int index) {

  }

  public boolean hasCycle() {
    return false;
  }
/*
  @Override
  public Iterator iterator() {
    return null;
  }
  */

  /*
  public int get2(int index) {
    Node pointer = first;
    int counter= 0;

    while (counter != index) {
      if (counter > index) {
        throw new NoSuchElementException();
      }
      counter++;
      pointer = pointer.next;
    }


    return pointer.value;

  }*/

  @Override
  public Iterator iterator() {
    return new CustomListIterator();
  }

  private class CustomListIterator implements Iterator {

    Node current;

    CustomListIterator() {
      current = first;
    }

    @Override
    public boolean hasNext() {
      return current != null;
    }

    @Override
    public Object next() {
      int res = current.value;
      current = current.next;
      return res;
    }
  }

  private class Node {

    int value;
    Node next;

    Node(int value, Node next) {
      this.value = value;
      this.next = next;
    }

  }

}