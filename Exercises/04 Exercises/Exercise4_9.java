public class Exercise4_9{
    public static void main(String[] args){
        printTriangleType(5, 7, 7);
        printTriangleType(6, 6, 6);
        printTriangleType(5, 7, 8);
        printTriangleType(2, 18, 2);
    }
    public static void printTriangleType(int a, int b, int c){
        if(a>=b+c||b>=a+c||c>=a+b){
            throw new IllegalArgumentException("Not a triangle :(");
        }else if(a==b&&b==c){
            System.out.println("Equalateral");
        }else if(a!=b&&a!=c&&b!=c){
            System.out.println("Scalene");
        }else{
            System.out.println("Isoceles");
        }
    }
}