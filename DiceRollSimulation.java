/**
 * @class:  DiceRollSimulation
 * @author: Fuaineaitee Willie
 * @version: 1.0
 * @written on: November 25, 2023
 * @course:  ITEC 2140 - 13 , Fall 2023
 * Description:  Create an ArrayList of Integers named dice4. Generate an Integer representing a roll of a
 * six-sided die 5 times, adding each result to dice4. (hint: generate a random integer value between 1 and 6,
 * inclusive). Print the ArrayList using an enhanced for loop.
 */

import java.util.Random;

public class DiceRollSimulation {
    public static void main(String[] args) {
        // Create an integer array named dice2 with a size of 6
        int[] dice2 = new int[6];

        // Populate each array location with a roll of a six-sided die
        Random random = new Random();
        for (int i = 0; i < dice2.length; i++) {
            // Random roll from 1 to 6 (inclusive)
            dice2[i] = random.nextInt(6) + 1;
        }

        // Print the array using an indexed for loop
        System.out.print("dice2 = ");
        for (int j = 0; j < dice2.length; j++) {
            System.out.print(dice2[j] + " ");
        }
    }
}
