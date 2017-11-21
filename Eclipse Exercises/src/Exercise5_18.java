import java.util.*;
public class Exercise5_18 {
	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		System.out.print("input for digit swap: ");
		int num = x.nextInt();
		int length = (int)(Math.log10(num)+1);
		if(length % 2 == 0) {
			int second = 0;
			int count = 1;
			int total = 0;
			for(int i=0; i<=length-1; i++) {
				int y=(int)((num % (Math.pow(10,length-i)))-(num % (Math.pow(10,length-i-1))));
				y=(int)(y/(Math.pow(10,length-i-1)));
	
				if(count==1) {
					count++;
					second=y;
				}else{
					count=1;
				}
				
				if(count==1) {
					total=total+(int)(y*(Math.pow(10,length-i))+second*(Math.pow(10,length-i-1)));
				}
			}
			System.out.println(total);
		}else {
			int second = 0;
			int count = 1;
			int total = 0;
			int z=(int)((num % (Math.pow(10,length)))-(num % (Math.pow(10,length-1))));
			z=(int)(z/(Math.pow(10,length-1)));
			System.out.print(z);
			for(int i=1; i<=length-1; i++) {
				int y=(int)((num % (Math.pow(10,length-i)))-(num % (Math.pow(10,length-i-1))));
				y=(int)(y/(Math.pow(10,length-i-1)));
	
				if(count==1) {
					count++;
					second=y;
				}else{
					count=1;
				}
				
				if(count==1) {
					total=total+(int)(y*(Math.pow(10,length-i))+second*(Math.pow(10,length-i-1)));
				}
			}
			System.out.println(total);
		}
		x.close();
	}
}