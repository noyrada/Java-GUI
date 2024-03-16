package TextAreas;

import java.awt.*;

public class MyTextAreaDemo extends Frame {
    //Demonstrate

    MyTextAreaDemo()
    {
        super("My First TextArea");
        setLayout(new FlowLayout());
        setSize(300,250);

        String val = "There are two ways of constructing " +
                "a software design.\n" +
                "One way is to make it so simple\n" +
                "that there are obviously no deficiencies.\n" +
                "And the other way is to make it so complicated\n" +
                "that there are no obvious deficiencies.\n\n" +
                "        -C.A.R. Hoare\n\n" +
                "There's an old story about the person who wished\n" +
                "his computer were as easy to use as his telephone.\n" +
                "That wish has come true,\n" +
                "since I no longer know how to use my telephone.\n\n" +
                "        -Bjarne Stroustrup, AT&T, (inventor of C++)";

        TextArea text = new TextArea(val,10,30,TextArea.SCROLLBARS_NONE);
        add(text);
        text.setEditable(false);
        setVisible(true);
    }

    public static void main(String[] args)
    {
        new MyTextAreaDemo();
    }
}
