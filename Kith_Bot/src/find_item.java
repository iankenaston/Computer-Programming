import java.awt.AWTException;
import java.awt.Robot;
import java.io.IOException;
import java.net.URL;
import java.util.Scanner;

public class find_item {
//looks for a certain item and size on the KITH web site
	public static void main(String[] args) throws IOException {
		// get the item to search for on kithnyc.com
		Scanner console = new Scanner(System.in);
		System.out.println("Input an item to find: ");
		String item = console.nextLine();
		
		//get the HTML to check sizes and stuff
		URL url = new URL("https://kith.com/");
        Scanner scan = new Scanner(url.openStream());
		String HTML = "";
		String str = "";
		while (scan.hasNext()) {
		    str = scan.nextLine();
		    HTML = HTML + str;
		}
		scan.close();
		
		//make substring for efficiency
		String HTMLshort = HTML.substring(HTML.indexOf("js-product-card\">"));
		
		//find how many products are listed
		int productCount = 0;
		Scanner scanner = new Scanner(HTMLshort);
		while (scanner.hasNextLine()) {
		    String nextToken = scanner.next();
		    if (nextToken.equalsIgnoreCase("js-product-card\">")) {
		    		productCount++;
		    }
		}
		System.out.println(productCount);
		
	}

}
