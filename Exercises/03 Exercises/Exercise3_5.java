public class Exercise3_5{
    public static void main(String[] args){
        printGrid(4,6);
    }
    public static void printGrid(int row, int col){
        System.out.println();
        for(int i=1; i<=row; i++){
            for(int j=i; j<=(row*col); j=(j+4)){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}