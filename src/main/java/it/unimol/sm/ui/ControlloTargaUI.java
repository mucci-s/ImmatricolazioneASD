package it.unimol.sm.ui;

import it.unimol.sm.app.GestoreApp;
import it.unimol.sm.app.TargaInesistenteException;
import it.unimol.sm.app.automobile.Automobile;

public class ControlloTargaUI extends UI {
    @Override
    public void esegui() {
        System.out.println("\n\t----VISUALIZZA INFO AUTO----");
        System.out.print(">>Inserisci targa auto: ");
        String targa = this.inputString();

        try {
            Automobile auto = GestoreApp.getInstance().ricercaTarga(targa);
            System.out.println(auto.toString());
        } catch (TargaInesistenteException e) {
            System.out.println("Errore: " + e.getMessage());
        }


    }
}
