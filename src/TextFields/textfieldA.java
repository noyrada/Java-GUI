package TextFields;

import java.awt.*;
import java.awt.event.*;

public class textfieldA extends Frame {
    TextField t1,t2;
    String name = "";
    Font font;
    textfieldA()
    {
        setLayout(new FlowLayout());
        setBounds(100,100,500,250);
        add(new Label("First Name:"));
        t1 = new TextField("Noy",12);
        add(t1);

        add(new Label("Last Name:"));
        t2 = new TextField("Rada",12);
        font = new Font("Monospaced",Font.PLAIN,24);
        t2.setFont(font);
        add(t2);


        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent event)
            {
                System.exit(0);
            }
        });
        t2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                name = t2.getText() + " "+ t1.getText();
                repaint();
            }
        });
        setVisible(true);
    }
    public void paint(Graphics g)
    {
        g.setFont(font);
        g.drawString(name,200,130);
    }
    public static void main(String[] args)
    {
        new textfieldA();
    }
}
