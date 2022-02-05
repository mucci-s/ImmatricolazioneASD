package it.unimol.sm.GUI;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ImmatricolaGUI extends JFrame {

    static ImmatricolaGUI frame;
    private JPanel contentPane;

    private JTextField fldProduttore;
    private JTextField fldModello;
    private JTextField fldAllestimento;
    private JTextField fldCilindrata;
    private JTextField fldPotenza;


    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                frame = new ImmatricolaGUI();
                frame.setVisible(true);

            }
        });
    }


    public ImmatricolaGUI() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 400);
        this.setResizable(false);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);

        JLabel lblAddLibrarian = new JLabel("DATI AUTO");
        lblAddLibrarian.setForeground(Color.DARK_GRAY);
        lblAddLibrarian.setFont(new Font("Tahoma", Font.PLAIN, 22));


        JLabel lblProduttore = new JLabel("Produttore:");
        JLabel lblModello = new JLabel("Modello:");

        JLabel lblAllestimento = new JLabel("Allestimento:");

        JLabel lblCilindrata = new JLabel("Cilindrata:");

        JLabel lblPotenza = new JLabel("Potenza:");

        fldProduttore = new JTextField();
        fldProduttore.setColumns(10);

        fldModello = new JTextField();

        fldAllestimento = new JTextField();
        fldAllestimento.setColumns(10);

        fldCilindrata = new JTextField();
        fldCilindrata.setColumns(10);

        fldPotenza = new JTextField();
        fldPotenza.setColumns(10);


        JButton btnNewButton = new JButton("Avanti");
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String[] auto = new String[5];
                auto[0] = fldProduttore.getText();
                auto[1] = fldModello.getText();
                auto[2] = fldAllestimento.getText();
                auto[3] = fldCilindrata.getText();
                auto[4] = fldPotenza.getText();


                InserimantoProprietarioGUI.main(new String[]{}, auto);
                frame.dispose();

            }
        });
        btnNewButton.setForeground(Color.DARK_GRAY);

        JButton btnBack = new JButton("Back");
        btnBack.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                MenuFrame.main(new String[]{});
                frame.dispose();
            }
        });
        GroupLayout gl_contentPane = new GroupLayout(contentPane);
        gl_contentPane.setHorizontalGroup(
                gl_contentPane.createParallelGroup(GroupLayout.Alignment.TRAILING)
                        .addGroup(gl_contentPane.createSequentialGroup()
                                .addGap(20)
                                .addGroup(gl_contentPane.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                        .addComponent(lblModello, GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE)
                                        .addComponent(lblProduttore)
                                        .addComponent(lblAllestimento)
                                        .addComponent(lblCilindrata, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE,
                                                Short.MAX_VALUE)
                                        .addComponent(lblPotenza, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE,
                                                Short.MAX_VALUE))
                                .addGap(58)
                                .addGroup(gl_contentPane.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                        .addComponent(fldPotenza, GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE)
                                        .addComponent(fldCilindrata, GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE)
                                        .addComponent(fldAllestimento, GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE)
                                        .addComponent(fldProduttore, GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE)
                                        .addComponent(fldModello))
                                .addContainerGap(107, Short.MAX_VALUE))
                        .addGroup(gl_contentPane.createSequentialGroup()
                                .addContainerGap(151, Short.MAX_VALUE)
                                .addComponent(lblAddLibrarian)
                                .addGap(144))
                        .addGroup(gl_contentPane.createSequentialGroup()
                                .addContainerGap(160, Short.MAX_VALUE)
                                .addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 131, GroupLayout.PREFERRED_SIZE)
                                .addGap(133))
                        .addGroup(gl_contentPane.createSequentialGroup()
                                .addContainerGap(200, Short.MAX_VALUE)
                                .addComponent(btnBack)
                                .addGap(169))
        );
        gl_contentPane.setVerticalGroup(
                gl_contentPane.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(gl_contentPane.createSequentialGroup()
                                .addComponent(lblAddLibrarian)
                                .addGap(18)
                                .addGroup(gl_contentPane.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(gl_contentPane.createSequentialGroup()
                                                .addComponent(lblProduttore)
                                                .addGap(18)
                                                .addComponent(lblModello))
                                        .addGroup(gl_contentPane.createSequentialGroup()
                                                .addComponent(fldProduttore, GroupLayout.PREFERRED_SIZE,
                                                        GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(fldModello, GroupLayout.PREFERRED_SIZE,
                                                        GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
                                .addGap(18)
                                .addGroup(gl_contentPane.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(lblAllestimento)
                                        .addComponent(fldAllestimento, GroupLayout.PREFERRED_SIZE,
                                                GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addGap(18)
                                .addGroup(gl_contentPane.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(lblCilindrata)
                                        .addComponent(fldCilindrata, GroupLayout.PREFERRED_SIZE,
                                                GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addGap(18)
                                .addGroup(gl_contentPane.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(lblPotenza)
                                        .addComponent(fldPotenza, GroupLayout.PREFERRED_SIZE,
                                                GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addGap(18)
                                .addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                                .addComponent(btnBack)
                                .addGap(19))
        );
        contentPane.setLayout(gl_contentPane);
    }


}
