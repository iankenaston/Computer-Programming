public class Exercise2_10{
    public static void main(String[]args){
        System.out.println();
        for(int i=1; i<=6; i++){
            for(int k=1; k<=9; k++){
                System.out.print(" ");
            }
            System.out.print("|");
        }
        System.out.println();
        for(int i=1; i<=6; i++){
            for(int k=1; k<=10; k++){
                System.out.print(k%10);
            }
        }
    }
}