public class Exercise3_2{
    public static void main(String[] args){
        printPowersOf2(3);
        printPowersOf2(10);
    }
    public static void printPowersOf2(int pow){
        System.out.println();
        for(int i=0; i<=pow; i++){
            double j = Math.pow(2,i);
            System.out.print( (int) j + " ");
        }
    }
}