import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        bufferedReader.close();
        
        String nB = "";
        
        for(int i = n; i > 0; i /= 2){
            nB += i % 2;
        }
        
        String[] consecOnesList = nB.split("0+");
        // Using reduce to find the maximum length
        int maxLength = Arrays.asList(consecOnesList).stream()
                               .map(String::length) // Convert strings to their lengths
                               .reduce(0, (a, b) -> Math.max(a, b)); // Reduce to find the maximum length
        
        System.out.println(maxLength);
    }   
}
