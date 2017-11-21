import java.util.*;
public class Exercise5_8{
    public static void main(String[] args){
        Random r=new Random();
        int x=0;
        int max=0;
        while(x<3 && x>-3){
            int y=r.nextInt(2);
            if(y==1){
                x=x+1;
            }else{
                x=x-1;
            }
            if(max<x){
                max=x;
            }
            System.out.println("position = "+x);
        }
        System.out.println("max position = "+max);
    }
}