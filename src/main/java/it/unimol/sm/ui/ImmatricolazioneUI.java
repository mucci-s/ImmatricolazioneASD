package it.unimol.sm.ui;

import it.unimol.sm.app.GestoreApp;
import it.unimol.sm.app.automobile.Automobile;
import it.unimol.sm.app.proprietario.DataFormatException;
import it.unimol.sm.app.proprietario.Proprietario;

public class ImmatricolazioneUI extends UI{

    public ImmatricolazioneUI() {

    }



    @Override
    public void esegui() {

        System.out.println("\n\t----IMMATRICOLAZIONE----");
        System.out.println(">>Inserisci dati automobile");
        System.out.println("Inserisci produttore: ");
        String produttore = this.inputString();
        System.out.println("Inserisci modello: ");
        String modello= this.inputString();
        System.out.println("Inserisci allestimento: ");
        String allestimento = this.inputString();
        System.out.println("Inserisci cilindrata: ");
        String cilindrata = this.inputString();
        System.out.println("Inserisci potenza: ");
        String potenza = this.inputString();


        try{
            System.out.println(">>Inserisci dati proprietario");
            System.out.println("Inserisci nome: ");
            String nome = this.inputString();
            System.out.println("Inserisci cognome: ");
            String cognome = this.inputString();
            System.out.println("Inserisci data di nascita (dd/mm/aaaa): ");
            String dataNascita = this.inputString();
            System.out.println("Inserisci numero patente: ");
            String nPatente = this.inputString();

            Proprietario proprietario = new Proprietario(nome,cognome,dataNascita,nPatente);

            GestoreApp.getInstance().immatricolaAuto(
                    new Automobile(produttore,modello,allestimento,cilindrata,potenza,proprietario));

        }catch (DataFormatException e){
            System.out.println("Errore: " + e.getMessage());
        }
    }

}
