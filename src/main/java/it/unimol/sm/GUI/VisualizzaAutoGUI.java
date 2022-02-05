package it.unimol.sm.GUI;

import it.unimol.sm.app.GestoreApp;
import it.unimol.sm.app.automobile.Automobile;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VisualizzaAutoGUI extends JFrame {

    static VisualizzaAutoGUI frame;
    private JPanel contentPane;


    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {

                frame = new VisualizzaAutoGUI();
                frame.setVisible(true);

            }
        });
    }


    public VisualizzaAutoGUI() {

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 500, 550);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        String[][] data = new String[GestoreApp.getInstance().getListAutomobili().size()][3];

        for (int i = 0; i < GestoreApp.getInstance().getListAutomobili().size(); i++) {
            data[i][0] = GestoreApp.getInstance().getListAutomobili().get(i).getTarga();
            data[i][1] = GestoreApp.getInstance().getListAutomobili().get(i).getProduttore();
            data[i][2] = GestoreApp.getInstance().getListAutomobili().get(i).getProprietario().getNumeroPatente();
        }


        String[] columnNames = {"TAGRA", "PRODUTTORE", "N° PATENTE"};
        JTable j;

        j = new JTable(data, columnNames);
        j.setCellSelectionEnabled(false);
        j.setModel(new DefaultTableModel(data, columnNames) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        });
        j.setFont(new Font("Tahoma", Font.PLAIN, 15));
        // j.setSize(200, 300);

        JScrollPane sp = new JScrollPane(j);

        JButton btnBack = new JButton("INDIETRO");
        btnBack.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MenuFrame.main(new String[]{});
                frame.dispose();
            }
        });

        contentPane.add(sp);
        contentPane.add(btnBack);

    }


}
