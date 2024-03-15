package Lists;

import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class CursorLists extends Frame implements Runnable, ItemListener {

    List l = new List();
    String[] cursors = {
            "DEFAULT_CURSOR",
            "CROSS-HAIR_CURSOR",
            "TEXT_CURSOR",
            "WAIT_CURSOR",
            "SW_RESIZE_CURSOR",
            "SE_RESIZE_CURSOR",
            "NW_RESIZE_CURSOR",
            "NE_RESIZE_CURSOR",
            "N_RESIZE_CURSOR",
            "S_RESIZE_CURSOR",
            "W_RESIZE_CURSOR",
            "E_RESIZE_CURSOR",
            "HAND_CURSOR",
            "MOVE_CURSOR",};
    CursorLists()
    {
        super("SetCursor Example");
        for (int i=0;i<cursors.length;i++)
        {
            l.add(cursors[i]);
        }
        add(l,BorderLayout.CENTER);
        //add item listener to list
        l.addItemListener(this);
        (new Thread(this)).start();
        setBounds(100,100,250,200);
        setVisible(true);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we){
                System.exit(0);
            }
        });
    }
    public void itemStateChanged(ItemEvent event)
    {
        setCursor(Cursor.getPredefinedCursor(l.getSelectedIndex()));
    }
    public void run()
    {
        while (true){
            try{
                Cursor cursor = getCursor();
                setCursor(Cursor.getDefaultCursor());
                Thread.sleep(2000);
                setCursor(cursor);
                Thread.sleep(10000);
            }catch (Exception e){

            }
        }
    }


    public static void main(String[] args)
    {
        new CursorLists();
    }
}
