package JavaLevel2OOP.lesson_4;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class WindowForClientChat2 extends Frame {
//    public WindowForClientChat2()throws HeadlessException {
//        setBounds(500, 200, 400, 400);
//        setTitle("My application");
//        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
//
//
//        // setLayout(new BoxLayout(getContentPane(), BoxLayout.PAGE_AXIS));
//        setLayout(new GridLayout(3,1));
//        JButton[] jb = new JButton[10];
//        for (int i = 0; i < jb.length; i++) {
//            jb[i] = new JButton("button:" + i);
//            // add(jb[i]);
//        }
//
//        JPanel p1 = new JPanel();
//
//        p1.setBackground(Color.GREEN);
//        p1.setLayout(new BoxLayout(p1, BoxLayout.Y_AXIS));
//        // p1.setLayout(new FlowLayout());
//        JTextArea jta1 = new JTextArea();
//
//        p1.add(new JScrollPane(jta1));
//        p1.add(jb[0]);
//        jb[0].addActionListener(e->{
//            jta1.append("skdjflsjdf\n\nsfkjhsdh\n\r" + System.currentTimeMillis());
//        });
//
//
//
//        JPanel p2 = new JPanel();
//        p2.setBackground(Color.LIGHT_GRAY);
//        p2.setLayout(new GridLayout(1, 1));
//        JTextField jTextField = new JTextField();
//
//
//        jTextField.addActionListener(e->{
//            JFrame jFrame = new JFrame();
//            JTextArea jta = new JTextArea();
//            jta.setText(jTextField.getText());
//            jFrame.add(jta);
//            jFrame.setBounds(500, 200, 300, 300);
//            jFrame.setVisible(true);
//
//            // add(jFrame);
//            System.out.println(jTextField.getText());
//
//            jTextField.setText("");
//        });
//
//        p2.add(jTextField);
//
//
//
//        add(p1);
//        add(p2);
//
//
//        JButton jbf = new JButton("firstButton");
//        jbf.setBounds(50, 50, 100, 100);
//        jbf.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                System.out.println("pushed me");
//            }
//        });
//
//        jbf.addMouseListener(new MouseAdapter() {
//            @Override
//            public void mousePressed(MouseEvent e) {
//                System.out.println("you pressed me!");
//            }
//        });
//
//        // add(jbf);
//
//
//        setVisible(true);

            private JTextField field;
            private JTextArea jta;
            public JButton button;

            public WindowForClientChat2()throws HeadlessException
            {
                setTitle("Panpartizanchat chat");

//                setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
                setBounds(100, 100, 500, 500);

                JPanel jp = new JPanel();
                jp.setLayout(new BorderLayout());

                jta = new JTextArea();
                jta.setLineWrap(true);
                JScrollPane jsp = new JScrollPane(jta);
                jp.add(jsp, BorderLayout.CENTER);

                JPanel bottomJp = new JPanel();
                bottomJp.setLayout(new BorderLayout());

                addTextField();
                bottomJp.add(field, BorderLayout.CENTER);

                addButton();
                bottomJp.add(button, BorderLayout.SOUTH);
                jp.add(bottomJp, BorderLayout.SOUTH);
                add(jp);

                setVisible(true);
                field.grabFocus();
            }

            private void sendMessage(){
                if(!field.getText().isEmpty()){
                    jta.append(field.getText()+"\n");
                    field.setText("");
                    field.grabFocus();
                }
            }

            private void addTextField(){
                field = new JTextField();
                field.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        sendMessage();
                    }
                });
            }

            private void addButton(){
                button = new JButton("Отправить");
                button.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        sendMessage();
                    }
                });
            }
        }
