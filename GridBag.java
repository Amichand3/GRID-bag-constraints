import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.*;

public class GridBag{
    public static void main(String[] args) {
        JFrame frame = new JFrame("GRID BAG");

        frame.setSize(600,450);
       // frame.setLocation(100,100);
        frame.setLayout(null);

        JButton bt = new JButton("button1");
      //  bt.setBounds(20,20,100,20);

        JButton bt1 = new JButton("Button 2 ");
       // bt1.setBounds(20,60,100,20);
        JButton bt2 = new JButton("Button 3 ");
      //  bt2.setBounds(20,90,100,20);
      JButton bt3 = new   JButton("Button 4");
      JButton bt4 = new   JButton("Button 5");
      JButton bt5 = new   JButton("Button 6");
      JButton bt6 = new   JButton("Button 7");

      

        JPanel panel = new JPanel();
        panel.setSize(600,400);
        panel.setBounds(50,50,400,500);
        panel.setBackground(Color.PINK);
        panel.setLayout(new GridBagLayout());
        frame.add(panel);
       

        GridBagConstraints gc = new GridBagConstraints();
        gc.gridx=0;
        gc.gridy=0;
        panel.add(bt,gc);
        gc.gridx=0;
        gc.gridy=2;
        panel.add(bt1,gc);
       gc.gridx=1;
        gc.gridy=1;
        panel.add(bt2,gc);
        gc.gridx=2;
        gc.gridy=0;
        panel.add(bt3,gc);
        gc.gridx=2;
        gc.gridy=2;
        panel.add(bt4,gc);

        gc.gridx=3;
        gc.gridy=0;
        panel.add(bt5,gc);
        gc.gridx=3;
        gc.gridy=2;
        panel.add(bt6,gc);

        

        frame.setVisible(true);












       

    }
}