public class Exercise2_15{
    public static void main(String[]args){
        System.out.println();
        //make five lines of dashes
        for(int i=1; i<=5; i++){
            //number of dashes is six minus the line number
            for(int j=1; j<=(6-i); j++){
                System.out.print("-");
            }
            //output odd numbers through ten where the number of repeats is equal to the number
            int k=2*i-1;
            for(int l=1; l<=k; l++){
                System.out.print(k);
            }
            //number of dashes is six minus the line number
            for(int j=1; j<=(6-i); j++){
                System.out.print("-");
            }
            System.out.println();
        }
    }
}
