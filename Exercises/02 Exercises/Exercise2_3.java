public class Exercise2_3 {
    public static void main(String[]args){
        int j=1;
        int k=1;
        System.out.print(j+" ");
        System.out.print(k+" ");
        for(int i=1; i<=10; i++){
            j=j+k;
            k=j-k;
            System.out.print(j+" ");
        }
    }
}