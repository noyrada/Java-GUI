package TextFields;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;

public class TextFieldEvent extends Frame implements ActionListener, TextListener {
    TextArea ta;
    TextField tf;
    TextFieldEvent()
    {
        super("My TextField Events");
        setLayout(new FlowLayout());
        setSize(400,200);

        tf = new TextField(20);
        tf.addActionListener(this);
        tf.addTextListener(this);
        add(tf);
        ta = new TextArea(10,20);
        add(ta);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae)
    {
        ta.append("ActionEvent:"+ ae.getActionCommand()+ "\n");
        tf.setText("");
    }
    public void textValueChanged(TextEvent te)
    {
        ta.append("TextEvent:"+ tf.getText()+"\n");
    }
    public static void main(String[] args)
    {
        new TextFieldEvent();
    }
}
