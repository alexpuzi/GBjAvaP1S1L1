package org.example.javabegi1.lesson1.lesson8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonAction implements ActionListener {
    private JTextField jTextField;
    public ButtonAction(JTextField jTextField){
        this.jTextField = jTextField;
    }

    public ButtonAction(String ddd) {

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton jButton = (JButton) e.getSource();
        jButton.setBackground(new Color(234, 180, 222));


    }
}
