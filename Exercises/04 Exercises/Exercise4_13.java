import java.util.Scanner;
public class Exercise4_13{
    public static void main(String[] args){
        Scanner x = new Scanner(System.in);
        System.out.println("palindrome identifier");
        String word = x.nextLine();
        int y = 0;
        for(int i=0; i<=word.length()/2-1; i++){
            if(word.charAt(i)==word.charAt(word.length()-1-i)){
                y++;
            }
        }
        if(y==word.length()/2){
            System.out.println("palindrome");
        }else{
            System.out.println("not palindrome");
        }
    }
}