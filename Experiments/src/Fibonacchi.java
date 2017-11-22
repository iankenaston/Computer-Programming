
public class Fibonacchi {

	public static void main(String[] args) {
		increment(100);
	}
	public static void increment(double c) {
		double a=1;
		double b=0;
		double d=1;
		for(double i=0; i<=c; i++) {
			d=a;
			a=a+b;
			b=d;
			System.out.print(a+" ");
		}
	}
}
