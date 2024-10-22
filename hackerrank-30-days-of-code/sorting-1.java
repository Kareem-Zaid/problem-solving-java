import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;



public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        String[] aTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> a = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int aItem = Integer.parseInt(aTemp[i]);
            a.add(aItem);
        }

        // Write your code here
        
        int swapsTotalCount = 0;
        for (int i = 0; i < n; i++) {
        // Track number of elements swapped during a single array traversal
        // Number of traversals is represented by the outer loop
        int swapsCount = 0;
            for (int j = 0; j < n - 1; j++) {
                if (a.get(j) > a.get(j + 1)) {
                    int x = a.get(j); // Intermediate-storage variable
                    a.set(j, a.get(j + 1));
                    a.set(j + 1, x);
                    swapsCount++;
                }
            }
            // If no elements were swapped during a traversal, then array is sorted
            if (swapsCount == 0) {
                break;
            } else {
                swapsTotalCount += swapsCount;
            }
        }
        
        System.out.println("Array is sorted in " + swapsTotalCount + " swaps.");
        System.out.println("First Element: " + a.get(0));
        System.out.println("Last Element: " + a.get(n - 1));

        bufferedReader.close();
    }
}
