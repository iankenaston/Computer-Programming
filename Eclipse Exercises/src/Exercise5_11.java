import java.util.*;
public class Exercise5_11 {
	public static void main(String[] args) {
		int n = 0;
		Random r = new Random();
		while(n != 3) {
			int coin = r.nextInt(2);
			if(coin == 0) {
				System.out.print("H ");
				n++;
			}else {
				System.out.print("T ");
				n=0;
			}
		}
		System.out.println();
		System.out.println("Three heads in a row!");
	}

}
