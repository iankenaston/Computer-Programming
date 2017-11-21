public class Exercise5_3{
    public static void main(String[] args){
        toBinary(44);
    }
    public static void toBinary(int x){
        String z=" ";
        while(x>=1){
            int y=x%2;
            x=x/2;
            z=z+y;
        }
        for(int i=1; i<=z.length()-1; i++){
            System.out.print(z.charAt(z.length()-i));
        }
    }
}