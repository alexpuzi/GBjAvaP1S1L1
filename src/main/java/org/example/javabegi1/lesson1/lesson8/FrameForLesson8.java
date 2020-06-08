package org.example.javabegi1.lesson1.lesson8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class FrameForLesson8 extends JFrame implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        System.exit(0);
    }

    FrameForLesson8(String name) {
        super(name);
        setBounds(250, 250, 900, 600); //положение размера окна
        setResizable(false); //окно постоянных размеров
        //реакция на щелчек системной пиктограммы
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        //отключение менеджера компоновки для окна
        setLayout(null);
        //Создание объекта панели
        JPanel jPanel = new JPanel();
        jPanel.setBounds(5, 5, 855, 550);//положение и размеры панели
        jPanel.setBorder(BorderFactory.createEtchedBorder()); //рамка вокруг пенели
        jPanel.setLayout(null);//отключение менеджера компоновки для панели
        ImageIcon imageIcon = new ImageIcon("C:/Users/GBjAvaP1S1L1/src/main/resources/org/example/pictureForLesson8.png");
        //текстовое значение для отображения в метке
        String txt = "<html>This is SpongeBob SquarePants.<br>He is big.<br>He is cool.</html>";
        //создание объекта метки с изображением
        JLabel jLabelImg = new JLabel(imageIcon);
        //положение и размеры метки
        jLabelImg.setBounds(10,10,390,390);
        //рамка вокруг метки
        jLabelImg.setBorder(BorderFactory.createEtchedBorder());
        JLabel textLabel = new JLabel(txt, JLabel.CENTER);
        textLabel.setBounds(465, 10, 265, 190);
        //рамка вокруг метки
        textLabel.setBorder(BorderFactory.createEtchedBorder());
        JButton button = new JButton("Close");
        button.setBounds(350, 500, 200, 30);
        button.setFocusPainted(false);
        button.addActionListener(this);
        Font f = new Font(button.getFont().getName(), Font.ROMAN_BASELINE | Font.ITALIC,
                button.getFont().getSize() + 2);
        textLabel.setFont(f);
        jPanel.add(jLabelImg);
        jPanel.add(textLabel);
        add(jPanel);
        add(button);
        jPanel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseReleased(MouseEvent e) {
                System.out.println("MousePos: "+ e.getX()+" "+ e.getY());
            }
        });
        setVisible(true);

    }

}
