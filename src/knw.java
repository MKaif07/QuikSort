import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class knw extends JFrame implements ActionListener{

    JPanel p1,p2;
    JLabel l,l1,l2;
    JButton next,prev,Done;
    List<String> Team;
    ImageIcon i;
    int c1=0, c2=1;
    knw(){

        Team=new ArrayList<String>();
        Team.add("Yuvraj");Team.add("President");Team.add("lib/hello.gif");
        Team.add("Tanya");Team.add("Vice President");Team.add("lib/hey.png");
        Team.add("Reet");Team.add("Creative Head");Team.add("lib/cat.gif");
        Team.add("Pratiksha");Team.add("Technical Head");Team.add("lib/hey.png");
        Team.add("Anirvan");Team.add("Treasurer");Team.add("lib/pat.png");
        Team.add("Subodh Sir");Team.add("Convener");Team.add("lib/hello.gif");
        Team.add("Sheetal Ma'am");Team.add("Convener");Team.add("lib/cat.gif");

        this.setTitle("QuikSort Team");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(280,440);
        this.setResizable(false);
        this.setLayout(new FlowLayout());
        ImageIcon qs = new ImageIcon("lib/QuikSort.png");
        this.setIconImage(qs.getImage());
        this.getContentPane().setBackground(Color.decode("#FFE459"));

        p1 = new JPanel();
        p1.setBackground(Color.decode("#F43B86"));
        p1.setPreferredSize(new Dimension(250,390));

        ImageIcon i1 = new ImageIcon("lib/hello.gif");
        l = new JLabel();
        l.setIcon(i1);
        l.setAlignmentX(CENTER_ALIGNMENT);
        l1 = new JLabel("Yuvraj");
        l1.setPreferredSize(new Dimension(175,30));
        l1.setFont(new Font("Calibri",Font.BOLD,20));
        l1.setForeground(Color.decode("#3D087B"));
        l1.setAlignmentX(0);

        l2 = new JLabel("President");
        l2.setPreferredSize(new Dimension(175,30));
        l2.setFont(new Font("Calibri",Font.BOLD,20));
        l2.setForeground(Color.decode("#3D087B"));
        l2.setAlignmentX(CENTER_ALIGNMENT);

        next = new JButton("Next >");
        next.setFocusable(false);
        next.setAlignmentX(RIGHT_ALIGNMENT);
        next.setPreferredSize(new Dimension(90,30));
        next.setBackground(Color.decode("#3D087B"));
        next.setForeground(Color.decode("#FFF338"));
        next.addActionListener(this);

        prev = new JButton("< Prev");
        prev.setFocusable(false);
        prev.setAlignmentX(LEFT_ALIGNMENT);
        prev.setPreferredSize(new Dimension(90,30));
        prev.setBackground(Color.decode("#3D087B"));
        prev.setForeground(Color.decode("#FFF338"));
        prev.addActionListener(this);

        Done = new JButton("DONE");
        Done.setBackground(Color.decode("#3D087B"));
        Done.setForeground(Color.decode("#FFF338"));
        Done.setFocusable(false);
        Done.addActionListener(this);

        p1.add(l);
        p1.add(l1);
        p1.add(l2);
        p1.add(prev);
        p1.add(next);
        p1.add(Done);
        this.add(p1);



        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==next){
            if(c2+1==Team.size()-1){
                l1.setText(Team.get(0));
                l2.setText(Team.get(1));
                c1=0;
                c2=1;
                i = new ImageIcon(Team.get(c2+1));
                l.setIcon(i);
            }else {
                c1 += 3; c2 += 3;
                i = new ImageIcon(Team.get(c2+1));
                l.setIcon(i);
                l1.setText(Team.get(c1));
                l2.setText(Team.get(c2));
            }

        }
        if(e.getSource()==prev){
            if(c1==0){
                c1=Team.size()-3;
                c2=Team.size()-2;
                l1.setText(Team.get(c1));
                l2.setText(Team.get(c2));
                i = new ImageIcon(Team.get(c2+1));
                l.setIcon(i);
            }else {
                c1 -= 3;
                c2 -= 3;
                i = new ImageIcon(Team.get(c2+1));
                l.setIcon(i);
                l1.setText(Team.get(c1));
                l2.setText(Team.get(c2));
            }
        }
        if(e.getSource()==Done){
            new Base();
            this.dispose();
        }
    }
}
