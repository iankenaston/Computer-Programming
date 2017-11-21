import java.util.*;
public class Exercise5_4{
    public static void main(String[] args){
        Random r = new Random();
        int x=1;
        while(x<=16){
            x=r.nextInt(16)+5;
            for(int i=1; i<=x; i++){
                System.out.print("x");
            }
            System.out.println();
        }
    }
}