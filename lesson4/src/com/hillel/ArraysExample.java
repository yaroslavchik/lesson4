package com.hillel;

public class ArraysExample {
    
    public static void main(String[] args) {
        
        int[] array = new int[10];
        
        for (int i = 0; i < 10; i++) {
            array[i] = i;
            System.out.println(array[i]);
        }
        
        for (int i = 0; i < array.length; i++) {
            int element = array[i];
            System.out.println (element);
        }
        
        for (int element : array) {
            System.out.println(element);
        }
        
    }
}