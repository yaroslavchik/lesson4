package com.hillel;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class CustomStackTest {

  CustomStack stack = new CustomStack();

  @Test
  public void shouldPush() {
    stack.push(5);
    int result = stack.peak();

    assertThat(result, is(5));
  }

  @Test
  public void shouldPop() {
    stack.push(5);
    stack.push(7);
    stack.pop();
    int result = stack.peak();

    assertThat(result, is(5));
  }

  @Test
  public void shouldMin() {
    stack.push(5);
    stack.push(7);
    stack.push(4);
    stack.push(3);
    stack.pop();
    stack.push(34);
    int result = stack.min();

    assertThat(result, is(4));
  }

}
