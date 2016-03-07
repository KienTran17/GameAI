package com.tdt.edu.caro;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;

public class Gui extends JFrame {

    private JPanel     contentPane;
    private JTextField X, Y;

    /**
     * Launch the application.
     */
//    public static void main(String[] args) {
//        EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                try {
//                    Gui frame = new Gui();
//                    frame.setVisible(true);
//                } catch (Exception e) {
//                    e.printStackTrace();
//                }
//            }
//        });
//    }

    /**
     * Create the frame.
     */
    public Gui() {
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);

        X = new JTextField();
        X.setColumns(10);

        Y = new JTextField();
        Y.setColumns(10);

        JLabel lbl_labelX = new JLabel("X :");

        JLabel lbl_labelY = new JLabel("Y :");

        JButton btn_submit = new JButton("Chơi");
        GroupLayout gl_contentPane = new GroupLayout(contentPane);
        gl_contentPane.setHorizontalGroup(gl_contentPane.createParallelGroup(Alignment.LEADING).addGroup(gl_contentPane
                .createSequentialGroup()
                .addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
                        .addGroup(gl_contentPane.createSequentialGroup().addGap(30)
                                .addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
                                        .addComponent(lbl_labelY, GroupLayout.PREFERRED_SIZE, 26,
                                                GroupLayout.PREFERRED_SIZE)
                                .addComponent(lbl_labelX, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(ComponentPlacement.RELATED)
                                .addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
                                        .addComponent(X, Alignment.LEADING, GroupLayout.PREFERRED_SIZE,
                                                GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(Y, Alignment.LEADING, GroupLayout.PREFERRED_SIZE,
                                                GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
                        .addGroup(gl_contentPane.createSequentialGroup().addGap(57).addComponent(btn_submit)))
                .addContainerGap(262, Short.MAX_VALUE)));
        gl_contentPane.setVerticalGroup(gl_contentPane.createParallelGroup(Alignment.LEADING).addGroup(gl_contentPane
                .createSequentialGroup().addContainerGap()
                .addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE).addComponent(lbl_labelX).addComponent(
                        X, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addGap(27)
                .addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE).addComponent(lbl_labelY).addComponent(
                        Y, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addGap(26).addComponent(btn_submit).addContainerGap(124, Short.MAX_VALUE))

        );
        setSize(353, 180);
        setVisible(true);
        contentPane.setLayout(gl_contentPane);
        btn_submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent e) {
                Command();
            }
        });
    }

    public void Command() {
        try {
            int x = Integer.parseInt(X.getText());
            int y = Integer.parseInt(Y.getText());
            new Play(x, y).setVisible(true);
            this.setVisible(false);
        } catch (Exception e) {
            // TODO: handle exception
            JOptionPane.showMessageDialog(this, "Vui lòng nhập vào số nguyên");
        }

    }

}
