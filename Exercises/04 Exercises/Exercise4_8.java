import java.util.*;
public class Exercise4_8{
    public static void main(String[] args){
        System.out.println();
        System.out.println("Student name, number of scores, scores:");
        Scanner x = new Scanner(System.in);
        String data = x.nextLine();
        int z = Integer.parseInt(data.charAt(data.indexOf(" ")+1));
        for(int i=1; i<=((int)data.charAt(data.indexOf(" ")+1)-48); i++){
            int y=Integer.parseInt(data.substring(data.indexOf(" ", z),data.indexOf(" ", z)+1));
        }
        System.out.println("'s grade is ");
    }
}
