import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class enroll extends JFrame implements ActionListener {

    JPanel panel1;
    JLabel l1, l2, l3, l4 ;
    JTextField tf1, tf2, tf3, tf4;
    JButton Done, ret;
    enroll(){
        
        this.setIconImage(new ImageIcon("QuikSort.jpg").getImage());
        this.setTitle("Enrollment");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(300,260);
        this.setResizable(false);
        this.setLayout(new FlowLayout());
        ImageIcon qs = new ImageIcon("lib/QuikSort.png");
        this.setIconImage(qs.getImage());
        this.getContentPane().setBackground(Color.decode("#FFE459"));

        panel1 = new JPanel();
        panel1.setPreferredSize(new Dimension(300,175));
        panel1.setBackground(Color.decode("#FFE459"));
        l1 = new JLabel("Name: ");
        l1.setFont(new Font("Cambria", 3,16));
        l1.setForeground(Color.decode("#F43B86"));
        l1.setPreferredSize(new Dimension(100,40));

        tf1 = new JTextField();
        tf1.setFont(new Font("Cambria", 3,16));
        tf1.setBackground(Color.decode("#FFE459"));
        tf1.setForeground(Color.decode("#F43B86"));
        tf1.setPreferredSize(new Dimension(150,30));

        l2 = new JLabel("Roll No: ");
        l2.setFont(new Font("Cambria", 3,16));
        l2.setForeground(Color.decode("#F43B86"));
        l2.setPreferredSize(new Dimension(100,40));

        tf2 = new JTextField(null);
        tf2.setFont(new Font("Cambria", 3,16));
        tf2.setBackground(Color.decode("#FFE459"));
        tf2.setForeground(Color.decode("#F43B86"));
        tf2.setPreferredSize(new Dimension(150,30));

        l3 = new JLabel("Course: ");
        l3.setFont(new Font("Cambria", 3,16));
        l3.setForeground(Color.decode("#F43B86"));
        l3.setPreferredSize(new Dimension(100,40));

        tf3 = new JTextField(null);
        tf3.setFont(new Font("Cambria", 3,16));
        tf3.setBackground(Color.decode("#FFE459"));
        tf3.setForeground(Color.decode("#F43B86"));
        tf3.setPreferredSize(new Dimension(150,30));

        l4 = new JLabel("Department: ");
        l4.setFont(new Font("Cambria", 3,16));
        l4.setForeground(Color.decode("#F43B86"));
        l4.setPreferredSize(new Dimension(100,40));

        tf4 = new JTextField(null);
        tf4.setFont(new Font("Cambria", 3,16));
        tf4.setBackground(Color.decode("#FFE459"));
        tf4.setForeground(Color.decode("#F43B86"));
        tf4.setPreferredSize(new Dimension(150,30));

        Done = new JButton("DONE!!!");
        Done.addActionListener(this);
        Done.setBackground(Color.decode("#F43B86"));
        Done.setForeground(Color.decode("#3D087B"));
        Done.setFocusable(false);

        ret = new JButton("Return");
        ret.addActionListener(this);
        ret.setBackground(Color.decode("#F43B86"));
        ret.setForeground(Color.decode("#3D087B"));
        ret.setFocusable(false);

        panel1.add(l1);
        panel1.add(tf1);
        panel1.add(l2);
        panel1.add(tf2);
        panel1.add(l3);
        panel1.add(tf3);
        panel1.add(l4);
        panel1.add(tf4);
        this.add(panel1);
        this.add(Done);
        this.add(ret);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == Done){
            if(tf1.getText().isEmpty() && tf2.getText().isEmpty() && tf4.getText().isEmpty()){
                JOptionPane.showMessageDialog(null,"Form incomplete");
            }else {
                String temp = tf1.getText() + " " + tf2.getText() + " " + tf3.getText() + " " + tf4.getText();
                try {
                    FileWriter fw = new FileWriter("lib/Final.txt", true);
                    BufferedWriter br = new BufferedWriter(fw);
                    br.write(temp);
                    br.newLine();
                    br.close();
                    fw.close();
                    JOptionPane.showMessageDialog(null, "" + tf1.getText() + " Record added succesfully");
                } catch (IOException ex) {
                    System.out.println("Unexpected error occurred");
                    ex.printStackTrace();
                }
                this.dispose();
                new Base();
            }

        }

        if(e.getSource()==ret){
            new Base();
            this.dispose();
        }
    }
}
