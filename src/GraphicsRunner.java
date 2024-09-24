//(c) A+ Computer Science
// www.apluscompsci.com

//graphics frame to run graphics examples

import javax.swing.JFrame;

public class GraphicsRunner extends JFrame // JFrame creates the frame
{
	private static final int WIDTH = 800; // these lines define the dimensions of our graphics display
	private static final int HEIGHT = 600;

	public GraphicsRunner() // this is a constructor. It looks like a method but is named the same as the class.
	{
		super("Graphics Runner"); // this is the title of the pop up

		setSize(WIDTH,HEIGHT); // this method is a part of JFrame

		// Only put one image in a frame so that's why the rest of these are commented

		//getContentPane().add(new Circles());

		//getContentPane().add(new Rectangles()); // this method is a part of JFrame

		//getContentPane().add(new Lines());

		//getContentPane().add(new Polygons());

		//getContentPane().add(new Arcs());

		//getContentPane().add(new Colors());

		//getContentPane().add(new Fonts());

		getContentPane().add(new ImageOne());

		//getContentPane().add(new DoubleBuffer());

		//getContentPane().add(new Animation());

		//getContentPane().add(new Sounds());

		setVisible(true); // this is the only way we can see the graphic // this method is a part of JFrame

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // ensures that the pop up is gone after we click the x // this method is a part of JFrame
	}

	public static void main( String args[] ) // builds the new graphics runner
	{
		GraphicsRunner run = new GraphicsRunner();
	}
}