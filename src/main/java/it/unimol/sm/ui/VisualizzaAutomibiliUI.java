package it.unimol.sm.ui;

import it.unimol.sm.app.GestoreApp;
import it.unimol.sm.app.automobile.Automobile;

public class VisualizzaAutomibiliUI extends UI {
    @Override
    public void esegui() {
        System.out.println("\n\t----AUTOMOBILI----");
        for (Automobile a : GestoreApp.getInstance().getListAutomobili()) {
            System.out.println(a.getTarga() + ",\t " + a.getProduttore() + ",\t" + a.getProprietario().getNumeroPatente());
        }
    }
}
