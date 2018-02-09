import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Fun extends JFrame {
  public Fun(){
    setTitle("FUN");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setLocationRelativeTo(null);
    JPanel firstPanel = new JPanel();
    firstPanel.setLayout(new GridLayout(1, 2));
    JPanel secondPanel = new JPanel();
    secondPanel.setLayout(new GridLayout(1, 3));
    setLayout(new GridLayout(5, 1));
    JLabel q1 = new JLabel("Do you like fun?", JLabel.CENTER);
    JLabel q2 = new JLabel("When do you like to have fun?", JLabel.CENTER);
    ButtonGroup radio = new ButtonGroup();
    JRadioButton regular = new JRadioButton("Yes!", true);
    JRadioButton extra = new JRadioButton("A lot!!!", false);
    JButton result = new JButton("Let see what we get!");
    radio.add(regular);
    radio.add(extra);

    JCheckBox fri = new JCheckBox("Friday");
    JCheckBox sat = new JCheckBox("Saturday");
    JCheckBox sun = new JCheckBox("Sunday");

    add(q1);
    firstPanel.add(regular);
    firstPanel.add(extra);
    add(firstPanel);
    add(q2);
    secondPanel.add(fri);
    secondPanel.add(sat);
    secondPanel.add(sun);
    add(secondPanel);
    add(result);

    pack();
    setVisible(true);
    setSize(300,300);

    result.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent e){

        if (regular.isSelected()) {
          JOptionPane.showMessageDialog(new JFrame(), "Likes to have a little bit of fun on:\n" + getDays(fri, sat, sun));
        } else {
          JOptionPane.showMessageDialog(new JFrame(), "Likes to have TONS of fun on:\n" + getDays(fri, sat, sun));
        }

      }
    });
  }

  public static String getDays(JCheckBox f, JCheckBox st, JCheckBox sn){
    String s = "";
    if (f.isSelected()){
      s+="Friday\n";
    }
    if (st.isSelected()) {
      s+="Saturday\n";
    }
    if (sn.isSelected()) {
      s+="Sunday\n";
    }
    if ((f.isSelected() == false) && (st.isSelected() == false) && (sn.isSelected() == false)) {
      s+= "Not too often";
    }
    return s;
  }

  public static void main(String args[]){
    new Fun();
  }
}
