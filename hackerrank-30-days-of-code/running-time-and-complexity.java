import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        /* Enter your code here. */
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            
            boolean loopBroken = false;
            for (int j = 2; j < n; j++) {
                if (n % j == 0) {
                    System.out.println("Not prime");
                    loopBroken = true;
                    break;
                }
            }
            if (n == 1) {
                System.out.println("Not prime");
            } else if (!loopBroken) {
                System.out.println("Prime");
            }
        }
    }
}
