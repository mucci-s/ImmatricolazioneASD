package it.unimol.sm.GUI;

import it.unimol.sm.app.GestoreApp;
import it.unimol.sm.app.automobile.Automobile;
import it.unimol.sm.app.proprietario.DataFormatException;
import it.unimol.sm.app.proprietario.Proprietario;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InserimantoProprietarioGUI extends JFrame {
    static InserimantoProprietarioGUI frame;
    private JPanel contentPane;


    private JTextField fldNome;
    private JTextField fldCognome;
    private JTextField fldNascita;
    private JTextField fldPatente;

    public static void main(String[] args, String[] auto) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                    frame = new InserimantoProprietarioGUI(auto);
                    frame.setVisible(true);

            }
        });
    }



    public InserimantoProprietarioGUI(String[] auto){

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 400);
        this.setResizable(false);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);

        JLabel lblAddLibrarian = new JLabel("Dati Proprietario");
        lblAddLibrarian.setForeground(Color.DARK_GRAY);
        lblAddLibrarian.setFont(new Font("Tahoma", Font.PLAIN, 22));


        JLabel lblNome = new JLabel("Nome:");
        JLabel lblCognome = new JLabel("Cognome:");
        JLabel lblDataNascita = new JLabel("Data di Nascita(dd/mm/aaaa):");
        JLabel lblNpatente = new JLabel("Numero Patente:");

        fldNome = new JTextField();
        fldNome.setColumns(10);

        fldCognome = new JTextField();

        fldNascita = new JTextField();
        fldNascita.setColumns(10);

        fldPatente = new JTextField();
        fldPatente.setColumns(10);



        JButton btnNewButton = new JButton("Immatricola auto");
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    String nome = fldNome.getText();
                    String cognome = fldCognome.getText();
                    String nascita = fldNascita.getText();
                    String patente = fldPatente.getText();


                    Proprietario proprietario = new Proprietario(nome, cognome, nascita, patente);
                    Automobile autovett = new Automobile(auto[0],auto[1],auto[2],auto[3],auto[4],proprietario);
                    if(GestoreApp.getInstance().immatricolaAuto(autovett)){
                        JOptionPane.showMessageDialog(InserimantoProprietarioGUI.this,
                                "L'immatricolazione dell'auto è avvenuta con successo,con targa: \n"
                                        + autovett.getTarga(),"Auto immatricolata!", JOptionPane.ERROR_MESSAGE);
                        MenuFrame.main(new String[]{});
                        frame.dispose();
                    }
                    else{
                        JOptionPane.showMessageDialog(InserimantoProprietarioGUI.this,
                                "C'è stato un errore nell'immatricolazione dell'auto","Errore!",
                                JOptionPane.ERROR_MESSAGE);
                        MenuFrame.main(new String[]{});
                        frame.dispose();
                    }

                } catch (DataFormatException err) {
                    JOptionPane.showMessageDialog(InserimantoProprietarioGUI.this, err.getMessage(),
                            "Data Error!", JOptionPane.ERROR_MESSAGE);
                    fldNascita.setText("");
                }


            }
        });
        btnNewButton.setForeground(Color.DARK_GRAY);

        JButton btnBack = new JButton("Back");
        btnBack.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ImmatricolaGUI.main(new String[]{});
                frame.dispose();
            }
        });
        GroupLayout gl_contentPane = new GroupLayout(contentPane);
        gl_contentPane.setHorizontalGroup(
                gl_contentPane.createParallelGroup(GroupLayout.Alignment.TRAILING)
                        .addGroup(gl_contentPane.createSequentialGroup()
                                .addGap(20)
                                .addGroup(gl_contentPane.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                        .addComponent(lblCognome, GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE)
                                        .addComponent(lblNome)
                                        .addComponent(lblDataNascita)
                                        .addComponent(lblNpatente, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE,
                                                Short.MAX_VALUE))
                                .addGap(58)
                                .addGroup(gl_contentPane.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                        .addComponent(fldPatente, GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE)
                                        .addComponent(fldNascita, GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE)
                                        .addComponent(fldNome, GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE)
                                        .addComponent(fldCognome))
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
                                                .addComponent(lblNome)
                                                .addGap(18)
                                                .addComponent(lblCognome))
                                        .addGroup(gl_contentPane.createSequentialGroup()
                                                .addComponent(fldNome, GroupLayout.PREFERRED_SIZE,
                                                        GroupLayout.DEFAULT_SIZE,
                                                        GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(fldCognome, GroupLayout.PREFERRED_SIZE,
                                                        GroupLayout.DEFAULT_SIZE,
                                                        GroupLayout.PREFERRED_SIZE)))
                                .addGap(18)
                                .addGroup(gl_contentPane.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(lblDataNascita)
                                        .addComponent(fldNascita, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
                                                GroupLayout.PREFERRED_SIZE))
                                .addGap(18)
                                .addGroup(gl_contentPane.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(lblNpatente)
                                        .addComponent(fldPatente, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
                                                GroupLayout.PREFERRED_SIZE))
                                .addGap(18)
                                .addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 36,
                                        GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                                .addComponent(btnBack)
                                .addGap(19))
        );
        contentPane.setLayout(gl_contentPane);
    }
}
