package Lists;

import java.awt.*;
import java.awt.event.*;

public class MylistDemo extends Frame implements ActionListener {
    List os,browser;
    String msg = "";
    MylistDemo()
    {
        super("My List Demo");
        setLayout(new FlowLayout());
        setSize(500,380);

        os = new List(4,true);
        browser = new List(4,false);

        //add items to os list
        os.add("Window 11");
        os.add("Window NT");
        os.add("Solaris");
        os.add("MacOS");

        //add items to browser list
        browser.add("Netscape 1.1");
        browser.add("Netscape 2.x");
        browser.add("Netscape 3.x");
        browser.add("Netscape 4.x");

        browser.add("Internet Explorer 2.0");
        browser.add("Internet Explorer 3.0");
        browser.add("Internet Explorer 4.0");
        browser.add("Lynx 2.4");
        browser.select(1);

        //add lists to window
        add(os);
        add(browser);

        //register to receive action events
        os.addActionListener(this);
        browser.addActionListener(this);
        setVisible(true);

    }
    public void actionPerformed(ActionEvent event)
    {
        repaint();
    }
    //Display current selections.
    public void paint(Graphics g)
    {
        int idx[];
        msg = "Current OS";
        idx =os.getSelectedIndexes();
        for (int i=0; i<idx.length;i++)
            msg += os.getItem(idx[i]) + " ";
        g.drawString(msg,26,160);
        msg = "Current Browser";
        msg+= browser.getSelectedItem();
        g.drawString(msg,26,200);
    }
    public static void main(String[] args)
    {
        new MylistDemo();
    }
}
