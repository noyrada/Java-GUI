package ScrollBars;

import java.awt.*;
import java.awt.event.*;

public class MySBDemo extends Frame implements AdjustmentListener, MouseMotionListener {
    String msg = "";
    Scrollbar vertSB, horSB;
    Dimension d;
    MySBDemo()
    {
        super("My ScrollBar Demo");
        // or setTitle("..");
        setLayout(new FlowLayout());
        setSize(400, 300);

        d = getSize();

//       int width = d.width;
//       int height = d.height;

        vertSB = new Scrollbar(Scrollbar.VERTICAL,0,1,0,d.height);
        horSB = new Scrollbar(Scrollbar.HORIZONTAL,0,1,0,d.width);
        add(vertSB);
        add(horSB);
        //register to receive adjustment events
        vertSB.addAdjustmentListener(this);
        horSB.addAdjustmentListener(this);
        addMouseMotionListener(this);
        setVisible(true);
    }
    public void adjustmentValueChanged(AdjustmentEvent ae)
    {
        repaint();
    }
    //Update scroll bars to reflect mouse dragging
    public void mouseDragged(MouseEvent me)
    {
        int x = me.getX();
        int y = me.getY();
        vertSB.setValue(y);
        horSB.setValue(x);
        repaint();
    }
    //Necessary for MouseMotionListener
    public void mouseMoved(MouseEvent me)
    {

    }
    //Display current value of scroll bars
    public void paint(Graphics g)
    {
        msg = "Vertical: " + vertSB.getValue();
        msg += ",  Horizontal: " + horSB.getValue();
        g.drawString(msg, 26, 160);

        //show current mouse drag position
        g.drawString("*",horSB.getValue(),vertSB.getValue());

    }
    public static void main(String[] args)
    {
        new MySBDemo();
    }
}
