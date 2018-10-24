/*
 * Peter Horne-Deus
 * DiceRolls.java
 * This program has two die that roll and give a total. You try to guess the total
 * October 24,2018
 */

package dicerolls;

import java.util.Scanner;
import java.util.Random;

public class DiceRolls {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyedInput = new Scanner(System.in);
        
        //Variables
        int dice1,dice2,diceTotal,diceRolled;
        int userGuess;
        
        //Arrays
        int[] die1 = new int[6];
        int[] die2 = new int[6];
        int[] total = new int[6];
        int[] guess = new int[6];
        
        diceRolled = 0;
        
        do{
        //Code
        System.out.println("Enter A Guess For The Total Of Two 6 Sided Die (Maximum of 12 and minimum of 2)");
        userGuess = keyedInput.nextInt();
        
        //Random numbering the die
        dice1 = (int)Math.round(Math.random()*5+1);
        die1[diceRolled] = dice1;
        dice2 = (int)Math.round(Math.random()*5+1);
        die2[diceRolled] = dice2;
        
        
        diceTotal = dice1 + dice2;
        total[diceRolled] = diceTotal;
        
        guess[diceRolled] = userGuess;
        
        if (userGuess >= 2 && userGuess <=12){
            diceRolled ++;
            if (userGuess == diceTotal){
                System.out.println("Correct Guess");
            }
            else {
                System.out.println("Incorrect Guess");
            }
        }
        else {
            System.out.println("Enter a usable variable");
        }
        
        }while (diceRolled < 6);
        System.out.println("Dice1       Dice2       Total       You Guessed");
        System.out.println(die1[0] + "          " + die2[0]+"               " + total[0]+"          " + guess[0]);
        System.out.println(die1[1] + "          " + die2[1]+"               " + total[1]+"          " + guess[1]);
        System.out.println(die1[2] + "          " + die2[2]+"               " + total[2]+"          " + guess[2]);
        System.out.println(die1[3] + "          " + die2[3]+"               " + total[3]+"          " + guess[3]);
        System.out.println(die1[4] + "          " + die2[4]+"               " + total[4]+"          " + guess[4]);
        System.out.println(die1[5] + "          " + die2[5]+"               " + total[5]+"          " + guess[5]);
    }
}
