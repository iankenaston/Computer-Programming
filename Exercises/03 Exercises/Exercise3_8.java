public class Exercise3_8{
    public static void main(String[] args){
        quadratic(1,-7,12);
    }
    public static void quadratic(int a, int b, int c){
        double d=(-b+Math.sqrt(Math.pow(b,2)-4*a*c))/(2*a);
        double e=(-b-Math.sqrt(Math.pow(b,2)-4*a*c))/(2*a);
        System.out.print("x="+(int)d+", x="+(int)e);
    }
}