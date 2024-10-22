import java.io.*;
import java.util.*;

public class Solution {
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int n = Integer.parseInt(sc.nextLine());
        Map<String, String> book = new HashMap<>();
        
        // Build the phone book
        for (int i = 0; i < n; i++) {
            // List<String> entry = Arrays.asList(sc.nextLine().split("\\s+"));
            String[] entry = sc.nextLine().split("\\s+");
            String name = entry[0];
            String phone = entry[1];
            
            book.put(name, phone);
        }
        
        // Loop through unknown number of lines of queries
        while (sc.hasNextLine()) {
            String q = sc.nextLine();
            
            // Print "key=value" if query found, and "Not found" if not found :3
            if (book.containsKey(q)) {
                String v = book.get(q);
                System.out.println(q + "=" + v);
            } else {
                System.out.println("Not found");
            }
        }
    }
}
