import java.util.*;
public class Exercise5_5{
    public static void main(String[] args){
        Random r=new Random();
        int l=r.nextInt(6)+5;
        for(int i=1; i<=l; i++){ //prints # of lines
            int k=r.nextInt(80)+1; //sets limit for # of chars
            for(int j=1; j<=k; j++){ //prints # of chars
                System.out.print((char)(r.nextInt(26)+97)); //prints random chars
            }
            System.out.println(); //new line
        }
    }
}