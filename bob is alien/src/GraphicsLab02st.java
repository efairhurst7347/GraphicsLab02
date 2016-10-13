// GraphicsLab02st.java
// This is the student, starting version of the GraphicsLab02 assignment.


import java.awt.*;
import java.applet.*;


public class GraphicsLab02st extends Applet
{
	public void paint(Graphics g)
	{
		int width = 980;
		int height = 630;
		int x1 = 10;
		int y1 = 640;
		int x2 = 990;
		int y2 = 640;
		g.drawRect(10,10,width,height);	
		
		for (x1 = 10; x1 < 990; x1 += 14) {
			
		g.drawLine(x1, y1, x2, y2);	
		
		y2 -= 9;
		
		}
		
		x1 = 10;
		y1 = 640;
		x2 = 990;
		y2 = 640;
		
		for(y1 = 640; y1 >= 10; y1 -= 9) {
			
			g.drawLine(x1, y1, x2, y2);
			
			x2 -= 14;
			
			}
		
		x1 = 10;
		y1 = 10;
		x2 = 990;
		y2 = 10;
		
		for(y2 = 10; y2 <= 640; y2 += 9) {
			g.drawLine(x1, y1, x2, y2);
			
		x1 += 14;
		}
		x1 = 990;
		y1 = 10;
		x2 = 10;
		y2 = 10;
		
		for(y2 = 10; y2<= 640; y2 += 9) {
			g.drawLine(x1, y1, x2, y2);
			x1 -= 14;
			}
		
		g.drawRect(250, 170, 500, 310);
		
		x1 = 250;
		y1 = 170;
		x2 = 750;
		y2 = 170;
		
		for(y2 = 170; y2 <= 480; y2 += 5) {
			g.drawLine(x1, y1, x2, y2);
			
			x1 += 8;
		}
		x1 = 750;
		y1 = 170;
		x2 = 250;
		y2 = 170;
		
		for(y2 = 170; y2 <= 480; y2 += 5) {
			g.drawLine(x1, y1, x2, y2);
			
			x1 -= 8;
			
		}
		x1 = 750;
		y1 = 480;
		x2 = 250;
		y2 = 480;
		
		for(y2 = 480; y2 >= 170; y2 -= 5) {
			g.drawLine(x1, y1, x2, y2);
			x1 -= 8;
		}
		x1 = 250;
		y1 = 480;
		x2 = 750;
		y2 = 480;
		
		for(y2 = 480; y2 >= 170; y2 -= 5) {
			g.drawLine(x1, y1, x2, y2);
			x1 += 8;
		}
	}
}
		
		
		
		
		
		

