
/**
 *name:  Fernando Duffoo
 *title: Project 02
 *date:  6/11/22
 *description: This program asks the user input a change between 1 and 99 cents. The program
 then will display it in amount of quarters, dime, nickels and pennies.
 */

import java.util.Scanner;

class Main{
    public static void main(String[] args){
        
        //variables
        Scanner keyboard = new Scanner(System.in);
        int cents;
        
        //input
        System.out.println("Enter a change between 1 and 99 cents: ");
        cents = keyboard.nextInt();
        System.out.println("You have change " + cents + " cents. That is: ");
        
        //calculations
        System.out.println((cents / 25) + " quarters");
        cents = cents % 25;
        
        System.out.println((cents / 10) + " dimes");
        cents = cents % 10;
        
        System.out.println((cents / 5) + " nickels");
        cents = cents % 5;
        
        System.out.println(cents + " pennies");
        
    }
}
    

