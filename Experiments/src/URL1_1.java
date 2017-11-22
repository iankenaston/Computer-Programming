import java.io.IOException;
import java.net.URL;
import java.util.Scanner;
 
 
public class URL1_1{
    // Read from a URL and return the content in a String
    public static void main(String[] args) throws IOException {
        URL url = new URL("http://www.stayplump.men");
        Scanner scan = new Scanner(url.openStream());
		int line = 1;
		while (scan.hasNext())
		{
		    String str = scan.nextLine();
		    System.out.println( (line++) + ": " + str);
		}
		scan.close();
	}
}
