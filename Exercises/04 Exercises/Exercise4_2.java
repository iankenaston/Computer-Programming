public class Exercise4_2{
    public static void main(String[] args){
        repl("hello", 3);
    }
    public static void repl(String x, int r){
        for(int i=1; i<=r; i++){
            System.out.print(x);
        }
    }
}