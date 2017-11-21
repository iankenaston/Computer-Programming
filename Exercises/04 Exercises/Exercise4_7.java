import java.util.*;
public class Exercise4_7{
    public static void main(String[] args){
        System.out.println();
        Scanner console = new Scanner(System.in);
        System.out.println("How many numbers do you want to enter?");
        int max = 0;
        int sum = 0;
        int num = console.nextInt();
        for(int i=1; i<=num; i++){
            System.out.print("Number "+i+":");
            int x = console.nextInt();
            if(x%2==0){
                sum=sum+x;
                if(x>max){
                    max=x;
                }
            }
        }
        System.out.println("Greatest Even: "+max);
        System.out.println("Sum of Even: "+sum);
    }
}