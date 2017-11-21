import java.util.Scanner;
public class Exercise5_2{
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        System.out.println("Enter two numbers to calculate GCD");
        int x = console.nextInt();
        int y = console.nextInt();
        int z = x%y;
        int q = z;
        if(x%y==0){
            System.out.println(y);
        }else{
            while(y%z != 0){
                q=z;
                z=y%z;
                y=q;
            }
            System.out.println(z);
        }
    }
}