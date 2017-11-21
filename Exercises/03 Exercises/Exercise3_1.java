public class Exercise3_1{
    public static void main(String[] args){
        printNumbers(15);
        printNumbers(5);
    }
    public static void printNumbers(int i){
        System.out.println();
        for(int j=1; j<=i; j++){
            System.out.print("[" + j + "] ");
        }
    }
}