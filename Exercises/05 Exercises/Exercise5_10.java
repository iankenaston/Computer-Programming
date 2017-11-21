import java.util.*;
public class Exercise5_10{
    public static void main(String[] args){
        Scanner x = new Scanner(System.in);
        System.out.print("Input number of hops: ");
        int n = x.nextInt();
        int first = 1;
        int second = 2;
        int third = 3;
        if(n==0){
            System.out.println("  1");
        }else{
            for(int i=1; i<=n; i++){
                System.out.println("  "+first);
                System.out.println(second+"   "+third);
                first=first+3;
                second=second+3;
                third=third+3;
            }
            System.out.println("  "+(third-2));
        }
    }
}