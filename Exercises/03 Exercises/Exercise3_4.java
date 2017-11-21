public class Exercise3_4{
    public static void main(String[] args){
        printSquare(3,9);
    }
    public static void printSquare(int min, int max){
        for(int h=min; h<=max; h++){
            System.out.print(h);
        }
        System.out.println();
        for(int i=(min+1); i<=max; i++){
            for(int j=i; j<=max; j++){
                System.out.print(j);
            }
            for(int m=min; m<=i-1; m++){
                System.out.print(m);
            }
            System.out.println();
        }
    }
}