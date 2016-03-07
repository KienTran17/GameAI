package com.tdt.edu.caro;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import java.awt.FlowLayout;
import javax.swing.BoxLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import net.miginfocom.swing.MigLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.CardLayout;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.UIManager;

import java.awt.Toolkit;
import java.awt.Color;
import java.awt.Font;
import javax.swing.border.LineBorder;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Button;
import java.awt.Label;
import javax.swing.JLabel;

public class Play extends JFrame implements ActionListener {

    private JPanel        contentPane, Panel;
    private JRadioButton  rd_X       = new JRadioButton("X - Player");
    private JRadioButton  rd_O       = new JRadioButton("O - Player");
    private ButtonGroup   Group      = new ButtonGroup();
    private JButton[][]   btn_Play;
    private static int    x;
    private static int    y;
    private final JPanel  panel      = new JPanel();
    private final JPanel  panel_2    = new JPanel();
    private final JButton btnReset   = new JButton("Reset");
    JButton               btnPlayVsO;
    JButton               btnPlayVsCom;
    private final JLabel  lblTrTuNhn = new JLabel("- Trần Trung Kiên - 51303317");

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Play frame = new Play(26, 16);
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the frame.
     * 
     * @param y2
     * @param x2
     */
    public Play(int x, int y) {
        btnReset.setHorizontalAlignment(SwingConstants.LEFT);
        btnReset.setIcon(new ImageIcon(Play.class.getResource("/Image/1457364967_object-rotate-left.png")));
        btnReset.setForeground(new Color(0, 100, 0));

        btnReset.setFont(new Font("Tahoma", Font.BOLD, 17));
        setIconImage(
                Toolkit.getDefaultToolkit().getImage(Play.class.getResource("/Image/1457365090_Tic-Tac-Toe-Game.png")));
        setTitle("Caro");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 1096, 606);
        contentPane = new JPanel();
        contentPane.setBackground(new Color(224, 255, 255));
        contentPane.setBorder(new LineBorder(new Color(0, 0, 0)));
        contentPane.setLayout(new BorderLayout(0, 0));
        setContentPane(contentPane);
        setSize(1400, 730);
        panel.setBackground(new Color(244, 164, 96));

        contentPane.add(panel, BorderLayout.WEST);
        rd_O.setForeground(new Color(128, 0, 0));
        rd_O.setEnabled(false);
        rd_O.setBackground(new Color(224, 255, 255));
        rd_O.setFont(new Font("Times New Roman", Font.BOLD, 23));
        panel_2.setBorder(new LineBorder(new Color(0, 0, 0)));
        panel_2.setBackground(new Color(224, 255, 255));

