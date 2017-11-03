package com.hillel;

public class SumOfNumbers {
    
    public static void main(String[] args) {
        
        int sum = 0;

        /*
        for (int i = 0; i < args.length; i++) {
            System.out.println(i + " paramets: " + args[i]);
            sum += Integer.parseInt(args[i]);
        }
        */
        
        for (String elem : args) {
            System.out.println("Parametr: " + elem);
            sum += Integer.parseInt(elem);
        }
        
        System.out.println("Summa is: " + sum);
        
    }
}