package com.hillel;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Test;

public class CustomLinkedListTest {

  @Test
  public void shouldGet() {
    CustomLinkedList list = new CustomLinkedList();
    list.add(5);
    list.add(7);
    list.add(1);
    list.add(3);
    list.add(4);


  }

}
