import java.util.*;
public class Exercise5_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		Scanner x = new Scanner(System.in);
		System.out.println("Input a #: ");
		int a = x.nextInt();
		System.out.println("Input a #: ");
		int b = x.nextInt();
		System.out.println("Input a #: ");
		int c = x.nextInt();
		if(a==b && b==c) {
			System.out.println("1 unique integer");
		}else if(a==b || b==c || a==c) {
			System.out.println("2 unique integers");
		}else {
			System.out.println("3 unique integers");
		}
	}

}
