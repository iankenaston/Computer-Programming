public class Exercise3_11{
    public static void main(String[] args){
        padString("hello",8);
    }
    public static void padString(String words, int space){
        int leg= words.length();
        int xtra=space-leg;
        System.out.print("\""+words);
        for(int i=1; i<=xtra; i++){
            System.out.print(" ");
        }
        System.out.print("\"");
    }
}