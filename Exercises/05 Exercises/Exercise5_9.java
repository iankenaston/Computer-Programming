import java.util.*;
public class Exercise5_9{
    public static void main(String[] args){
        Scanner x=new Scanner(System.in);
        System.out.print("input for factors: ");
        int n=x.nextInt();
        System.out.print("1");
        for(double i=n-1; i>=2; i--){
            if(i<=n/2){    
                double y=n/i;
                int z=(int)y;
                if(z+.0001>y&&z-.0001<y){
                    System.out.print(" and "+z);
                }
            }
            if(i>n/2){    
                double y=n/i;
                int z=(int)y;
                if(z+.0001>y&&z-.0001<y){
                    System.out.print(" and "+(int)i);
                }
            }
        }
        System.out.print(" and "+n);
    }
}