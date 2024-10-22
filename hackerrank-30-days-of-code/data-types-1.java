import java.io.*;
import java.util.*;

public class Solution {
    static private Scanner input = new Scanner(System.in);
    
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int i = Integer.parseInt(input.nextLine());
        double d = Double.parseDouble(input.nextLine());
        String s = input.nextLine();
        
        // int myI = 27;
        // double myD = 7.14;
        // char myS = 'K';
        // String myS = "The place where I'm coding now";
        
        // int myI = 16 - i;
        // double myD = 8 - d;
        
        int myI = 4;
        double myD = 4;
        String myS = "HackerRank";
        
        int sumI = myI + i;
        double sumD = myD + d;
        String sumS = myS + ' ' + s; // ' ' char is autoconverted to a String in conc.
        
        System.out.println(sumI);
        System.out.println(sumD);
        System.out.println(sumS);
    }
}
