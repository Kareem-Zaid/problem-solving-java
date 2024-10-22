import java.util.*;
import java.io.*;

//Write your code here
class Calculator {
    // int num, pow;
    
    // Calculator(int number, int power) {
    //     this.num = number;
    //     this.pow = power;
    // }
    
    int power(int num, int pow) {
        int res = 1;
        if (num < 0 || pow < 0) {
            throw new IllegalArgumentException("n and p should be non-negative");
        }
        
        // if (pow == 0) res = 1; // & loop's skipped (NB: 0^0 = 1)
        for (int i = 0; i < pow; i++) {
            res *= num;
        }
        return res;
    }
}

class Solution{

    public static void main(String[] args) {
    
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
        
            int n = in.nextInt();
            int p = in.nextInt();
            Calculator myCalculator = new Calculator();
            try {
                int ans = myCalculator.power(n, p);
                System.out.println(ans);
            }
            catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        in.close();
    }
}
