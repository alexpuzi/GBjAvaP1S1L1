package org.example.javabegi1.lesson1.lesson8;

import javax.swing.*;
import java.awt.*;

public class Form extends JFrame {

    public Form(String title) {
        setTitle(title);
        super.setTitle(title);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(50, 35, 300, 300);
        setVisible(true);

        //           setLayout(new BoxLayout(getContentPane(),BoxLayout.X_AXIS));
//            setResizable(false); //не дает расширятся
        setLayout(new FlowLayout());
        for (int i = 0; i <= 20; i++) {
            JButton jButton = new JButton();
            jButton.setText("Button #"+i);
            jButton.setSize(50, 50);
            add(jButton);
        }
//        JButton jButton1 = new JButton("#1");
//        JButton jButton2 = new JButton("#2");
//        JButton jButton3 = new JButton("#3");
//        JButton jButton4 = new JButton("#4");
//        JButton jButton5 = new JButton("#5");
//
//        setLayout(new BorderLayout());
//        add(jButton1,BorderLayout.CENTER);
//        add(jButton2,BorderLayout.EAST);
//        add(jButton3,BorderLayout.WEST);
//        add(jButton4,BorderLayout.SOUTH);
//        add(jButton5,BorderLayout.NORTH);
//            JTextArea jTextArea = new JTextArea("" +
//                    "Write down some text..");
//            add(jTextArea);

    }
}
