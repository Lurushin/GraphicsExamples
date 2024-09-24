import javax.swing.*;

public class XYPlaneGenerator extends JFrame {

    private static final int WIDTH = 800; // these lines define the dimensions of our graphics display
    private static final int HEIGHT = 800;

    public XYPlaneGenerator() {
        super("XY Plane Generator");

        setSize(WIDTH, HEIGHT);

        getContentPane().add(new XYPlane());

        setVisible(true);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main( String args[] ) {
        XYPlaneGenerator run = new XYPlaneGenerator();
    }
}
