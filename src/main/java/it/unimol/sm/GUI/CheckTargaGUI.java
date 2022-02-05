package it.unimol.sm.GUI;

import it.unimol.sm.app.GestoreApp;
import it.unimol.sm.app.TargaInesistenteException;
import it.unimol.sm.app.automobile.Automobile;


import javax.swing.*;
import javax.swing.border.Border;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CheckTargaGUI extends JFrame {

    static CheckTargaGUI frame;
    private JPanel contentPane;

    private JLabel lblTarga;
    private JTextField fldTarga;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                    frame = new CheckTargaGUI();
                    frame.setVisible(true);
            }
        });
    }

    public CheckTargaGUI(){



        this.setTitle("RICERCA TARGA");
        this.setSize(300, 570);
        this.setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);


        this.contentPane = new JPanel();
        this.contentPane.setAlignmentX(CENTER_ALIGNMENT);
        this.contentPane.setLayout(new FlowLayout());
        this.add(this.contentPane);
        Border padding = BorderFactory.createEmptyBorder(10, 5, 10, 10);
        this.contentPane.setBorder(padding);

        JLabel titleFrame = new JLabel("###DETTAGLI TARGA###");
        titleFrame.setFont(new Font("Tahoma", Font.PLAIN, 18));
        titleFrame.setForeground(Color.GRAY);

        lblTarga = new JLabel("Inserisci Targa:");
        lblTarga.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
        lblTarga.setFont(new Font("Tahoma", Font.PLAIN, 15));
        lblTarga.setAlignmentX(CENTER_ALIGNMENT);

        fldTarga = new JTextField();
        fldTarga.setAlignmentX(CENTER_ALIGNMENT);
        fldTarga.setPreferredSize(new Dimension(200, 24));


        JLabel  lblNome = new JLabel();
        lblNome.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
        lblNome.setFont(new Font("Tahoma", Font.PLAIN, 15));
        lblNome.setAlignmentX(CENTER_ALIGNMENT);

        JLabel  lblNascita= new JLabel();
        lblNascita.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
        lblNascita.setFont(new Font("Tahoma", Font.PLAIN, 15));
        lblNascita.setAlignmentX(CENTER_ALIGNMENT);

        JLabel  lblPatente= new JLabel();
        lblPatente.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
        lblPatente.setFont(new Font("Tahoma", Font.PLAIN, 15));
        lblPatente.setAlignmentX(CENTER_ALIGNMENT);



        JLabel  lblProduttore = new JLabel();
        lblProduttore.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
        lblProduttore.setFont(new Font("Tahoma", Font.PLAIN, 15));
        lblProduttore.setAlignmentX(CENTER_ALIGNMENT);

        JLabel  lblModello = new JLabel();
        lblModello.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
        lblModello.setFont(new Font("Tahoma", Font.PLAIN, 15));
        lblModello.setAlignmentX(CENTER_ALIGNMENT);

        JLabel  lblAllestimento = new JLabel();
        lblAllestimento.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
        lblAllestimento.setFont(new Font("Tahoma", Font.PLAIN, 15));
        lblAllestimento.setAlignmentX(CENTER_ALIGNMENT);

        JLabel  lblCilindrata = new JLabel();
        lblCilindrata.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
        lblCilindrata.setFont(new Font("Tahoma", Font.PLAIN, 15));
        lblCilindrata.setAlignmentX(CENTER_ALIGNMENT);

        JLabel  lblPotenza = new JLabel();
        lblPotenza.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
        lblPotenza.setFont(new Font("Tahoma", Font.PLAIN, 15));
        lblPotenza.setAlignmentX(CENTER_ALIGNMENT);

        JLabel  lblDataImmatricolazione = new JLabel();
        lblDataImmatricolazione.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
        lblDataImmatricolazione.setFont(new Font("Tahoma", Font.PLAIN, 15));
        lblDataImmatricolazione.setAlignmentX(CENTER_ALIGNMENT);


        JLabel lblProrpietario = new JLabel();
        lblProrpietario.setFont(new Font("Tahoma", Font.PLAIN, 15));
        lblProrpietario.setForeground(Color.GRAY);
        lblProrpietario.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));


        JLabel lblAuto = new JLabel();
        lblAuto.setFont(new Font("Tahoma", Font.PLAIN, 15));
        lblAuto.setForeground(Color.GRAY);
        lblAuto.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        JButton btnBack = new JButton("<--");
        btnBack.setFont(new Font("Tahoma", Font.PLAIN, 14));
        btnBack.setMargin(new Insets(0,0,0,0));
        btnBack.setAlignmentX(LEFT_ALIGNMENT);
        btnBack.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MenuFrame.main(new String[]{});
                frame.dispose();
            }
        });

        JButton btnOK = new JButton("OK");
        btnOK.setSize(24,24);
        btnOK.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Automobile auto = GestoreApp.getInstance().ricercaTarga(fldTarga.getText());
                    lblNome.setText("Nome : " + auto.getProprietario().getNome() + " " + auto.getProprietario()
                            .getCognome());
                    lblNascita.setText("Data di nascita : " + auto.getProprietario().getDataNascita());
                    lblPatente.setText("Numero Patente: " + auto.getProprietario().getNumeroPatente());

                    lblProrpietario.setText("--DETTAGLI PROPRIETARIO--");
                    lblAuto.setText("---DETTAGLI AUTO---");


                    lblProduttore.setText("Produttore : " + auto.getProduttore());
                    lblModello.setText("Modello : " + auto.getModello());
                    lblAllestimento.setText("Allestimento : " + auto.getAllestimento());
                    lblCilindrata.setText("Cilindrata : " + auto.getCilindrata());
                    lblPotenza.setText("Potenza : " + auto.getPotenza());
                    lblDataImmatricolazione.setText("Data di Immatricolazione: " + auto.getDataImmmatricolazione());


                } catch (TargaInesistenteException err) {
                    JOptionPane.showMessageDialog(CheckTargaGUI.this, err.getMessage(),"ERRORE TARGA!",
                            JOptionPane.ERROR_MESSAGE);
                    fldTarga.setText("");
                }
            }
        });



        contentPane.add(btnBack);
        contentPane.add(titleFrame);
        contentPane.add(lblTarga);
        contentPane.add(fldTarga);
        contentPane.add(btnOK);
        contentPane.add(lblProrpietario);
        contentPane.add(lblNome);
        contentPane.add(lblNascita);
        contentPane.add(lblPatente);
        contentPane.add(lblAuto);
        contentPane.add(lblProduttore);
        contentPane.add(lblModello);
        contentPane.add(lblAllestimento);
        contentPane.add(lblCilindrata);
        contentPane.add(lblPotenza);
        contentPane.add(lblDataImmatricolazione);















        this.setVisible(true);

    }


}
