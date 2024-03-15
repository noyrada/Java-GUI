import javax.swing.*;

public class MainScreen extends JFrame{
    public  static void main(String[] args){
//        JFrame jFrame = new JFrame("First Gui");
//        jFrame.setBounds(200,200,500,400);
//        jFrame.setLayout(null);
//        jFrame.setVisible(true);
        new MainScreen();
    }
    //JFrame:
    public MainScreen(){
        super("First GUI");
        setBounds(300,250,400,500);
        setLayout(null);
        setVisible(true);
    }

}

