import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class End extends JFrame implements ActionListener{
    
    End(String username, int score){
        //setBounds(450, 350, 700, 380);
        getContentPane().setBackground(Color.WHITE);
        
        setBounds(650, 400, 700, 380);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        
        setLayout(new BorderLayout());
        setContentPane(new JLabel(new ImageIcon("images/s1.jpg")));
        
        JLabel l2 = new JLabel("Congratulation..!!");
        l2.setBounds(300, 30, 440, 50);
        l2.setFont(new Font("Jokerman", Font.PLAIN, 41));
        add(l2);
        
        JLabel l3 = new JLabel(username + "Rajesh Your Score is ");
        l3.setBounds(370, 130, 300, 30);
        l3.setFont(new Font("Arista", Font.BOLD, 23));
        l3.setForeground(Color.BLACK);
        add(l3);
        
        JLabel l4 = new JLabel(score + "/100");
        l4.setBounds(450, 170, 300, 30);
        l4.setFont(new Font("Arista", Font.BOLD, 29));
        l4.setForeground(Color.GREEN);
        add(l4);

        JButton b1 = new JButton("Play Again");
        b1.setBackground(Color.RED);
        b1.setForeground(Color.WHITE);
        b1.addActionListener(this);
        
        b1.setBounds(410, 250, 140, 40);
        add(b1);
    }
    public void actionPerformed(ActionEvent ae){
        this.setVisible(false);
        new StartingPage().setVisible(true);
    }
    
    public static void main(String[] args){
        new End("", 0).setVisible(true);
    }
}