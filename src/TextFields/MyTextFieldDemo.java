package TextFields;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyTextFieldDemo extends Frame implements ActionListener {
    TextField name,pass;
    Label namep,passp;
    MyTextFieldDemo()
    {
        super("My TextField Demo");
        setLayout(new FlowLayout());
        setSize(480,150);

        namep = new Label("Name:",Label.RIGHT);
        passp = new Label("Password:",Label.RIGHT);

        name = new TextField("Type your name here",20);
        pass = new TextField("Type your password here",12);
        pass.setEchoChar('*');
        add(namep);
        add(passp);
        add(name);
        add(pass);

        //Register to receive action events
        name.addActionListener(this);
        pass.addActionListener(this);
        setVisible(true);
    }
    //User Pressed Enter.
    public void actionPerformed(ActionEvent event)
    {
        repaint();
    }
    //Display data
    public void paint(Graphics g)
    {
        g.drawString("Name:"+name.getText(),6,90);
        g.drawString("Selected text in name:"+name.getSelectedText(),6,110);
        g.drawString("Password:"+pass.getText(),6,130);
    }

    public static void main(String[] args)
    {
        new MyTextFieldDemo();
    }
}
