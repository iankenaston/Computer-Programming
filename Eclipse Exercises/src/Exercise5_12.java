import java.util.Scanner;
public class Exercise5_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner x = new Scanner(System.in);
		int n = 0;
		int total = 0;
		double loops = 0;
		while(n>=0) {
			total = total + n;
			System.out.print("Type a number: ");
			n = x.nextInt();
			System.out.println();
			loops++;
		}
		System.out.println("Average is: "+(total/(loops - 1)));
	}

}
