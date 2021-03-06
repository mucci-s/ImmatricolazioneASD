package it.unimol.sm.GUI;


import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;



public class MenuFrame extends JFrame {

    static MenuFrame frame;
    private JPanel contentPane;


//    public static void main(String[] args) {
//        EventQueue.invokeLater(new Runnable() {
//            public void run() {
//
//                    frame= new MenuFrame();
//                    frame.setVisible(true);
//            }
//        });
//    }

    public MenuFrame() {


        this.setTitle("Menu immatricolazione");
        this.setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 450);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        this.setVisible(true);

        JButton btnImmatricola = new JButton("Immatricola Auto");
        btnImmatricola.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new ImmatricolaGUI();
                MenuFrame.this.setVisible(false);
            }
        });
        btnImmatricola.setFont(new Font("Tahoma", Font.PLAIN, 15));

        JButton btnShowListAuto = new JButton("Visualizza auto Immatricolate");
        btnShowListAuto.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                new VisualizzaAutoGUI();
                MenuFrame.this.setVisible(false);
//                frame.dispose();

            }
        });
        btnShowListAuto.setFont(new Font("Tahoma", Font.PLAIN, 15));


        JButton btnCheckTarga = new JButton("Controlla Targa Auto");
        btnCheckTarga.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new CheckTargaGUI();
                MenuFrame.this.setVisible(false);
//                frame.dispose();
            }
        });
        btnCheckTarga.setFont(new Font("Tahoma", Font.PLAIN, 15));


        JButton btnExit= new JButton("ESCI");
        btnExit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        btnExit.setFont(new Font("Tahoma", Font.PLAIN, 15));


        JLabel lblImmatricolazione = new JLabel("--IMMATRICOLAZIONE--");
        lblImmatricolazione.setFont(new Font("Tahoma", Font.PLAIN, 18));
        lblImmatricolazione.setForeground(Color.GRAY);
        GroupLayout gl_contentPane = new GroupLayout(contentPane);
        gl_contentPane.setHorizontalGroup(
                gl_contentPane.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(gl_contentPane.createSequentialGroup()
                                .addGroup(gl_contentPane.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(gl_contentPane.createSequentialGroup()
                                                .addGap(110)
                                                .addComponent(lblImmatricolazione))
                                        .addGroup(gl_contentPane.createSequentialGroup()
                                                .addGap(100)
                                                .addGroup(gl_contentPane
                                                        .createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                                                        .addComponent(btnImmatricola, GroupLayout.Alignment.LEADING,
                                                                GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE,
                                                                Short.MAX_VALUE)
                                                        .addComponent(btnShowListAuto, GroupLayout.Alignment.LEADING,
                                                                GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                                                        .addComponent(btnCheckTarga, GroupLayout.Alignment.LEADING,
                                                                GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                                                        .addComponent(btnExit, GroupLayout.Alignment.LEADING,
                                                                GroupLayout.PREFERRED_SIZE, 50, Short.MAX_VALUE))))

                                .addContainerGap(95, Short.MAX_VALUE))
        );
        gl_contentPane.setVerticalGroup(
                gl_contentPane.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(gl_contentPane.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(lblImmatricolazione)
                                .addGap(32)
                                .addComponent(btnImmatricola, GroupLayout.PREFERRED_SIZE, 52, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnShowListAuto, GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE)
                                .addGap(15)
                                .addComponent(btnCheckTarga, GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE)
                                .addGap(30)
                                .addComponent(btnExit, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(40, Short.MAX_VALUE))
        );


        contentPane.setLayout(gl_contentPane);


    }
}
