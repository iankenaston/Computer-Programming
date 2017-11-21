//import java.util.Scanner;
public class Exercise4_1{
    public static void main(String[] args){
        System.out.println("Input a number of times:");
        //Scanner console = new Scanner(System.in);
        int n = 5;
        double x = 0;
        for(double i=1; i<=n; i++){
            x += 1/i;
        }
        System.out.println("The sum of the increasing fractions is "+x);
    }
}