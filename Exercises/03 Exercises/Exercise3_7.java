public class Exercise3_7{
    public static void main(String[] args){
        largerAbsValue(7,-2,-11);
    }
    public static void largerAbsValue(int a, int b, int c){
        a=Math.abs(a);
        b=Math.abs(b);
        c=Math.abs(c);
        int d=Math.max(a,b);
        int e=Math.max(d,c);
        System.out.println(e);
    }
}