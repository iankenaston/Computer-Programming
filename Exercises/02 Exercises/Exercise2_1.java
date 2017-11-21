public class Exercise2_1{
    public static void main(String[]args){
        double time=1;
        double initialpos=1;
        double initialvelo=1;
        double accelrate=1;
        System.out.print("s="+(initialpos+initialvelo*time+.5*accelrate*time*time));
    }
}