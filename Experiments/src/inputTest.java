
import java.util.*;
public class inputTest {
	public static void main(String[] args) {
		Scanner console = new Scanner (System.in);
		System.out.print("BASS ACKWARDS! Type Here: " );
		String input = console.nextLine();
		for(int i=1; i<=input.length(); i++) {
			System.out.print(input.charAt(input.length()-i));
		}
	}
}