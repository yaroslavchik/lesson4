package com.hillel;

public class Main {

  public static void main(String[] args) {
    CustomStack stack = new CustomStack();
    stack.push(5);
    stack.push(1);
    stack.push(4);
    stack.push(7);
    stack.push(3);

    System.out.println(stack.peak());
    System.out.println(stack.pop());
    System.out.println(stack.peak());
  }
}
