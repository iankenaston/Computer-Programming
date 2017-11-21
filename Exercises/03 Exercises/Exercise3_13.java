public class Exercise3_13{
    public static void main(String[] args){
        printReverse("hello there!");
    }
    public static void printReverse(String x){
        System.out.println();
        for(int i=1; i<=x.length(); i++){
            System.out.print(x.charAt(x.length()-i));
        }
    }
}