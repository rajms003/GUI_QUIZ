import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class StartingPage extends JFrame implements ActionListener {
    JButton b1, b2;
    JTextField tf;

    StartingPage() {

        setBounds(500, 200, 813, 377);
        
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        
        setLayout(new BorderLayout());
        setContentPane(new JLabel(new ImageIcon("images/background1.jpeg")));
        
        JLabel l1 = new JLabel("Quiz with GUI");
        l1.setBounds(100, 40, 350, 60);
        l1.setForeground(new Color(255,196,0));
        
        Font boldFont = new Font("Arista", Font.BOLD, 50);        
        l1.setFont(boldFont);

        add(l1);
    

        JLabel l2 = new JLabel("Enter Your Name");
        l2.setBounds(169, 140, 200, 18);
        l2.setForeground(new Color(248, 255, 0));

        Font plainFont = new Font("Serif", Font.BOLD, 24);        //Serif
        l2.setFont(plainFont);

        add(l2);


        tf = new JTextField();
        tf.setBounds(150, 175, 215, 27);

        Font InputFont = new Font("Times New Roman", Font.BOLD, 20);
        tf.setFont(InputFont);
        add(tf);

        b1 = new JButton("Start");
        b1.setBounds(160, 214, 78, 25);
        b1.setBackground(Color.BLUE);
        b1.setForeground(Color.YELLOW);
        b1.addActionListener(this);
        add(b1);
        
        b2 = new JButton("Exit");
        b2.setBounds(270, 214, 78, 25);
        b2.setBackground(Color.BLUE);
        b2.setForeground(Color.YELLOW);
        b2.addActionListener(this);
        add(b2);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == b1){
            String name = tf.getText();
            this.setVisible(false);
            new Start(name);
        }else{
            System.exit(0);
        }
    }

    public static void main(String args[]) {
        new StartingPage();
    }

   
}