//(c) A+ Computer Science
// www.apluscompsci.com

//graphics example for rectangles

import java.awt.Graphics;
import java.awt.Color;
import java.awt.Canvas;

public class Rectangles extends Canvas // A canvas should naturally go into a JFrame
{
	public Rectangles()
	{
		setBackground(Color.WHITE); // plane white background
		// To see all colors use Color. and check the IntelliJ selection
	}

	public void paint( Graphics window ) // this is similar to a main // window is thought of as the paintbrush
	{
		window.setColor(Color.BLACK); // this sets the color of the window // once the color is set, it does not have to be set again until the color needs to be changed
		window.drawString("Squares - Rectangles", 100, 50); // drawString writes words based on coordinates

		window.setColor(Color.BLUE);
		//fillRect(int x1, int y1, int width, int height)
		window.fillRect(100, 100, 100, 20 ); // fill is solid
		
		window.setColor(Color.GRAY);
		window.drawRect(100,150,50,40); // draw gives an outline
		
		window.setColor(Color.RED);
		window.fillRect(100,200,40,40);
		
		window.setColor(Color.BLUE);
		window.drawRect(100,250,20,40);
		
		window.setColor(Color.ORANGE);
		window.fillRect(100,300,90,20);

		// whatever is drawn last will be on top
	}
}