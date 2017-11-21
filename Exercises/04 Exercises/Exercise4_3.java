public class Exercise4_3{
    public static void main(String[] args){
        season(12,19);
    }
    public static void season(int m, int d){
        int t=m*100+d;
        if(t>=1216 && t<=1231){
            System.out.println("winter");
        }
        if(t>=101 && t<=315){
            System.out.println("winter");
        }
        if(t>=316 && t<=615){
            System.out.println("spring");
        }
        if(t>=616 && t<=915){
            System.out.println("summer");
        }
        if(t>=916 && t<=1215){
            System.out.println("winter");
        }
    }
}