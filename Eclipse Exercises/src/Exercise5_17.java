import java.util.*;
public class Exercise5_17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner x = new Scanner(System.in);
		System.out.print("input for digit range: ");
		int num = x.nextInt();
		int min = 9;
		int max = 0;
		int length = (int)(Math.log10(num)+1);
		for(int i=0; i<=length-1; i++) {
			int y=(int)((num % (Math.pow(10,length-i)))-(num % (Math.pow(10,length-i-1))));
			y=(int)(y/(Math.pow(10,length-i-1)));
			if(y>max) {
				max=y;
			}
			if(y<min) {
				min=y;
			}
		}
		System.out.println(max-min+1);
	}

}
