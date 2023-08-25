/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mathgame;
import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author Sean
 */
public class MathGame {

    public static void main(String[] args) {
        System.out.println("Welcome to the Math Game!");
        System.out.println("Here are the games you can play:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.print("Choose a game: ");
        Scanner gameChoice = new Scanner(System.in);
        int game = gameChoice.nextInt();
        
        switch (game) {
            case 1:
                System.out.println("Choose a difficulty!");
                System.out.println("1. Easy - numbers 1-100");
                System.out.println("2. Medium - numbers 1000 - 10000");
                System.out.println("3.Hard - numbers 10000 - 100000");
                Scanner difficultyChoice = new Scanner(System.in);
                int difficulty = difficultyChoice.nextInt();
                    
                switch (difficulty) {
                    case 1:
                        while(true){
                            Random easyAdd = new Random();
                            int easyLimit = 100;
                            int numOne = easyAdd.nextInt(easyLimit);
                            int numTwo = easyAdd.nextInt(easyLimit);
                            int answer = numOne + numTwo;
                            
                            System.out.print(numOne + " + " + numTwo + " = " );
                            Scanner input = new Scanner(System.in);
                            int user_answer = input.nextInt();
                            if(user_answer == answer){
                                System.out.println("Correct!");
                            }
                            else if(user_answer == 69420){
                                break;
                            }
                            else {
                                System.out.println("Incorrect!");
                            }
                            
                        }
                }
        }
        
    }
}
