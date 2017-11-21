public class Exercise3_10{
    public static void main(String[] args){
        scientific(6.23,5);
        scientific(1.9,-2);
    }
    public static void scientific(double num, double exp){
        System.out.println(num*Math.pow(10,exp));
    }
}