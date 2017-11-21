public class Exercise3_6{
    public static void main(String[] args){
        largerAbsValue(4,-5);
    }
    public static void largerAbsValue(int a, int b){
        a=Math.abs(a);
        b=Math.abs(b);
        int c=Math.max(a,b);
        System.out.println(c);
    }
}