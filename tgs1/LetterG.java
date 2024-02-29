import java.awt.*;
import java.awt.geom.*;

public class LetterG extends Frame {

    public LetterG() {
        addWindowListener(new MyFinishWindow());
    }

    public void paint(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        BasicStroke bs = new BasicStroke(3.0f);
        g2d.setStroke(bs);

        int x1 = 100;
        int y1 = 100;

        int x2 = 100;
        int y2 = 400;

        int x3 = 250;
        int y3 = 400;

        int x4 = 250;
        int y4 = 250;

        int x5 = 100;
        int y5 = 250;

        int x6 = 100;
        int y6 = 100;

        int x7 = 250;
        int y7 = 100;


        // Define and draw the letter "G" using lines and curves
        g2d.drawLine(x1, y1, x2, y2);
        g2d.drawLine(x2, y2, x3, y3);
        g2d.drawLine(x3, y3, x4, y4);
        g2d.drawLine(x4, y4, x5, y5);
        g2d.drawLine(x5, y5, x6, y6);
        g2d.drawLine(x6, y6, x7, y7);

        // Draw the control points
        drawSmallRect(x1, y1, g2d);
        drawSmallRect(x2, y2, g2d);
        drawSmallRect(x3, y3, g2d);
        drawSmallRect(x4, y4, g2d);
        drawSmallRect(x5, y5, g2d);
        drawSmallRect(x6, y6, g2d);
        drawSmallRect(x7, y7, g2d);

        // Label the control points
        g2d.setFont(new Font("serif", Font.PLAIN, 14));
        g2d.drawString("P1", x1 - 20, y1 - 10);
        g2d.drawString("P2", x2 - 20, y2 + 20);
        g2d.drawString("P3", x3 - 10, y3 + 20);
        g2d.drawString("P4", x4 + 10, y4 + 20);
        g2d.drawString("P5", x5 - 10, y5 - 10);
        g2d.drawString("P6", x6 - 20, y6 + 20);
        g2d.drawString("P7", x7 + 10, y7 + 20);
    }

    public static void drawSmallRect(int x, int y, Graphics2D g2d) {
        Rectangle rect = new Rectangle(x - 4, y - 3, 8, 8);
        g2d.fill(rect);
    }

    public static void main(String[] argv) {
        LetterG f = new LetterG();
        f.setTitle("The letter G");
        f.setSize(500, 500);
        f.setVisible(true);
        f.setLocationRelativeTo(null);
}
}