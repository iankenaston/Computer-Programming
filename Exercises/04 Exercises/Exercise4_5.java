public class Exercise4_5{
    public static void main(String []args){
         printRange(7,2);
    }
    public static void printRange(int a, int b){
        if(a<b){
            System.out.print("[");
            for(int i=0; i<(b-a); i++){
                System.out.print(a+i+", ");
            }
            System.out.print(b);
            System.out.print("]");
        }
        if(a>b){
            System.out.print("[");
            for(int i=0; i>-(a-b); i--){
                System.out.print(a+i+", ");
            }
            System.out.print(b);
            System.out.print("]");
        }
        if(a==b){
            System.out.print("["+a+"]");
        }
    }
}