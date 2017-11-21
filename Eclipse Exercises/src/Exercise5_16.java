
import java.util.*;
public class Exercise5_16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner x = new Scanner(System.in);
		System.out.println("M1:");
		int m = x.nextInt();
		System.out.println("D1:");
		int d = x.nextInt();
		System.out.println("M2:");
		int mm = x.nextInt();
		System.out.println("D2:");
		int dd = x.nextInt();
		int n = mm;
		int nn = dd;
		if(m>mm) {
			mm=m;
			m=n;
			dd=d;
			d=nn;
		}
		if(m<mm && d<dd) {
			System.out.println("over a month apart!");
		}else {
			System.out.println("less than a month apart");
		}
		
	}

}
