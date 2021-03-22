/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week5Loops;

import java.util.Scanner;

/**
 *
 * @author river
 */
public class MathLooping {

    public static void main(String[] args) {
        // declare variables for loop control and math problem
        final int TOTAL = 8;
        int userAnswer;
        int numLoops = 0;
        // create scanner
        Scanner input = new Scanner(System.in);

        // create while loop using numLoops to control looping
        while (numLoops < 3) {
            // prompt user to answer hardcoded math question, 3 + 5
            System.out.println("What is 3 + 5?");
            // read user input from scanner
            userAnswer = input.nextInt();

            // create if else logic for possible answers
            if (userAnswer == TOTAL) {
                // if user gets answer right, cogragulate them and break out of loop
                System.out.println("Congratulations!");
                break;
            } else if (userAnswer > TOTAL) {
                // if user guesses too high, tell them and restart loop
                System.out.println("Incorrect, too high.");
            } else {
                // if user guesses to low, tell them and restart loop
                System.out.println("Incorrect, too low.");
            }//close if else blocks
            // if user guesses wrong 3 times, end loop and give solution
            // create numLoops counting structure to max out at 3 loops
            numLoops = numLoops + 1;
            //if(numLoops == 3) {
            //  System.out.println()

        } //close while loop
        System.out.println();
        System.out.println("Solution: 3 + 5 = 8");
    } // close method
} // close class
