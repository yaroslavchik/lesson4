package com.hillel;

import java.util.EmptyStackException;

public class CustomStack {

  private int[] array;
  private int[] arrayMinimum;
  private int minimum;
  private int size;
  private static final int DEFAULT_CAPACITY = 10;


  public CustomStack() {
    this(DEFAULT_CAPACITY);
  }

  public CustomStack(int capacity) {
    array = new int[capacity];
    arrayMinimum = new int[capacity];
  }

  public void push(int element) {
    if (size > array.length || size < 0) {
      throw new StackOverflowError();
    }
    if(isEmpty()) {
      minimum = element;
    } else if (element < minimum) {
      minimum = element;
    }
    arrayMinimum[size] = minimum;
    array[size++] = element;
  }

  public int pop() {
    if (size < 0) {
      throw new EmptyStackException();
    }
    if (array[size - 1] == minimum) {

    }
    return array[--size];
  }

  public int peak() {
    if (size < 0) {
      throw new EmptyStackException();
    }
    return array[size - 1];
  }

  public int min() {
    return arrayMinimum[size - 1];
  }

  public boolean isEmpty() {
    return size == 0;
  }

  public int size() {
    return size;
  }

}
