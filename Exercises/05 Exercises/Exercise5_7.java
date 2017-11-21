import java.util.*;
public class Exercise5_7{
    public static void main(String[] args){
        Scanner c=new Scanner(System.in);
        System.out.print("Desired dice sum:");
        int n=c.nextInt();
        Random r=new Random();
        int x=1;
        while(x != n){
            int y=r.nextInt(6)+1;
            int z=r.nextInt(6)+1;
            x=y+z;
            System.out.println(y+" and "+z+" = "+x);
        }
    }
}