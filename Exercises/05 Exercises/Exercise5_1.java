public class Exercise5_1{
    public static void main(String[] args){
         showTwos(7);
         showTwos(18);
         showTwos(68);
         showTwos(120);
         showTwos(64);
    }
    public static void showTwos(int x){
        System.out.print(x+" = ");
        int i=0;
        int y=x;
        while(x%2==0){
            if(i==0){
                System.out.print("2");
            }else{
                System.out.print(" * 2");
            }
            x=x/2;
            i++;
        }
        if(y%2 != 0){
            System.out.print(x);
        }else{
            System.out.print(" * "+x);
        }
        System.out.println();
    }
}