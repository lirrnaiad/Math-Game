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
    
    public static class Startup {
        public static void startupInfo() {
            System.out.println("Welcome to the Math Game!");
            System.out.println("Here are the games you can play:");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.print("Choose a game: ");
        }
        
        public int gameInput() {
            Scanner gameChoice = new Scanner(System.in);
            int game = gameChoice.nextInt();
            return game;
        }
    }
    
    public static class Difficulty {
         public static void difficultyInfo(int diffMin_easy, int diffMax_easy, int diffMin_medium, int diffMax_medium, int diffMin_hard, int diffMax_hard){
             System.out.println("Choose a difficulty!");
             System.out.println("1. Easy - numbers " + diffMin_easy + " - " + diffMax_easy);
             System.out.println("2. Medium - numbers " + diffMin_medium + " - " + diffMax_medium);
             System.out.println("3 .Hard - numbers " + diffMin_hard + " - " + diffMax_hard);
            }
            
         public int difficultyInput(){
             Scanner difficultyChoice = new Scanner(System.in);
             int difficulty = difficultyChoice.nextInt();
             return difficulty;
         }
    }
    
    /*
    public static class Game {
        public static gameLoop() {
            
        }
    }
    */
        
    public static void main(String[] args) {
        Startup.startupInfo();
        Startup start = new Startup();
        int game = start.gameInput();
        
        switch(game) {
            case 1:
                Difficulty.difficultyInfo(1, 99, 100, 999, 1000, 9999);
                Difficulty diff = new Difficulty();
                int difficulty = diff.difficultyInput();
                    
                switch (difficulty) {
                    case 1:
                        while(true){
                            Random easyAdd = new Random();
                            int easyLimit = 99;
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
