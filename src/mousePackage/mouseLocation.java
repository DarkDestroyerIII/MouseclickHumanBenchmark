package mousePackage;
import java.awt.MouseInfo;
import java.awt.Color;
import java.awt.Point;
import java.awt.Robot;

public class mouseLocation {
	int x;
	int y;
	
		
	public Point Mouse()
	{
		System.out.println("Mouse method!");
		
		Point p = MouseInfo.getPointerInfo().getLocation();
		x = p.x;
		y = p.y;
		//System.out.println(x + "," + y);
		return p;
			
		
	}
	//ssssPoint p = MouseInfo.getPointerInfo().getLocation();
		
		
		//x = p.x;
		//y = p.y;
		

}
