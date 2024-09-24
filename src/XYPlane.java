import java.awt.*;
import java.util.Scanner;

public class XYPlane extends Canvas {
    public XYPlane() {
        setBackground(Color.BLACK);
    }

    public void paint(Graphics window) {
        window.setColor(Color.WHITE);
        window.fillRect(650, 25, 50, 50);
        window.drawRect(655, 20, 50, 50);
        window.setColor(Color.BLACK);
        window.fillRect(655, 30, 10, 40);
        window.fillRect(655, 60, 40, 10);

        window.setColor(Color.WHITE);

        int[] yAxisPoints = {100, 700};
        int[] xyAxisPoints = {100, 100};
        int nPointsForYAxis = 2;
        Polygon yAxis = new Polygon(xyAxisPoints, yAxisPoints, nPointsForYAxis);
        int[] xAxisPoints = {100, 700};
        int[] yxAxisPoints = {700, 700};
        int nPointsForXAxis = 2;
        Polygon xAxis = new Polygon(xAxisPoints, yxAxisPoints, nPointsForXAxis);
        window.drawString("1", 80, 405);
        int nPointsForMark = 2;
        int[] xMark1 = {90, 110};
        int[] yMark1 = {400, 400};
        Polygon mark1 = new Polygon(xMark1, yMark1, nPointsForMark);
        window.drawString("2", 80, 105);
        int[] xMark2 = {90, 110};
        int[] yMark2 = {100, 100};
        Polygon mark2 = new Polygon(xMark2, yMark2, nPointsForMark);

        window.drawPolygon(yAxis);
        window.drawPolygon(xAxis);
        window.drawPolygon(mark1);
        window.drawPolygon(mark2);

        Scanner lineInput = new Scanner(System.in);
            System.out.print("Slope of line: ");
            double slope = lineInput.nextDouble();
            System.out.print("Y-Intercept of line: ");
            double yint = lineInput.nextDouble();
        lineInput.close();

        int[] yIntPoint = {(int)(-1 * yint * 300 + 700), ((int)(-1 * slope * 600 + (-1 * yint * 300 + 700)))};
        int[] xForYInt = {100, 700};
        int nPointsForYint = 2;
        Polygon line = new Polygon(xForYInt, yIntPoint, nPointsForYint);
        window.drawPolygon(line);
    }
}
