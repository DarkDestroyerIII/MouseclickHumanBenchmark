package mousePackage;
//Java program to get the pixel color of 
//given screen coordinates 
import java.awt.*; 
import javax.swing.*; 
import java.awt.event.*;
import java.io.Console; 
public class color extends JFrame 
implements ActionListener { 
// textfield to get x, y coordinates 
static JTextField x, y; 

// button 
static JButton b; 

// create a frame 
static JFrame f; 

// label 
static JLabel l; 

public static void main() 
{ 

    // create a frame 
    f = new JFrame("pixel Color"); 

    // label to show the RGB value 
    l = new JLabel("no value"); 

    // create the text field 
    x = new JTextField(16); 
    y = new JTextField(16); 

    // create a button 
    b = new JButton("find"); 

    // create an object of the class 
    color co = new color(); 

    // add ActionListener 
    b.addActionListener(co); 

    // create a panel 
    JPanel p = new JPanel(); 

    // add textfield and button to the panel 
    p.add(x); 
    p.add(y); 
    p.add(b); 
    p.add(l); 

    // add the panel 
    f.add(p); 

    // set the size of the frame 
    f.setSize(500, 500); 
    f.show(); 
} 

// if the button is pressed 
public void actionPerformed(ActionEvent e) 
{ 
	Color c = new Color(128,128,128, 1);
    String s = e.getActionCommand(); 
    if (s.equals("find")) { 
        int xp, yp; 
        
        System.out.println("X value is: " + x.getText() +
        		" Y value is: " + y.getText());
  

        // get user inputs of x and y position 
        xp = Integer.parseInt(x.getText()); 
        yp = Integer.parseInt(y.getText()); 

        // try and catch block to handle exceptions 
        try { 
            // create an object of robot class 
            Robot r = new Robot(); 

            // get the pixel color 
             c = r.getPixelColor(xp, yp); 
        } 
        catch (Exception evt) { 
            // print error message 
            System.err.println(evt.getMessage()); 
        } 

        

        // set the RGB value to the label 
        // and to its foreground 
        l.setForeground(c); 
        l.setText("Red = " + c.getRed() + ",  Green = " + c.getGreen() + ", Blue = " + c.getBlue()); 
    } 
} 


}
