/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mightWeBeFriends;

import java.util.Scanner;
        
public class Joshua {
    
    public static void main(String[] args){
        
        // Declare and initialize variables
        double compatScore = 0;
        final int COMPAT_THRESHOLD = 3;
        int userResponse;
            
        // create scanner
        Scanner userInputScanner = new Scanner(System.in);
        
        // print display welcome language "Welcome to my friendship macine."
        System.out.println("Welcome to my friendship match machine");
        
        //******************************
        //      Q1: Intro Question
        //******************************
        // print display question to user: "Shall we play a game?"
        System.out.println("Shall we play a game?");
        // print display request user response 1 or 2
        System.out.println("Enter 1 for Yes, and 2 for No.");
        // use scanner to read user input
        userResponse = userInputScanner.nextInt();
        
        // if/else. Yes = 1, No=0. 
        // if yes add 1 point, else if no subtract 1000 points and send to final score
        // this if block will contain nested logic run only if user wants to play a game
        if(userResponse == 1){
            // plus 1 point if wants to play a game
            compatScore = + 1;
            System.out.println("Terrific, let's have some fun!");
            
            // ask Q2: Movie question with selection options
            //*************************
            //     Q2: Movie Question
            //*************************
            
            System.out.println();
            System.out.println("Do you know what movie the line: Shall We Play a Game is From?");
            System.out.println("Enter the number corresponding to the movie title:");
            System.out.println();
            System.out.println("1: Sesame Street");
            System.out.println("2: It");
            System.out.println("3: War Games");
            System.out.println("4: Willy Wonka and the Chocolate Factory");
            
            // use Scanner to read user input
            userResponse = userInputScanner.nextInt();
            // initiate switch using the variable userResponse
            switch(userResponse){
                case 1: 
                    compatScore = compatScore - 1;
                    System.out.println("Incorrect, but nice try big bird!");
                    break;
                case 2: 
                    compatScore = compatScore - 1;
                    System.out.println("Oh no, not those nightmares please!");
                    break;
                case 3: 
                    compatScore = compatScore + 2;
                    System.out.println();
                    System.out.println("GREETINGS PROFESSOR FALKEN");
                    System.out.println();
                    
                    // ask cool War Games follow up question and iniate nested if/else
                    //*********************
                    // Q3: War Games follow up
                    //*********************
                                       
                    System.out.println("Is the voice in your head reading the words");
                    System.out.println("'Shall we Play a Game,' and 'Welcome Professor Falken' in 1980's style computer voice?");
                    System.out.println();
                    System.out.println("Enter 1 if you totally are.");
                    System.out.println("Enter 2 if you're too cool for that kind of thing.");
                    // use scanner to read user input
                    userResponse = userInputScanner.nextInt();
                    // initiate nested if/else for War Games follow up question
                    if(userResponse == 1){
                        compatScore = compatScore + 2;
                        System.out.println("You must be very old to remember how Joshua sounds...");
                    } else{
                        compatScore = compatScore - 1;
                        System.out.println("Yes, and...");
                    } // close if/else bracket for nested if/else inside case 3
                    break; //break for case 3
                case 4: 
                    compatScore = compatScore + 0;
                    System.out.println("Incorrect, but here's a follow up question");
                    // ask fun willy wonka follow up question
                    //**********************
                    // Q4: Willy Wonka follow up
                    //**********************
                    
                    System.out.println();
                    System.out.println("Who played Willy Wonka the best?");
                    System.out.println("1: Gene Wilder");
                    System.out.println("2: Johnny Depp");
                    System.out.println("3: No one, the book is always better!");
                    // use scanner to read user input
                    userResponse = userInputScanner.nextInt();
                    // initiate nested switch logic inside case 4
                    switch(userResponse){
                        case 1:
                            compatScore = compatScore + 2;
                            System.out.println("Indeed!!!");
                            break;
                        case 2:
                            compatScore = compatScore - 2;
                            System.out.println("Uhm, go watch a Pirate Movie.");
                            break;
                        case 3:
                            compatScore = compatScore + 1;
                            System.out.println("I can respect that.");
                            break;
                    } //close nested sub-switch inside case of case 4 Q2
                    break; // break for case 4 for Q2 Movie Question switch logic         
            } // close switch for Q2: Movie Question
            
            //*****************
            //   Q3: TicTacToe Question
            //*****************
            // print display "Do you like tic tac toe?"
            System.out.println();
            System.out.println("Let's move on to another question.");
            System.out.println("Do you like tic-tac-toe?");
            System.out.println("Enter 1 for Yes, and 2 for No.");
            // use scanner to read user input  
            userResponse = userInputScanner.nextInt();
            // initiate if/else logic for user response
            if(userResponse == 1){
                compatScore = compatScore - 1;
                
                // initiate if/else logic for a follow up question
                //*******Q4: Global Thurmonuclear War********
                
                System.out.println("Interesting...");
                System.out.println("How about Global Thermonuclear War?");
                System.out.println("Enter 1 for Yes, and 2 for No.");
                // user scanner to read user input
                userResponse = userInputScanner.nextInt();
                // initiate nested if/else logic for Q4
                if(userResponse == 1){
                    compatScore = compatScore - 10;
                    System.out.println("Hmm, but the only way to win, is not to play.");
                    System.out.println("I'm not sure we can be friends, but let's see.");
                } else {
                    // no compatScore change, I mean,tic tac toe sucks
                    System.out.println("Well, at least you aren't into starting the Apocolypse.");
                } //close if/else logic for Q4
                
            } else {  // begin else logic for Q3
                compatScore = compatScore + 1;
                System.out.println("Agreed, tic-tac-toe sucks. The only way to win is not to play.");
            } // cloe else block for Q3
            
            //********************
            // Q5: Chess question
            //********************
            
            System.out.println();
            System.out.println("Allright Professor, how about a nice game of chess?");
            System.out.println("Enter 1 for Yes, and 2 for No.");
            // use scanner to read user input
            userResponse = userInputScanner.nextInt();
            // begin if/else logic for Q5
            if(userResponse == 1){
                compatScore = compatScore + 1;
                System.out.println("Great, all the cool people are playing!");
            } else {
                compatScore = compatScore - 1;
                System.out.println("That's too bad, it's the game of Kings(and Queens)!");
            } // close Q5: Chess question if/else block
        
        // close Q1 Intro Question if block and open Q1 Intro Question else block    
        } else if (userResponse == 2){
            compatScore = - 10;
            System.out.println("You can never learn if you never play.");
        } // close original Q1: Intro Question else logic block
             
        // print display calculating score wording
        System.out.println();
        System.out.println("Please wait while match machine does it's machining.");
        System.out.println("Beep Boop Bop. Flashing multi colored lights.");
        System.out.println();
        
        // if compatScore is >= 5 is True flip passThreshold to True because we can be friends
        if(compatScore >= COMPAT_THRESHOLD){
            System.out.println("Terrific, it looks like we might be able to save the world together!");
        } else { // open else block for if passThreshold is false, we can't be friends
            System.out.println("This friend machine has computed that we may not be a match.");
            System.out.println("But machines are often wrong, because they are created by people...");
            System.out.println("and people are definitely weird.");
        } // close if/else block for score computation
    } // close main method
} // close Joshua class 
