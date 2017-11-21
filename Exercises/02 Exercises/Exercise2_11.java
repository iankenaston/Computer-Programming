public class Exercise2_11{
    public static final int TOTAL=15;
    public static void main(String[]args){
        System.out.println();
        for(int i=1; i<=6; i++){
            for(int k=1; k<=(TOTAL); k++){
                System.out.print(" ");
            }
            System.out.print("|");
        }
        System.out.println();
        for(int i=1; i<=6; i++){
            for(int k=1; k<=TOTAL; k++){
                System.out.print(k);
            }
            System.out.print("0");
        }
    }
}