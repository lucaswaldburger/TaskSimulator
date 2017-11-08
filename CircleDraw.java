package composition.data;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;

public class CircleDraw extends Frame {
    float height = 200;
    float width = 200;
    int start_x = 50;
    int start_y = 50;


    Shape square = new Rectangle2D.Double(start_x, start_y,width, height);
    Shape circle1 = new Ellipse2D.Float(start_x, start_y, width/2, height/2);
    Shape circle2 = new Ellipse2D.Float(start_x + width/2, start_y, width/2, height/2);
    Shape circle3 = new Ellipse2D.Float(start_x, start_y + height/2, width/2, height/2);
    Shape circle4 = new Ellipse2D.Float(start_x + width/2, start_y + height/2, width/2, height/2);
    public void paint(Graphics g) {
        Graphics2D ga = (Graphics2D)g;
        ga.setPaint(Color.green);
        ga.draw(circle1);
        ga.fill(circle1);
        ga.draw(circle2);
        ga.fill(circle2);
        ga.draw(circle3);
        ga.fill(circle3);
        ga.draw(circle4);
        ga.fill(circle4);

        ga.setPaint(Color.black);
        ga.draw(square);
    }
    public static void main(String args[]) {
        Frame frame = new CircleDraw();
        frame.addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent we){
                System.exit(0);
            }
        });
        frame.setSize(600, 600);
        frame.setVisible(true);
    }
}