public class Exercise3_3{
    public static void main(String[] args){
        printPowersOfN(4,3);
        printPowersOfN(5,6);
        printPowersOfN(-2,8);
    }
    public static void printPowersOfN(int base, int pow){
        System.out.println();
        for(int i=0; i<=pow; i++){
            double j = Math.pow(base,i);
            System.out.print( (int) j + " ");
        }
    }
}