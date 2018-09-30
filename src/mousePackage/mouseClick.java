package mousePackage;
import java.awt.AWTException;
import java.awt.Color;
import java.awt.Robot;
import java.awt.event.InputEvent;
public class mouseClick {
	
	public Color clickMeNowColor = new Color(30, 231, 90);
	
	public boolean click(Color pointColor){
		
		Robot robot = null;
		
		try {
			robot = new Robot();
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if (pointColor.equals(clickMeNowColor))
		{
			//CLICK!
			System.out.print("click");
			int mask = InputEvent.BUTTON1_DOWN_MASK;
			robot.mousePress(mask);
			robot.mouseRelease(mask);
			return true;
		}
		
		return false;
		
	}

}
