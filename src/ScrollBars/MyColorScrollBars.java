package ScrollBars;
import java.awt.*;
import java.awt.event.*;

class MyColorScrollBars extends Frame implements AdjustmentListener {
    Scrollbar rsb, gsb, bsb;
    Canvas canvas;

    MyColorScrollBars() {
        super("My Color Scrollbars");
        setLayout(new FlowLayout());
        setSize(400, 200);

        Label rl = new Label("Red", Label.RIGHT);
        add(rl);
        rsb = new Scrollbar(Scrollbar.HORIZONTAL, 255, 5, 0, 260);
        rsb.addAdjustmentListener(this);
        add(rsb);
        Label gl = new Label("Green", Label.RIGHT);
        add(gl);
        gsb = new Scrollbar(Scrollbar.HORIZONTAL, 0, 5, 0, 260);
        gsb.addAdjustmentListener(this);
        add(gsb);
        Label bl = new Label("Blue", Label.RIGHT);
        add(bl);
        bsb = new Scrollbar(Scrollbar.HORIZONTAL, 0, 5, 0, 260);
        bsb.addAdjustmentListener(this);
        add(bsb);
        canvas = new Canvas();
        canvas.setSize(30, 30);
        canvas.setBackground(new Color(255, 0, 0));
        add(canvas);
        addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent we){
                System.exit(0);
            }
        });
        setVisible(true);
    }
    public void adjustmentValueChanged(AdjustmentEvent ae){
        int r = rsb.getValue();
        int g = gsb.getValue();
        int b = bsb.getValue();
        Color color = new Color(r, g, b);
        canvas.setBackground(color);
        canvas.repaint();
        setTitle("R: " + r + ", G: " + g + ", B: " + b);
    }
    public static void main(String args[]){
        new MyColorScrollBars();
    }
}
