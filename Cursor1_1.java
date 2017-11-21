import java.awt.AWTException;
import java.awt.Robot;
public class Cursor1_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			Robot r = new Robot();
			r.mouseMove(500,500);
		}catch(AWTException e) {}
	}
}
