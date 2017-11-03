package com.hillel;

public class ForLoopExample {
    
    public static void main(String... args) {
        
        /* int i = 11;
        
        do {
            System.out.println("Hello World");
        } while (i < 10);
        */
        
        /* for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
        */
        
        int num = Integer.parseInt(args[0]);
        int sum = 0;
        
        while (num > 0) {
            int i = num % 10;
            sum += i;
            num /= 10;
        }
        
        System.out.println("Summa = " + sum);
        
    }
}