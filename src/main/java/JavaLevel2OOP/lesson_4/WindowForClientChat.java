package JavaLevel2OOP.lesson_4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class WindowForClientChat extends JFrame {
    public WindowForClientChat() {
        setTitle("PanPartizaninChat");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(300,200,500,600);
        JPanel[] jPanels = new JPanel[2];
        jPanels[0] = new JPanel();
        jPanels[1] = new JPanel();
        add(jPanels[0]);
        add(jPanels[1]);
        jPanels[0].setBackground(new Color(192, 208, 252, 1));
        jPanels[0].setLayout(new BorderLayout());
        JTextArea jta = new JTextArea();
        JScrollPane jsp= new JScrollPane(jta);
        jPanels[0].add(jsp);
        JButton jbt = new JButton();
        add(jbt);
        jbt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        JTextField field = new JTextField();
        add(field);
        field.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Your message: " + field.getText());
            }
        });
        setVisible(true);
    }
}
