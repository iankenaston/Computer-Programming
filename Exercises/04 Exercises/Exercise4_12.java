import java.util.Scanner;
public class Exercise4_12{
    public static void main(String[] args){
        Scanner x = new Scanner(System.in);
        System.out.println("Enter class grade:");
        int a=x.nextInt();
        System.out.print("GPA: ");
        if(a<60){
            System.out.print(0.0);
        }else if(a>=60&&a<=62){
            System.out.print(0.7);
        }
        for(int i=1; i<=32; i++){
            if(a==(62+i)){
                System.out.print(0.7+(i/10.));
            }
        }
        if(a>=95){
            System.out.print("4.0");
        }
    }
}