//this program gets a birthday in multiple prompts and prints it as
//one line
import java.util.*;
public class Exercise3_14{
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        System.out.println();
        
        //get input
        System.out.print("On what day of the month were you born?");
        int day = console.nextInt();
        System.out.print("What is the name of the month in which"+
                            " you were born?");
        String month = console.next();
        System.out.print("During what year were you born?");
        int year = console.nextInt();
        
        //print answer
        System.out.println("You were born "+ month +" "+ day+", "+
                            year +". You're mighty old!");
    }
}