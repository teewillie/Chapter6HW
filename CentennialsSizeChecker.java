/**
 * @class:  CentennialsSizeChecker
 * @author: Fuaineaitee Willie
 * @version: 1.0
 * @written on: November 25, 2023
 * @course:  ITEC 2140 - 13 , Fall 2023
 * Description:  write the code necessary to determine the ArrayList size
 */

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;

public class CentennialsSizeChecker {
    public static void main(String[] args) {
        ArrayList<LocalDate> centennials = new ArrayList<>();
        centennials.add(LocalDate.of(1776, Month.JULY, 4));
        centennials.add(LocalDate.of(1876, Month.JULY, 4));
        centennials.add(LocalDate.of(1976, Month.JULY, 4));
        centennials.add(LocalDate.of(2076, Month.JULY, 4));

        // Determine the ArrayList size and print it
        int size = centennials.size();
        System.out.println("size = " + size);
    }
}
