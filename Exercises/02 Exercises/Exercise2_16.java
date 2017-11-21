public class Exercise2_16{
    public static void main(String[]args){
        for(int i=1; i<=6; i++){
            for(int j=1; j<=(i*2-2); j++){
                System.out.print("\\");
            }
            for(int k=1; k<=26-4*i; k++){
                System.out.print("!");
            }
            for(int j=1; j<=(i*2-2); j++){
                System.out.print("/");
            }
            System.out.println();
        }
    }
}
//print 22 exclamation points
//add two slashes to each side and remove 4 !
//add four slashes, and contunue adding two on each line until there are 2 ! and 20 /