
import java.util.*;
public class Exercise5_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner x = new Scanner(System.in);
		System.out.println("Input a #: ");
		int a = x.nextInt();
		System.out.println("Input a #: ");
		int b = x.nextInt();
		System.out.println("Input a #: ");
		int c = x.nextInt();
		int n = 0;
		int mid = 0;
		int max = 0;
		if(a>b && b>c) {
			n=a-c;
			mid=b;
			max=a;
		}else if(b>a && a>c) {
			n=b-c;
			mid=a;
			max=b;
		}else if(c>b && b>a) {
			n=c-a;
			mid=b;
			max=c;
		}else if(c>a && a>b) {
			n=c-b;
			mid=a;
			max=c;
		}else if(b>c && c>a) {
			n=b-a;
			mid=c;
			max=b;
		}else if(a>c && c>b) {
			n=a-b;
			mid=c;
			max=a;
		}
		if(n/2.0+mid==max) {
			System.out.println("has midpoint!");
		}else {
			System.out.println("dosen't have midpoint!");
		}
	}

}
