package org.example.javabegi1.lesson1.lesson8;

import javax.swing.*;
import java.awt.*;

public class CalcFrame extends JFrame {
    public CalcFrame(String string){
        setTitle(string);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(58,35,500,300);
        setVisible(true);
        setLayout(new GridLayout(4,3));
        for(int i =0; i<=9 ; i++){
            JButton jButton = new JButton(String.valueOf(i));
            jButton.addActionListener(new ButtonAction("ddd"));
            add(jButton);

        }
        JTextField jTextField = new JTextField("result...");
        add(jTextField);
    }
}
