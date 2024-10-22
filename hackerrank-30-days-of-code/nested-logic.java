import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        // Read returned date
        int d1 = sc.nextInt();
        int m1 = sc.nextInt();
        int y1 = sc.nextInt();
        
        // Read due date
        int d2 = sc.nextInt();
        int m2 = sc.nextInt();
        int y2 = sc.nextInt();
        
        int fine;
        
        if (y1 > y2) {
            // Happy new year
            fine = 10000;
        } else if (y1 < y2) {
            // Earlier year
            fine = 0;
        } else {
            // Same year
            if (m1 > m2) {
            // Late for months
            fine = 500 * (m1 - m2);
            } else if (m1 < m2) {
                // Same year, earlier month
                fine = 0;
            } else {
                // Same year & month
                if (d1 > d2) {
                    // Late for days
                    fine = 15 * (d1 - d2);
                } else {
                    // Same month, same or earlier day                    
                    fine = 0;
                }
            } 
        }
         
        
        System.out.println(fine);
    }
}
