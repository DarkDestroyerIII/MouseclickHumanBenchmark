package mousePackage;
import java.awt.Robot;
import java.awt.AWTException;
import java.awt.Color;
import java.awt.Point;


public  class locationColor {

	public Color  color(Point mousePoint) 
	{	
			Robot robot = null;
			try {
				robot = new Robot();
			} catch (AWTException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			 Color color = robot.getPixelColor(mousePoint.x, mousePoint.y);
			 /*System.out.println("Color is: " + color.getRed() + " " +
					 color.getGreen() + " " +
					 color.getBlue());*/
			 return color;
			
		
			
			
			
		
	
 }
}
