import java.util.*;
import java.lang.Math;

public class Program {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        intro();
        String time24H, time12H;
        int h, m;

        System.out.println("Enter time in 24H format (HH:MM): ");
        time24H = input.nextLine();
        h = parseHours(time24H);
        m = parseMins(time24H);
        time12H = conditionalFormatting(h, m);
        System.out.println(time12H);
    }
    
    public static String conditionalFormatting(int hours, int mins) {
        String minsStr, formattedTime;

        minsStr = padMins(mins);
        if (hours == 0) {
            formattedTime = "12:" + minsStr + " AM";
        } else {
            if (hours >= 1 && hours <= 11) {
                formattedTime = hours.toString() + ":" + minsStr + " AM";
            } else {
                if (hours == 12) {
                    formattedTime = hours.toString() + ":" + minsStr + " PM";
                } else {
                    if (hours >= 13 && hours <= 23) {
                        formattedTime = (hours - 12).toString() + ":" + minsStr + " PM";
                    } else {
                        formattedTime = "Invalid Time Input";
                        System.out.println("Enter a valid 5-character time in 24H format (HH:MM)");
                    }
                }
            }
        }
        
        return formattedTime;
    }
    
    public static void intro() {
        System.out.println("This program is used to convert the 24-hour time format to 12-hour format.");
        System.out.println("It has two functions:");
        System.out.println("1. Time parsing: Parses the text 'HH:MM' time to numerical values of hours and minutes.");
        System.out.println("2. Condition comparing: Checks the the satisfied condition, assigns a value to a string variable, and returns it.");
    }
    
    public static String padMins(int minutes) {
        String paddedMins;

        if (minutes >= 0 && minutes <= 9) {
            paddedMins = "0" + minutes.toString();
        } else {
            paddedMins = minutes.toString();
        }
        
        return paddedMins;
    }
    
    public static int parseHours(String timeStr) {
        String hhStr;
        int hours;

        hhStr = timeStr.charAt(0) + timeStr.charAt(1);
        hours = Integer.parseInt(hhStr);
        
        return hours;
    }
    
    public static int parseMins(String timeStr) {
        String mmStr;
        int mins;

        mmStr = timeStr.charAt(3) + timeStr.charAt(4);
        mins = Integer.parseInt(mmStr);
        
        return mins;
    }
}
