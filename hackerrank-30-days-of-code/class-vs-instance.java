import java.io.*;
import java.util.*;

public class Solution {
    // int inputAge;
    // Person person = new Person(inputAge);
    private static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int t = Integer.parseInt(input.nextLine());
        int yearsPassed = 3;
        
        for (int i = 0; i < t; i++) {
            int inputAge = Integer.parseInt(input.nextLine());
            Person person = new Person(inputAge);
            person.amIOld();
            
            for (int j = 0; j < yearsPassed; j++) {
                person.yearPasses();
            }
            
            person.amIOld();
            
            if (i != t - 1) {
                System.out.println();
            }
        }
    }
}

class Person{
    int age;
    
    Person(int initialAge) {
        // this.age = initialAge;
        if (initialAge < 0) {
            age = 0;
            System.out.println("Age is not valid, setting age to 0.");
        } else {
            age = initialAge;
        }
    }
    
    void yearPasses() {
        age++;
    }
    
    void amIOld() {
        if (age < 13) {
            System.out.println("You are young.");
        } else if (age >= 13 && age < 18) {
            System.out.println("You are a teenager.");
        } else {
            System.out.println("You are old.");
        }
    }
}