        JButton btnExit = new JButton("Tho\u00E1t");
        btnExit.setHorizontalAlignment(SwingConstants.LEFT);
        btnExit.setIcon(new ImageIcon(Play.class.getResource("/Image/1457364904_exit.png")));
        btnExit.setForeground(new Color(0, 100, 0));
        btnExit.setFont(new Font("Tahoma", Font.BOLD, 17));
        btnExit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
            }
        });

        btnPlayVsO = new JButton("X vs O");
        btnPlayVsO.setHorizontalAlignment(SwingConstants.LEFT);
        btnPlayVsO.setIcon(new ImageIcon(Play.class.getResource("/Image/1457365380_Games_1.png")));
        btnPlayVsO.setForeground(new Color(0, 100, 0));
        btnPlayVsO.setFont(new Font("Tahoma", Font.BOLD, 17));

        JButton btnPlayVsCom = new JButton("X vs Com");
        btnPlayVsCom.setHorizontalAlignment(SwingConstants.LEFT);
        btnPlayVsCom.setIcon(new ImageIcon(Play.class.getResource("/Image/1457364827_mac_computer_monitor.png")));
        btnPlayVsCom.setForeground(new Color(0, 100, 0));
        btnPlayVsCom.setFont(new Font("Tahoma", Font.BOLD, 17));
        panel_2.setLayout(new GridLayout(0, 1, 0, 0));
        rd_X.setForeground(new Color(128, 0, 0));
        rd_X.setEnabled(false);
        rd_X.setBackground(new Color(224, 255, 255));
        rd_X.setFont(new Font("Times New Roman", Font.BOLD, 23));
        panel_2.add(rd_X);
        panel_2.add(rd_O);

        JLabel lblNewLabel = new JLabel("");
        lblNewLabel.setIcon(new ImageIcon(Play.class.getResource("/Image/icon175x175.png")));

        JPanel panel_1 = new JPanel();
        panel_1.setBorder(new LineBorder(new Color(0, 0, 0)));
        panel_1.setBackground(new Color(244, 164, 96));
        GroupLayout gl_panel = new GroupLayout(panel);
        gl_panel.setHorizontalGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
                .addGroup(gl_panel.createSequentialGroup().addContainerGap()
                        .addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
                                .addComponent(panel_2, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 175,
                                        Short.MAX_VALUE)
                        .addComponent(btnPlayVsCom, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
                        .addComponent(btnPlayVsO, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
                        .addComponent(panel_1, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
                        .addComponent(lblNewLabel, Alignment.LEADING, GroupLayout.DEFAULT_SIZE,
                                GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnReset, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
                        .addComponent(btnExit, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE))
                .addContainerGap()));
        gl_panel.setVerticalGroup(
                gl_panel.createParallelGroup(Alignment.LEADING)
                        .addGroup(
                                gl_panel.createSequentialGroup().addContainerGap().addComponent(lblNewLabel)
                                        .addPreferredGap(ComponentPlacement.UNRELATED)
                                        .addComponent(panel_2, GroupLayout.PREFERRED_SIZE, 103,
                                                GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(ComponentPlacement.UNRELATED)
                        .addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 177, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(ComponentPlacement.UNRELATED).addComponent(btnPlayVsO)
                        .addPreferredGap(ComponentPlacement.RELATED).addComponent(btnPlayVsCom)
                        .addPreferredGap(ComponentPlacement.RELATED).addComponent(btnReset)
                        .addPreferredGap(ComponentPlacement.RELATED).addComponent(btnExit).addGap(172)));
        panel_1.setLayout(new MigLayout("", "[175px]", "[38px][38px][38px][38px][38px]"));

        JLabel lblNewLabel_1 = new JLabel("Trí Tuệ Nhân Tạo");
        lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 17));
        lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
        panel_1.add(lblNewLabel_1, "cell 0 0,grow");

        JLabel lblTrnHuTrung = new JLabel("- Trần Hữu Trung - 51303xxx");
        panel_1.add(lblTrnHuTrung, "cell 0 1,grow");

        JLabel lblNguynVnL = new JLabel("- Nguyễn Văn Lý - 51303334");
        panel_1.add(lblNguynVnL, "cell 0 2,grow");

        JLabel lblPhmHngBnh = new JLabel("- Phạm Hồng Bình - 51303014");
        panel_1.add(lblPhmHngBnh, "cell 0 3,grow");
        lblTrTuNhn.setHorizontalAlignment(SwingConstants.LEFT);
        panel_1.add(lblTrTuNhn, "cell 0 4,grow");
        panel.setLayout(gl_panel);

        btnPlayVsO.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Reset();
                btnPlayVsCom.setEnabled(false);
                play(x, y);
            }
        });

        btnPlayVsCom.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btnPlayVsO.setEnabled(false);
                Reset();
            }
        });

        btnReset.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                btnPlayVsCom.setEnabled(true);
                btnPlayVsO.setEnabled(true);
                Panel.setVisible(false);
            }
        });

    }

    public void Create_Player_Pane() {
        rd_X.setEnabled(false);
        rd_O.setEnabled(false);
        Group.add(rd_X);
        Group.add(rd_O);
        panel_2.add(rd_X);
        panel_2.add(rd_O);
        panel_2.setLayout(new GridLayout(0, 1, 0, 0));
        rd_X.setSelected(true);
    }

    public void play(int x, int y) {
        this.x = x;
        this.y = y;
        btn_Play = new JButton[y][x];
        Panel = new JPanel();
        Panel.setLayout(new GridLayout(y, x, 1, 1));
        for (int i = 0; i < y; i++)
            for (int j = 0; j < x; j++) {
                btn_Play[i][j] = new JButton();
                btn_Play[i][j].setFont(new Font("Tahoma", Font.BOLD, 10));
                btn_Play[i][j].addActionListener((ActionListener) this);
                Panel.add(btn_Play[i][j]);
            }
        Create_Player_Pane();
        getContentPane().add(Panel, BorderLayout.CENTER);
        setSize(1400, 730);
        setVisible(true);
    }

    public void Reset() {
        for (int i = 0; i < y; i++)
            for (int j = 0; j < x; j++) {
                btn_Play[i][j].setText("");
                btn_Play[i][j].setEnabled(true);
            }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        for (int i = 0; i < y; i++)
            for (int j = 0; j < x; j++) {
                if (btn_Play[i][j] == e.getSource() && btn_Play[i][j].getText().equals("") && rd_X.isSelected()) {
                    btn_Play[i][j].setText("X");
                    btn_Play[i][j].setEnabled(false);
                    rd_O.setSelected(true);
                    Proc_X();
                } else if (btn_Play[i][j] == e.getSource() && btn_Play[i][j].getText().equals("")
                        && rd_O.isSelected()) {
                    btn_Play[i][j].setText("O");
                    btn_Play[i][j].setEnabled(false);
                    rd_X.setSelected(true);
                    Proc_O();
                }
            }

    }

    private void Proc_X() {
        // Duyet theo chieu ngang
        for (int i = 0; i < y; i++)
            for (int j = 0; j < x; j++) {
                if (j + 4 < x) {
                    if (btn_Play[i][j].getText().equals("X")) {
                        int Count_Ngang = 0;
                        for (int a = j; a < j + 5; a++) {
                            if (btn_Play[i][a].getText().equals("X")) {
                                Count_Ngang++;
                            } else if (btn_Play[i][a].getText().equals("O")) {
                                break;
                            }
                            if (Count_Ngang == 5) {
                                if (j + 5 < y && j > 0 && (btn_Play[i][j - 1].getText().equals("O")
                                        || btn_Play[i][j + 5].getText().equals(""))) {
                                    JOptionPane.showMessageDialog(null, "X Thắng");
                                    Reset();
                                    break;
                                } else if (j == 0 && btn_Play[i][j + 5].getText().equals("")) {
                                    JOptionPane.showMessageDialog(null, "X Thắng");
                                    Reset();
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        // duyet theo chieu doc
        for (int i = 0; i < x; i++)
            for (int j = 0; j < y; j++) {
                if (j + 4 < y) {
                    if (btn_Play[j][i].getText().equals("X")) {
                        int Count_Doc = 0;
                        for (int a = j; a < j + 5; a++) {
                            if (btn_Play[a][i].getText().equals("X")) {
                                Count_Doc++;
                            } else if (btn_Play[a][i].getText().equals("O")) {
                                break;
                            }
                            if (Count_Doc == 5) {
                                if (j + 5 < y && j > 0 && (btn_Play[j - 1][i].getText().equals("")
                                        || btn_Play[j + 5][i].getText().equals(""))) {
                                    JOptionPane.showMessageDialog(null, "X Thắng");
                                    Reset();
                                    break;
                                } else if (j == 0 && btn_Play[j + 5][i].getText().equals("")) {
                                    javax.swing.JOptionPane.showMessageDialog(null, "X Thắng");
                                    Reset();
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        // duyet theo duong cheo trai
        for (int i = 0; i < y; i++)
            for (int j = 0; j < x; j++) {
                if (j - 4 >= 0 && i + 4 < y) {
                    if (btn_Play[i][j].getText().equals("X")) {
                        int Cheo_Trai = 0, a, b;
                        for (a = i, b = j; a < i + 5; a++) {
                            if (btn_Play[a][b].getText().equals("X")) {
                                Cheo_Trai++;
                            } else if (btn_Play[a][b].getText().equals("O")) {
                                break;
                            }
                            if (Cheo_Trai == 5) {
                                if (i > 0 && j < x - 1
                                        && (btn_Play[i - 1][j + 1].getText().equals("")
                                                || btn_Play[i + 5][j - 5].getText().equals(""))
                                        && j - 4 >= 0 && i + 5 < y) {
                                    JOptionPane.showMessageDialog(null, "X Thắng");
                                    Reset();
                                    break;
                                } else if (i == 0 && j - 4 > 0 && btn_Play[i + 5][j - 5].getText().equals("")) {
                                    JOptionPane.showMessageDialog(null, "X Thắng");
                                    Reset();
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        // Duyet duong cheo phai
        for (int i = 0; i < y; i++)
            for (int j = 0; j < x; j++) {
                if (j + 4 < x && i + 4 < x) {
                    if (btn_Play[i][j].getText().equals("X")) {
                        int Cheo_Phai = 0, a, b;
                        for (a = i, b = j; b < j + 5; a++, b++) {
                            if (btn_Play[a][b].getText().equals("X")) {
                                Cheo_Phai++;
                            } else if (btn_Play[a][b].getText().equals("O")) {
                                break;
                            }
                            if (Cheo_Phai == 5) {
                                if (i > 0 && j > 0 && i + 5 < y && j + 5 < x
                                        && (btn_Play[i - 1][j - 1].getText().equals("")
                                                || btn_Play[i + 5][j + 5].getText().equals(""))) {
                                    JOptionPane.showMessageDialog(null, "X Thắng");
                                    Reset();
                                    break;
                                } else if (i == 0 && j + 5 < x && btn_Play[i + 5][j + 5].getText().equals("")) {
                                    JOptionPane.showMessageDialog(null, "X Thắng");
                                    Reset();
                                    break;
                                } else if (j == 0 && i + 5 < y && btn_Play[i + 5][j + 5].getText().equals("")) {
                                    JOptionPane.showMessageDialog(null, "X Thắng");
                                    Reset();
                                    break;
                                }
                            }
                        }
                    }
                }
            }
    }

    private void Proc_O() {
        // Duyet theo chieu ngang
        for (int i = 0; i < y; i++)
            for (int j = 0; j < x; j++) {
                if (j + 4 < x) {
                    if (btn_Play[i][j].getText().equals("O")) {
                        int Count_Ngang = 0;
                        for (int a = j; a < j + 5; a++) {
                            if (btn_Play[i][a].getText().equals("O")) {
                                Count_Ngang++;
                            } else if (btn_Play[i][a].getText().equals("X")) {
                                break;
                            }
                            if (Count_Ngang == 5) {
                                if (j + 5 < y && j > 0 && (btn_Play[i][j - 1].getText().equals("")
                                        || btn_Play[i][j + 5].getText().equals(""))) {
                                    JOptionPane.showMessageDialog(null, "O Thắng");
                                    Reset();
                                    break;
                                } else if (j == 0 && btn_Play[i][j + 5].getText().equals("")) {
                                    JOptionPane.showMessageDialog(null, "O Thắng");
                                    Reset();
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        // duyet theo chieu doc
        for (int i = 0; i < x; i++)
            for (int j = 0; j < y; j++) {
                if (j + 4 < y) {
                    if (btn_Play[j][i].getText().equals("O")) {
                        int Count_Doc = 0;
                        for (int a = j; a < j + 5; a++) {
                            if (btn_Play[a][i].getText().equals("O")) {
                                Count_Doc++;
                            } else if (btn_Play[a][i].getText().equals("X")) {
                                break;
                            }
                            if (Count_Doc == 5) {
                                if (j + 5 < y && j > 0 && (btn_Play[j - 1][i].getText().equals("")
                                        || btn_Play[j + 5][i].getText().equals(""))) {
                                    JOptionPane.showMessageDialog(null, "O Thắng");
                                    Reset();
                                    break;
                                } else if (j == 0 && btn_Play[j + 5][i].getText().equals("")) {
                                    JOptionPane.showMessageDialog(null, "O Thắng");
                                    Reset();
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        // duyet theo duong cheo trai
        for (int i = 0; i < y; i++)
            for (int j = 0; j < x; j++) {
                if (j - 4 >= 0 && i + 4 < y) {
                    if (btn_Play[i][j].getText().equals("O")) {
                        int Cheo_Trai = 0, a, b;
                        for (a = i, b = j; a < i + 5; a++) {
                            if (btn_Play[a][b].getText().equals("O")) {
                                Cheo_Trai++;
                            } else if (btn_Play[a][b].getText().equals("X")) {
                                break;
                            }
                            if (Cheo_Trai == 5) {
                                if (i > 0 && j < x - 1
                                        && (btn_Play[i - 1][j + 1].getText().equals("")
                                                || btn_Play[i + 5][j - 5].getText().equals(""))
                                        && j - 4 >= 0 && i + 5 < y) {
                                    JOptionPane.showMessageDialog(null, "O Thắng");
                                    Reset();
                                    break;
                                } else if (i == 0 && j - 4 > 0 && btn_Play[i + 5][j - 5].getText().equals("")) {
                                    JOptionPane.showMessageDialog(null, "O Thắng");
                                    Reset();
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        // Duyet duong cheo phai
        for (int i = 0; i < y; i++)
            for (int j = 0; j < x; j++) {
                if (j + 4 < x && i + 4 < x) {
                    if (btn_Play[i][j].getText().equals("O")) {
                        int Cheo_Phai = 0, a, b;
                        for (a = i, b = j; b < j + 5; a++, b++) {
                            if (btn_Play[a][b].getText().equals("O")) {
                                Cheo_Phai++;
                            } else if (btn_Play[a][b].getText().equals("X")) {
                                break;
                            }
                            if (Cheo_Phai == 5) {
                                if (i > 0 && j > 0 && i + 5 < y && j + 5 < x
                                        && (btn_Play[i - 1][j - 1].getText().equals("")
                                                || btn_Play[i + 5][j + 5].getText().equals(""))) {
                                    JOptionPane.showMessageDialog(null, "O Thắng");
                                    Reset();
                                    break;
                                } else if (i == 0 && j + 5 < x && btn_Play[i + 5][j + 5].getText().equals("")) {
                                    JOptionPane.showMessageDialog(null, "O Thắng");
                                    Reset();
                                    break;
                                } else if (j == 0 && i + 5 < y && btn_Play[i + 5][j + 5].getText().equals("")) {
                                    JOptionPane.showMessageDialog(null, "O Thắng");
                                    Reset();
                                    break;
                                }
                            }
                        }
                    }
                }
            }
    }
}
