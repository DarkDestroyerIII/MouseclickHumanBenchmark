package mousePackage;
import java.awt.Robot;
import java.util.Random;
import java.awt.Color;
import java.awt.MouseInfo;
import java.awt.Point;
public class MouseMover {
	
	public static final int FIVE_SECONDS = 5000;
	 public static final int MAX_Y = 400;
	 public static final int MAX_X = 400;
	 
	


	public static void main(String[] args) throws Exception{
	
		//color markColor = new color();
		//color.main();
		//System.out.println("Main System");
		MouseMover mouseMover = new MouseMover();
		mouseLocation somename = new mouseLocation();
		locationColor locoColor = new locationColor();
		mouseClick aName = new mouseClick();
		while(true)
		{
			Point someNamePoint = somename.Mouse();
			Color locoColorResult = locoColor.color(someNamePoint);
			aName.click(locoColorResult);
			
		}
		
		
	 
		/* Robot robot = new Robot();
		 Random random = new Random();
		  while (true) {
			  robot.mouseMove(random.nextInt(MAX_X), random.nextInt(MAX_Y));
		      Thread.sleep(FIVE_SECONDS);
		        }*/
		    }
		

	}


