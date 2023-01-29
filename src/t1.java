import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class t1 extends JFrame implements ActionListener{
    JButton next, submit;
    public static int tm=30;
    public static int cnt = 0;
    JLabel l1, l2;
    String q[][] = new String[10][5];
    String a[][] = new String[10][1];
    JRadioButton jr1, jr2, jr3, jr4;
    ButtonGroup bg;

    public t1(String name)
    {
        setBounds(500, 200, 1000, 660);
        
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        
        setLayout(new BorderLayout());
        setContentPane(new JLabel(new ImageIcon("images/image.jpg")));


        l1 = new JLabel("");
        l1.setBounds(260, 170, 40, 30);
        l1.setForeground(Color.WHITE);
        
        Font boldFont = new Font("Arista", Font.BOLD, 20);        
        l1.setFont(boldFont);

        add(l1);


        l2 = new JLabel("");
        l2.setBounds(280, 170, 570, 30);
        l2.setForeground(Color.WHITE);
        
        Font bold = new Font("Arista", Font.BOLD, 20);        
        l2.setFont(bold);

        add(l2);

        q[0][0] = "Which is used to find and fix bugs in the Java programs?";
        q[0][1] = "JVM";
        q[0][2] = "JDB";
        q[0][3] = "JDK";
        q[0][4] = "JRE";

        q[1][0] = "What is the return type of the hashCode() method in the Object class?";
        q[1][1] = "int";
        q[1][2] = "Object";
        q[1][3] = "long";
        q[1][4] = "void";

        q[2][0] = "Which package contains the Random class?";
        q[2][1] = "java.util package";
        q[2][2] = "java.lang package";
        q[2][3] = "java.awt package";
        q[2][4] = "java.io package";

        q[3][0] = "An interface with no fields or methods is known as?";
        q[3][1] = "Runnable Interface";
        q[3][2] = "Abstract Interface";
        q[3][3] = "Marker Interface";
        q[3][4] = "CharSequence Interface";

        q[4][0] = "In which memory a String is stored, when we create a string using new operator?";
        q[4][1] = "Stack";
        q[4][2] = "String memory";
        q[4][3] = "Random storage space";
        q[4][4] = "Heap memory";

        q[5][0] = "Which of the following is a marker interface?";
        q[5][1] = "Runnable interface";
        q[5][2] = "Remote interface";
        q[5][3] = "Readable interface";
        q[5][4] = "Result interface";

        q[6][0] = "Which keyword is used for accessing the features of a package?";
        q[6][1] = "import";
        q[6][2] = "package";
        q[6][3] = "extends";
        q[6][4] = "export";

        q[7][0] = "In java, jar stands for?";
        q[7][1] = "Java Archive Runner";
        q[7][2] = "Java Archive";
        q[7][3] = "Java Application Resource";
        q[7][4] = "Java Application Runner";

        q[8][0] = "Which of the following is a mutable class in java?";
        q[8][1] = "java.lang.StringBuilder";
        q[8][2] = "java.lang.Short";
        q[8][3] = "java.lang.Byte";
        q[8][4] = "java.lang.String";

        q[9][0] = "Which of the following option leads to the portability and security of Java?";
        q[9][1] = "Bytecode is executed by JVM";
        q[9][2] = "The applet makes the Java code secure and portable";
        q[9][3] = "Use of exception handling";
        q[9][4] = "Dynamic binding between objects";

        jr1 = new JRadioButton("");
        jr1.setBounds(300, 220, 200, 30);
        jr1.setForeground(Color.WHITE);
        jr1.setOpaque(false);
        jr1.setFont(bold);

        add(jr1);

        jr2 = new JRadioButton("");
        jr2.setBounds(300, 260, 300, 30);
        jr2.setForeground(Color.WHITE);
        jr2.setOpaque(false);
        jr2.setFont(bold);

        add(jr2);

        jr3 = new JRadioButton("");
        jr3.setBounds(300, 300, 200, 30);
        jr3.setForeground(Color.WHITE);
        jr3.setOpaque(false);
        jr3.setFont(bold);

        add(jr3);

        jr4 = new JRadioButton("");
        jr4.setBounds(300, 340, 200, 30);
        jr4.setForeground(Color.WHITE);
        jr4.setOpaque(false);
        jr4.setFont(bold);

        add(jr4);


        bg = new ButtonGroup();
        bg.add(jr1);
        bg.add(jr2);
        bg.add(jr3);
        bg.add(jr4);

        next = new JButton("Next");
        next.setBounds(390, 450, 110, 30);
        next.addActionListener(this);
        add(next);

        submit = new JButton("Submit");
        submit.setEnabled(false);
        submit.setBounds(565, 450, 110, 30);
        next.addActionListener(this);
        add(submit);

        run(0);
    }
    

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == next){
            repaint();
            if(bg.getSelection() == null)
            {
                a[cnt][0] = "";  //Storing empty string
            }
            else
            {
                a[cnt][0] = bg.getSelection().getActionCommand();
            }
            cnt++;
            run(cnt);
        
        }
        else if(e.getSource() == submit){

        }

        
    }

    


    public void paint(Graphics g)
    {
        super.paint(g);
        String timer = "Time Remaining : " + tm;
        g.setColor(Color.RED);
        Font boldFont = new Font("Arista", Font.BOLD, 20); 
        g.setFont(boldFont);

        if(tm>0)
        {
            g.drawString(timer, 650, 180);
        }
        else
        {
            g.drawString("Times Up..!!", 680, 180);
        }

        tm--;

        try{
            Thread.sleep(1000);
            repaint();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }

    public void run(int cnt){
        l1.setText("" + (cnt+1) + ". ");
        l2.setText(q[cnt][0]);
        jr1.setText(q[cnt][1]);
        jr1.setActionCommand(q[cnt][1]);  //setting value

        
        jr2.setText(q[cnt][2]);
        jr2.setActionCommand(q[cnt][2]);

        jr3.setText(q[cnt][3]);
        jr3.setActionCommand(q[cnt][3]);

        jr4.setText(q[cnt][4]);
        jr4.setActionCommand(q[cnt][4]);

        bg.clearSelection();

    }
    
    public static void main(String[] args){
        new Start().setVisible(true);
    }
    
}
