import java.util.*;
public class Exercise5_6{
    public static void main(String[] args){
        Random r=new Random();
        int x=1;
        int y=0;
        while(x<=47){
            x=r.nextInt(50)+1;
            System.out.println("guess = "+x);
            y++;
        }
        System.out.println("total guesses = "+y);
    }
}