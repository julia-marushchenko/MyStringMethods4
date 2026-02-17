/**
 *  Java program to demonstrate comparing strings.
 */
package com.mystrings;

/**
 *  Main class.
 */
public class Main {

    // Main method to run java program.
    public static void main(String[] args) {

        // Creating string variable.
        String str = "Cream";
        String str1 = "Cream";

        // Comparing str and str1 with ==.
        System.out.println(str == str1); // Otput: true because str and str1 linked
        // to the same variable in stack memory.

        // Comparing str and str1 with method equals().
        System.out.println(str.equals(str1)); // Output: true, because they have the same values.

        // Creating a new string with the same value using new keyword.
        String str2 = new String("Cream");

        // Comparing str and str2 with ==.
        System.out.println(str == str2); // Otput: false, because word 'new' creates string in Heap
        // memory, but str is still in Stack one.

        // Comparing str and str2 with method equals().
        System.out.println(str.equals(str2)); // Output: true, because they have the same values.

    }
}