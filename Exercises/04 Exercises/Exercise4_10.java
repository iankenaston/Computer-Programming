import java.util.Scanner;
public class Exercise4_10{
    public static void main(String[] args){
        Scanner x = new Scanner(System.in);
        System.out.println("Enter two integers:");
        int a=x.nextInt();
        int b=x.nextInt();
        System.out.println("Average is "+((a+b)/2.));
    }
}