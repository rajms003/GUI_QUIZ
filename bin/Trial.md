import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Start extends JFrame implements ActionListener{
    JButton next, submit;

    Start()
    {
        setBounds(500, 200, 1000, 660);
        
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        
        setLayout(new BorderLayout());
        setContentPane(new JLabel(new ImageIcon("images/image.jpg")));


        JLabel l1 = new JLabel("1.");
        l1.setBounds(280, 170, 40, 30);
        l1.setForeground(Color.WHITE);
        
        Font boldFont = new Font("Arista", Font.BOLD, 20);        
        l1.setFont(boldFont);

        add(l1);


        JLabel l2 = new JLabel("Which of the following is not a Java feature?");
        l2.setBounds(300, 170, 500, 30);
        l2.setForeground(Color.WHITE);
        
        Font bold = new Font("Arista", Font.BOLD, 20);        
        l2.setFont(bold);

        add(l2);


        JRadioButton jr1 = new JRadioButton("Dynamic");
        jr1.setBounds(300, 220, 200, 30);
        jr1.setForeground(Color.WHITE);
        jr1.setOpaque(false);
        jr1.setFont(bold);

        add(jr1);

        JRadioButton jr2 = new JRadioButton("Architecture Neutral");
        jr2.setBounds(300, 260, 300, 30);
        jr2.setForeground(Color.WHITE);
        jr2.setOpaque(false);
        jr2.setFont(bold);

        add(jr2);

        JRadioButton jr3 = new JRadioButton("Use of pointer");
        jr3.setBounds(300, 300, 200, 30);
        jr3.setForeground(Color.WHITE);
        jr3.setOpaque(false);
        jr3.setFont(bold);

        add(jr3);

        JRadioButton jr4 = new JRadioButton("Object-Oriented");
        jr4.setBounds(300, 340, 200, 30);
        jr4.setForeground(Color.WHITE);
        jr4.setOpaque(false);
        jr4.setFont(bold);

        add(jr4);


        ButtonGroup bg = new ButtonGroup();
        bg.add(jr1);
        bg.add(jr2);
        bg.add(jr3);
        bg.add(jr4);

        next = new JButton("Next");
        next.setBounds(390, 450, 110, 30);
        add(next);

        submit = new JButton("Submit");
        submit.setBounds(565, 450, 110, 30);
        add(submit);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        
    }

    public static void main(String[] args){
        new Start().setVisible(true);;
    }
    
}
