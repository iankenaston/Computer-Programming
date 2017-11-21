public class Exercise3_12{
    public static void main(String[] args){
        vertical("hey now");
    }
    public static void vertical(String words){
        for(int i=1; i<=words.length(); i++){
            System.out.println(words.charAt(i-1));
        }
    }
}