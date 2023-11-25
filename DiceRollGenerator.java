/**
 * @class:  DiceRollGenerator
 * @author: Fuaineaitee Willie
 * @version: 1.0
 * @written on: November 25, 2023
 * @course:  ITEC 2140 - 13 , Fall 2023
 * Description:
 */

import java.util.Random;

public class DiceRollGenerator {
    public static void main(String[] args) {
        // Create an integer array named diceResults with a size of 10
        int[] diceResults = new int[10];

        // Generate random rolls for a six-sided die and populate the array
        Random random = new Random();
        for (int i = 0; i < diceResults.length; i++) {
            // Random roll from 1 to 6 (inclusive)
            diceResults[i] = random.nextInt(6) + 1;
        }

        // Print the array using an enhanced for loop
        System.out.print("diceResults = ");
        for (int result : diceResults) {
            System.out.print(result + " ");
        }
    }
}
