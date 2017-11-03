package com.hillel;

public class SwitchExample {
    
    public static void main(String... args) {
        
        if (args.length == 0) {
            System.out.println("Provide parametrs");
            return;
        }
        
        int number = Integer.parseInt(args[0]);
        
        switch(number) {
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
            case 4:
                System.out.println("Four");
                break;
            case 5:
                System.out.println("Five");
                break;
            default:
                System.out.println("Another number");
                
        }
    }
}