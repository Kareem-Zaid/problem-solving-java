import java.io.*;
import java.util.*;

public class Solution {
    private static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int t = Integer.parseInt(sc.nextLine()); // Number of string inputs
        
        for (int i = 0; i < t; i++) {
            String s = sc.nextLine(); // Each string input
            String lhs = ""; // Initialize even-indexed conc string
            String rhs = ""; // Initialize odd-indexed conc string
            
            for (int j = 0; j < s.length(); j++) {
                if (j % 2 == 0) {
                    lhs += s.charAt(j); // Concatenate even-indexed characters
                } else {
                    rhs += s.charAt(j); // Concatenate odd-indexed characters
                }
            }
            System.out.println(lhs + " " + rhs); // Output each result of input
        }
    }
}
