import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Base extends JFrame implements ActionListener {
    JLabel l,l1, l2;
    ImageIcon qs;
    JButton enroll, know_us, exit;

    Base() {
        this.setSize(350, 400);
        this.setLayout(new FlowLayout());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("QuikSort");
        this.getContentPane().setBackground(new Color(196,0,255));
        this.setResizable(false);
        qs = new ImageIcon("lib/QuikSort.png");
        this.setIconImage(qs.getImage());

        l1 = new JLabel("Welcome to QuikSort");
        l1.setFont(new Font("Cambria", 3,20));
        l1.setHorizontalAlignment(SwingConstants.CENTER);
        l1.setForeground(Color.decode("#0CECDD"));
        l1.setPreferredSize(new Dimension(350,40));

        l2 = new JLabel();
        l2.setIcon(qs);
        l2.setPreferredSize(new Dimension(350,230));

        enroll = new JButton("Enroll");
        enroll.setFocusable(false);
        enroll.setPreferredSize(new Dimension(150,30));
        enroll.setBackground(new Color(255,103,231));
        enroll.setForeground(new Color(255,243,56));
        enroll.addActionListener(this);

        know_us = new JButton("Know Us");
        know_us.setFocusable(false);
        know_us.setPreferredSize(new Dimension(150,30));
        know_us.setBackground(new Color(255,103,231));
        know_us.setForeground(new Color(255,243,56));
        know_us.addActionListener(this);

        exit = new JButton("Exit");
        exit.setFocusable(false);
        exit.setPreferredSize(new Dimension(200,30));
        exit.setForeground(new Color(255,243,56));
        exit.setBackground(new Color(255,103,231));
        exit.addActionListener(this);

        this.add(l1);
        this.add(l2);
        this.add(enroll);
        this.add(know_us);
        this.add(exit);
        this.setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == enroll){
            new enroll();
            this.dispose();
        }
        if(e.getSource() == know_us){
            new knw();
            this.dispose();
        }
        if(e.getSource() == exit){
            this.dispose();
            JOptionPane.showMessageDialog(null,"Made By Kaif","Creator",1);
        }
    }


    public static void main(String[] args) {
        new Base();
    }
}