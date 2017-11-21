public class Exercise2_17{
    public static final int HEIGHT=55;
    public static void main(String[]args){
        for(int i=1; i<=HEIGHT; i++){
            for(int j=1; j<=(i*2-2); j++){
                System.out.print("\\");
            }
            for(int k=1; k<=(HEIGHT*4)+2-4*i; k++){
                System.out.print("!");
            }
            for(int j=1; j<=(i*2-2); j++){
                System.out.print("/");
            }
            System.out.println();
        }
    }
}
//4=18,6=26,8=34