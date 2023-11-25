/**
 * @class:  CentennialPresenceChecker
 * @author: Fuaineaitee Willie
 * @version: 1.0
 * @written on: November 25, 2023
 * @course:  ITEC 2140 - 13 , Fall 2023
 * Description:  write the code necessary to determine if the centennial (1876, at 100 years) is present.

 */

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;

public class CentennialPresenceChecker {
    public static void main(String[] args) {
        ArrayList<LocalDate> importantDates = new ArrayList<>();
        importantDates.add(LocalDate.of(1776, Month.JULY, 4));
        importantDates.add(LocalDate.of(1876, Month.JULY, 4));
        importantDates.add(LocalDate.of(1976, Month.JULY, 4));
        importantDates.add(LocalDate.of(2076, Month.JULY, 4));

        LocalDate centennialToCheck = LocalDate.of(1876, Month.JULY, 4);

        // Check if the centennial (1876) is present
        boolean isCentennialPresent = importantDates.contains(centennialToCheck);

        // Print the result
        System.out.println("Centennial present = " + isCentennialPresent);
    }
}
