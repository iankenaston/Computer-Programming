import java.util.*;
public class Exercise4_6{
    public static void main(String[] args){
        System.out.println();
        Scanner console = new Scanner(System.in);
        System.out.println("How many numbers do you want to enter?");
        int max = 0;
        int min =1000000;
        int num = console.nextInt();
        for(int i=1; i<=num; i++){
            System.out.print("Number "+i+":");
            int x = console.nextInt();
            if(x>max){
                max=x;
            } else if(x<min){
                min=x;
            }
        }
        System.out.println("Greatest: "+max);
        System.out.println("Least: "+min);
    }
}