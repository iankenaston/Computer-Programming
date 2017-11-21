public class Exercise3_9{
    public static void main(String[] args){
        distance(1,0,4,4);
    }
    public static void distance(int x1, int y1, int x2, int y2){
        double d=Math.sqrt(Math.pow((x2-x1),2)+Math.pow((y2-y1),2));
        System.out.println("Distance="+d);
    }
}