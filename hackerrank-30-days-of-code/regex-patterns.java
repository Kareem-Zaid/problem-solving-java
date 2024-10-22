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

        int N = Integer.parseInt(bufferedReader.readLine().trim());
        List<String> validNames = new ArrayList<>();
        
        for (int NItr = 0; NItr < N; NItr++) {
            String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

            String firstName = firstMultipleInput[0];

            String emailID = firstMultipleInput[1];
            
            if (emailID.contains("@gmail.com")) {
                validNames.add(firstName);
            }
        }
        
        // validNames.sort((a, b) -> a.compareTo(b)); // Same (Java 8+)
        // validNames.sort(String::compareTo); // ... same (Java 8+)
        Collections.sort(validNames, new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                return a.compareTo(b);
            }
        });
        
        for (String name : validNames) {
            System.out.println(name);
        }
        
        bufferedReader.close();
    }
}
