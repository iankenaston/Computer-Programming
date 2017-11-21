import java.util.*;
public class Exercise5_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner x = new Scanner(System.in);
		System.out.println("Input a #: ");
		int a = x.nextInt();
		System.out.println("Input a #: ");
		int b = x.nextInt();
		System.out.println("Input a #: ");
		int c = x.nextInt();
		if(a>b && b>c) {
			b=b+1;
			c=c+2;
		}else if(b>a && a>c) {
			a=a+1;
			c=c+2;
		}else if(c>b && b>a) {
			a=a+2;
			b=b+1;
		}else if(c>a && a>b) {
			a=a+1;
			b=b+2;
		}else if(b>c && c>a) {
			a=a+2;
			c=c+1;
		}else if(a>c && c>b) {
			b=b+2;
			c=c+1;
		}
		if(a==b && b==c) {
			System.out.println("Consectutive!");
		}else {
			System.out.println("Not Consectutive");
		}
	}

}
