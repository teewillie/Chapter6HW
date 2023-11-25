/**
 * @class:  DiceRollSimulation3
 * @author: Fuaineaitee Willie
 * @version: 1.0
 * @written on: November 25, 2023
 * @course:  ITEC 2140 - 13 , Fall 2023
 * Description: Create an ArrayList of Integers named dice4. 
 * Generate an Integer representing a roll of a six-sided die 5 times, adding each result 
 * to dice4. (hint: generate a random integer value between 1 and 6, inclusive). Print the
 * ArrayList using an enhanced for loop.
 */

import java.util.ArrayList;
import java.util.Random;

public class DiceRollSimulation3 {
    public static void main(String[] args) {
        // Create an ArrayList of Integers named diceSimulations
        ArrayList<Integer> diceSimulations = new ArrayList<>();

        // Generate random integers representing rolls of a six-sided die 5 times
        Random random = new Random();
        for (int i = 0; i < 5; i++) {
            // Generate a random integer between 1 and 6 (inclusive) and add it to diceSimulations
            int rollResult = random.nextInt(6) + 1;
            diceSimulations.add(rollResult);
        }

        // Print the ArrayList using an enhanced for loop
        System.out.print("diceSimulations = ");
        for (Integer result : diceSimulations) {
            System.out.print(result + " ");
        }
    }
}
